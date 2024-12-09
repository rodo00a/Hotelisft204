
package com.aquinoasaro.hotelisft204.persistence;

import com.aquinoasaro.hotelisft204.modelo.Habitacion;
import com.aquinoasaro.hotelisft204.modelo.Pasajero;
import com.aquinoasaro.hotelisft204.modelo.Reserva;
import com.aquinoasaro.hotelisft204.persistence.exceptions.NonexistentEntityException;
import com.aquinoasaro.hotelisft204.persistence.exceptions.PreexistingEntityException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ControladorPersistencia {
    
    // Instancias de Persistencia del controlador para las clases
    private PasajeroJpaController pasajeroJpa = new PasajeroJpaController();
    private HabitacionJpaController habitacionJpa = new HabitacionJpaController();
    private ReservaJpaController reservaJpa = new ReservaJpaController();
    
    // Nuevo método para buscar habitaciones disponibles
    public List<Habitacion> buscarHabitacionesDisponibles(Date fechaIngreso, Date fechaSalida) {
        List<Habitacion> todasHabitaciones = habitacionJpa.findHabitacionEntities();
        return todasHabitaciones.stream()
                .filter(h -> h.isDisponible(fechaIngreso, fechaSalida))
                .collect(Collectors.toList());
    }
    
    // Metodo que modifque para crear reserva con  las validaciones ( no las tenia )
    //////// aca tenia un @Override verificar
    public void crearReserva(Reserva reserva) throws PreexistingEntityException {
        try {
            // Validar disponibilidad antes de crear
            if (!reserva.getHabitacion().isDisponible(
                    reserva.getFechaIngreso(), 
                    reserva.getFechaSalida())) {
                throw new PreexistingEntityException("La habitación no está disponible para la fehca que elegiste");
            }
            
            // Validar que la seña sea válida (mínimo 10% del total)
            //double costoTotal = reserva.calcularCostoTotal();
            //if (reserva.getMontoSenia() < (costoTotal * 0.1)) {
                //throw new IllegalArgumentException("La seña debe ser al menos el 10% del total");
            //}
            
            reservaJpa.create(reserva);
            
            // Actualizar estado de la habitación
            Habitacion habitacion = reserva.getHabitacion();
            habitacion.setEstado(false); // ocupada
            habitacionJpa.edit(habitacion);
        } catch (Exception ex) {
            throw new PreexistingEntityException("Error al crear la reserva: " + ex.getMessage());
        }
    }
    
    // Métodos CRUD para Pasajero
    public void crearPasajero(Pasajero pasajero) throws PreexistingEntityException {
        pasajeroJpa.create(pasajero);
        
        
        
    }
    
    public void eliminarPasajero(int id) {
        try {
            pasajeroJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarPasajero(Pasajero pasajero) {
        try {
            pasajeroJpa.edit(pasajero);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Pasajero traerPasajero(int id) {
        return pasajeroJpa.findPasajero(id);
    }
    
    public ArrayList<Pasajero> traerListaPasajero() {
        List<Pasajero> listaP = pasajeroJpa.findPasajeroEntities();
        return new ArrayList<>(listaP);
    }
    
    // Métodos CRUD para Habitacion
    public void crearHabitacion(Habitacion habitacion) throws PreexistingEntityException {
        habitacionJpa.create(habitacion);
    }
    
    public void eliminarHabitacion(int id) {
        try {
            habitacionJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarHabitacion(Habitacion habitacion) {
        try {
            habitacionJpa.edit(habitacion);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Habitacion traerHabitacion(int id) {
        return habitacionJpa.findHabitacion(id);
    }
    
    public ArrayList<Habitacion> traerListaHabitacion() {
        List<Habitacion> listaH = habitacionJpa.findHabitacionEntities();
        return new ArrayList<>(listaH);
    }
    
    // Métodos CRUD para Reserva 
    public void eliminarReserva(int id) throws NonexistentEntityException {
        try {
            reservaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarReserva(Reserva reserva) throws Exception {
        try {
            reservaJpa.edit(reserva);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Reserva traerReserva(int id) {
        return reservaJpa.findReserva(id);
    }
    
    public ArrayList<Reserva> traerListaReserva() {
        List<Reserva> listaR = reservaJpa.findReservaEntities();
        return new ArrayList<>(listaR);
    }

    public List<Habitacion> traerHabs() {
        return habitacionJpa.findHabitacionEntities();
    }

    public void borrarHabitacion(int Id) {
        try {
            habitacionJpa.destroy(Id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
   
}