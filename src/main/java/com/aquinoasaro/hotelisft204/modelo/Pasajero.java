 
package com.aquinoasaro.hotelisft204.modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PASAJERO")
public class Pasajero implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String apellido;
    
    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false, unique = true)
    private double documento;
    
    @Column(nullable = false)
    private double telefono;
    
    @Column(name = "correo_electronico")
    private String correoElectronico;
    
    @OneToMany(mappedBy = "pasajero", cascade = CascadeType.ALL)
    private List<Reserva> reservas = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "habitacion_id")
    private Habitacion habita;

    // Constructor vacío
    public Pasajero() {
    }

    // Constructor con parámetros
    public Pasajero(String apellido, String nombre, double documento, double telefono, String correoElectronico) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    // Getters y Setters
    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Habitacion getHabita() {
        return habita;
    }

    public void setHabita(Habitacion habita) {
        this.habita = habita;
    }

    // Métodos equals y hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.apellido);
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.documento) ^ (Double.doubleToLongBits(this.documento) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.telefono) ^ (Double.doubleToLongBits(this.telefono) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.correoElectronico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pasajero other = (Pasajero) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.documento) != Double.doubleToLongBits(other.documento)) {
            return false;
        }
        if (Double.doubleToLongBits(this.telefono) != Double.doubleToLongBits(other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.correoElectronico, other.correoElectronico);
    }

    // Método toString
    @Override
    public String toString() {
        return "Pasajero{" + 
               "id=" + id + 
               ", apellido=" + apellido + 
               ", nombre=" + nombre + 
               ", documento=" + documento + 
               ", telefono=" + telefono + 
               ", correoElectronico=" + correoElectronico + 
               '}';
    }
}