/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

public class Total{
   public int cantidad;
    public float precio;
     public float resultado;

    public Total(float resultado) {
        this.resultado = resultado;
        
    }

    public Total(int cantidad, float precio) {
        this.cantidad = cantidad;
        this.precio = precio;
        resultado = cantidad * precio;
    }
    
    
    
    
    
        
     }

   
