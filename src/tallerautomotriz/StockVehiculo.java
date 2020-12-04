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
public class StockVehiculo extends AgregarVehiculo {
      public int n;
    public int limit=0;
      ArrayList carros=new ArrayList();

    public StockVehiculo(ArrayList vehiculo) {
        super(vehiculo);
    }

    @Override
    public void IngresarVehiculo(String vehiculos) {
        super.vehiculo.add(vehiculos);
        
    }

    @Override
    public void ComprarVehiculo(String vehiculos) {
       super.vehiculo.remove(super.vehiculo.indexOf(vehiculos));  
     /* boolean eliminado = false;
        int n=carros.size();
         Vehiculotmp;
        for(int i=0;i<=(n-1);i++){
            tmp=null;
            tmp=alimentos.get(i);
            if(tmp.nombre.compareTo(alimento)==0)
            {
                alimentos.remove(i);
                eliminado = true;
              break;  
            }
         
        }
           return eliminado; 
        */
    }
    
    public String MostrarVehiculo(String vehiculos){
     String buscarvehiculo = "";
     if (super.vehiculo.contains(vehiculos)== true) {
         buscarvehiculo = super.vehiculo.get(super.vehiculo.indexOf(vehiculos)).toString();
              } else {
         buscarvehiculo = "El Anterior Vehiculo ya fue comprado";
             }
     return buscarvehiculo;
    }
}
