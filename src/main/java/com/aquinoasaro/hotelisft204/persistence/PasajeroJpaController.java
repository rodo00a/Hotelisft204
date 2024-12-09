package com.aquinoasaro.hotelisft204.persistence;

import com.aquinoasaro.hotelisft204.modelo.Habitacion;
import com.aquinoasaro.hotelisft204.modelo.Pasajero;
import com.aquinoasaro.hotelisft204.persistence.exceptions.NonexistentEntityException;
import com.aquinoasaro.hotelisft204.persistence.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class PasajeroJpaController implements Serializable {
    
    private EntityManagerFactory emf = null;
    
    public PasajeroJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public PasajeroJpaController() {
        emf = Persistence.createEntityManagerFactory("HotelPU");
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    // Nuevo método para validar correo electrónico
    private boolean validarCorreoElectronico(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }
    
    // Nuevo método para buscar por documento
    public Pasajero findPasajeroByDocumento(double documento) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT p FROM Pasajero p WHERE p.documento = :documento");
            q.setParameter("documento", documento);
            return (Pasajero) q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    public void create(Pasajero pasajero) throws PreexistingEntityException {
        if (pasajero.getReservas() == null) {
            pasajero.setReservas(new ArrayList<>());
        }
        
        // Validar documento único
        if (findPasajeroByDocumento(pasajero.getDocumento()) != null) {
            throw new PreexistingEntityException("Ya existe un pasajero con ese documento");
        }
        
        // Validar formato de correo electrónico
        if (!validarCorreoElectronico(pasajero.getCorreoElectronico())) {
            throw new IllegalArgumentException("El formato del correo electrónico no es válido");
        }
        
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Habitacion habita = pasajero.getHabita();
            if (habita != null) {
                habita = em.getReference(Habitacion.class, habita.getId());
                pasajero.setHabita(habita);
            }
            em.persist(pasajero);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw new PreexistingEntityException("Error al crear el pasajero: " + ex.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pasajero pasajero) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            // Validar formato de correo electrónico si se está actualizando
            if (!validarCorreoElectronico(pasajero.getCorreoElectronico())) {
                throw new IllegalArgumentException("El formato del correo electrónico no es válido");
            }
            
            em = getEntityManager();
            em.getTransaction().begin();
            
            Habitacion habita = pasajero.getHabita();
            if (habita != null) {
                habita = em.getReference(Habitacion.class, habita.getId());
                pasajero.setHabita(habita);
            }
            
            pasajero = em.merge(pasajero);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pasajero.getId();
                if (findPasajero(id) == null) {
                    throw new NonexistentEntityException("El pasajero con id " + id + " no existe.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pasajero pasajero;
            try {
                pasajero = em.getReference(Pasajero.class, id);
                pasajero.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El pasajero con id " + id + " no existe.", enfe);
            }
            
            Habitacion habita = pasajero.getHabita();
            if (habita != null) {
                habita.setEstado(false); // Liberar la habitación
                em.merge(habita);
            }
            
            em.remove(pasajero);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pasajero> findPasajeroEntities() {
        return findPasajeroEntities(true, -1, -1);
    }

    public List<Pasajero> findPasajeroEntities(int maxResults, int firstResult) {
        return findPasajeroEntities(false, maxResults, firstResult);
    }
  
    private List<Pasajero> findPasajeroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pasajero.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Pasajero findPasajero(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pasajero.class, id);
        } finally {
            em.close();
        }
    }

    public int getPasajeroCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pasajero> rt = cq.from(Pasajero.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}