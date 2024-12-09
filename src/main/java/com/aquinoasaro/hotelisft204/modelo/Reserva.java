  
package com.aquinoasaro.hotelisft204.modelo;

import java.io.Serializable;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserva implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pasajero_id")
    private Pasajero pasajero;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "habitacion_id")
    private Habitacion habitacion;*/
    
    @ManyToOne
    @JoinColumn(name = "habitacion_id", nullable = false)
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn(name = "pasajero_id", nullable = false)
    private Pasajero pasajero;
    
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    
    @Temporal(TemporalType.DATE)
    private Date fechaSalida;
    
    private double montoSenia;
    private boolean estado; // true = activa, false = finalizada
    
    public Reserva() {
    }

    public Reserva(int id, Pasajero pasajero, Habitacion habitacion, Date fechaIngreso, Date fechaSalida, double montoSenia, boolean estado) {
        this.id = id;
        this.pasajero = pasajero;
        this.habitacion = habitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.montoSenia = montoSenia;
        this.estado = estado;
    }

    public double calcularCostoTotal() {
        long dias = ChronoUnit.DAYS.between(
            fechaIngreso.toInstant(),
            fechaSalida.toInstant());
        return habitacion.getPrecio() * dias;
    }

    @PrePersist
    @PreUpdate
    private void validarFechas() {
        if (fechaIngreso.after(fechaSalida)) {
            throw new IllegalStateException("La fecha de ingreso no puede ser posterior a la fecha de salida");
        }
        if (!habitacion.isDisponible(fechaIngreso, fechaSalida)) {
            throw new IllegalStateException("La habitación no está disponible para las fechas seleccionadas");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getMontoSenia() {
        return montoSenia;
    }

    public void setMontoSenia(double montoSenia) {
        this.montoSenia = montoSenia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.pasajero);
        hash = 89 * hash + Objects.hashCode(this.habitacion);
        hash = 89 * hash + Objects.hashCode(this.fechaIngreso);
        hash = 89 * hash + Objects.hashCode(this.fechaSalida);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.montoSenia) ^ (Double.doubleToLongBits(this.montoSenia) >>> 32));
        hash = 89 * hash + (this.estado ? 1 : 0);
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
        final Reserva other = (Reserva) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.montoSenia) != Double.doubleToLongBits(other.montoSenia)) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.pasajero, other.pasajero)) {
            return false;
        }
        if (!Objects.equals(this.habitacion, other.habitacion)) {
            return false;
        }
        if (!Objects.equals(this.fechaIngreso, other.fechaIngreso)) {
            return false;
        }
        return Objects.equals(this.fechaSalida, other.fechaSalida);
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + 
               ", pasajero=" + pasajero.getNombre() + " " + pasajero.getApellido() +
               ", habitacion=" + habitacion.getNumero() +
               ", fechaIngreso=" + fechaIngreso + 
               ", fechaSalida=" + fechaSalida + 
               ", montoSenia=" + montoSenia + 
               ", estado=" + estado + '}';
    }

}