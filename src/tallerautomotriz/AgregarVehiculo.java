/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;
import java.util.ArrayList;

/**
 *
 * @author Jonathan Leony
 */
public abstract  class AgregarVehiculo {
   ArrayList vehiculo;
   public AgregarVehiculo(ArrayList vehiculo) {
       this.vehiculo = vehiculo;
   }

    public ArrayList getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList vehiculo) {
        this.vehiculo = vehiculo;
    }
   public abstract void IngresarVehiculo(String vehiculos);
   public abstract void ComprarVehiculo (String vehiculos);
   
    
   
    
    


}