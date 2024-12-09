package com.aquinoasaro.hotelisft204.modelo;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Habitacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private int numero;
    private int camasSingle;
    private int camasDobles;
    private double precio;
    private boolean estado;
    
    @OneToMany(mappedBy = "habitacion", cascade = CascadeType.ALL)
    private List<Reserva> reservas = new ArrayList<>();

    public Habitacion() {
    }

    public Habitacion(int id, int numero, int camasSingle, int camasDobles, double precio, boolean estado) {
        this.id = id;
        this.numero = numero;
        this.camasSingle = camasSingle;
        this.camasDobles = camasDobles;
        this.precio = precio;
        this.estado = estado;
    }

    public boolean isDisponible(Date fechaInicio, Date fechaFin) {
        return reservas.stream().noneMatch(reserva -> 
            (fechaInicio.before(reserva.getFechaSalida()) && 
             fechaFin.after(reserva.getFechaIngreso())));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCamasSingle() {
        return camasSingle;
    }

    public void setCamasSingle(int camasSingle) {
        this.camasSingle = camasSingle;
    }

    public int getCamasDobles() {
        return camasDobles;
    }

    public void setCamasDobles(int camasDobles) {
        this.camasDobles = camasDobles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + this.numero;
        hash = 89 * hash + this.camasSingle;
        hash = 89 * hash + this.camasDobles;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
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
        final Habitacion other = (Habitacion) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.camasSingle != other.camasSingle) {
            return false;
        }
        if (this.camasDobles != other.camasDobles) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        return this.estado == other.estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "id=" + id + ", numero=" + numero + ", camasSingle=" + camasSingle + ", camasDobles=" + camasDobles + ", precio=" + precio + ", estado=" + estado + '}';
    }

    void setReserva(Reserva reserva) {
       
    }
}