/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2_clase9grupo2;

/**
 *
 * @author Usuario
 */
public class Padre {
    
    public int edad;
    String nombre;
    String apellido;
    private char genero;
    
    public void saludar(String aQuienSaludo){
            System.out.println("Hola "+aQuienSaludo+
                    ", mi nombre es "+this.nombre+" "+this.apellido );
    }
    
    public int getEdad(){
        return this.edad;
    }
    
}
