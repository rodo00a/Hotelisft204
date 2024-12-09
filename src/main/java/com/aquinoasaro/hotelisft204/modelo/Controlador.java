 
package com.aquinoasaro.hotelisft204.modelo;

import com.aquinoasaro.hotelisft204.persistence.ControladorPersistencia;
import com.aquinoasaro.hotelisft204.persistence.exceptions.NonexistentEntityException;
import com.aquinoasaro.hotelisft204.persistence.exceptions.PreexistingEntityException;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    
    ControladorPersistencia ControlPers = new ControladorPersistencia();
    
    //Pasajero

    public void crearPasajero (Pasajero pasajero) throws PreexistingEntityException {
        ControlPers.crearPasajero(pasajero);    
    }
    
    public void eliminarPasajero(int id) {
        ControlPers.eliminarPasajero(id);
    }    
    public void editarPasajero (Pasajero pasajero){
        ControlPers.editarPasajero(pasajero);
    
    }
    
    public Pasajero traerPasajero(int id) {
        return ControlPers.traerPasajero(id);
    }
    
    public ArrayList<Pasajero> traerListaPasajero () {
           return ControlPers.traerListaPasajero();
       }
    // Habitacion
    
       public void crearHabitacion (Habitacion habitacion) throws PreexistingEntityException {
        ControlPers.crearHabitacion(habitacion);    
    }
    
    public void eliminarHabitacion(int id) throws NonexistentEntityException {
        ControlPers.eliminarHabitacion(id);
    }    
    public void editarHabitacion (Habitacion habitacion){
        ControlPers.editarHabitacion(habitacion);
    
    }
    
    public Habitacion traerHabitacion(int id) {
        return ControlPers.traerHabitacion(id);
    }
    
    public ArrayList<Habitacion> traerListaHabitacion () {
           return ControlPers.traerListaHabitacion();
       }
    // Reserva
    
    public void crearReserva(Reserva reserva) throws PreexistingEntityException {
    ControlPers.crearReserva(reserva);    
}

    public void eliminarReserva(int id) throws NonexistentEntityException {
    ControlPers.eliminarReserva(id);
}    

    public void editarReserva(Reserva reserva) throws Exception {
    ControlPers.editarReserva(reserva);
}

    public Reserva traerReserva(int id) {
    return ControlPers.traerReserva(id);
}

    public ArrayList<Reserva> traerListaReserva() {
    return ControlPers.traerListaReserva();
}

    public void crearPasajero(String apellido, String nombre, double documento, double telefono, String CorreoElectronico) throws PreexistingEntityException {
        Pasajero pasajero = new Pasajero();
        pasajero.setApellido(apellido);
        pasajero.setNombre(nombre);
        pasajero.setDocumento(documento);
        pasajero.setTelefono(telefono);
        pasajero.setCorreoElectronico(CorreoElectronico);
    
        ControlPers.crearPasajero(pasajero);
}



    public void crearHabitacion(int numero,  int camasSimples, int camasDobles, double precio, boolean estado) {
       Habitacion habitacion = new Habitacion();
       
       habitacion.setNumero(numero);
       habitacion.setCamasSingle(camasSimples);
       habitacion.setCamasDobles(camasDobles);
       habitacion.setPrecio(precio);
       habitacion.setEstado(estado);
               
    }

   
    public List<Habitacion> traerHabs() {
        
        return ControlPers.traerListaHabitacion();
    }

    public void borrarHabitacion(int Id) {
        ControlPers.borrarHabitacion(Id);
        
    }

   
}