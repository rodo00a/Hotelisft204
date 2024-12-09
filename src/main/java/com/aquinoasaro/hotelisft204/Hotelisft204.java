package com.aquinoasaro.hotelisft204;

import com.aquinoasaro.hotelisft204.modelo.Controlador;
import com.aquinoasaro.hotelisft204.modelo.Pasajero;
import com.aquinoasaro.hotelisft204.persistence.ControladorPersistencia;
import com.aquinoasaro.hotelisft204.persistence.exceptions.PreexistingEntityException;
import com.aquinoasaro.hotelisft204.vista.IngresoVista;

public class Hotelisft204 {

    public static void main(String[] args) throws PreexistingEntityException { 
    // ControladorPersistencia controlPers = new ControladorPersistencia();

     IngresoVista princ = new IngresoVista();
     princ.setVisible(true);
     princ.setLocationRelativeTo(null);
      


    }

}