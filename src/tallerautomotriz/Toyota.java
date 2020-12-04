/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

/**
 *
 * @author Jonathan Leony
 */
public class Toyota implements LineasToyota {

    @Override
    public String familiar() {
        String siena = "Soy el Toyota Siena";
        return siena;
    }

   public String deportivo() {
       String celica = "Soy el Toyota Celica";
       return celica;
   }
   
   public String todoterreno(){
       String hilux = "Soy el Toyota Hilux";
       return hilux;
   }
}