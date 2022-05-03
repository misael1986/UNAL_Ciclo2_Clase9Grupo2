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
public class NewMain {

    static final double PICUADRADO=Math.PI;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Padre p= new Padre();
        p.nombre="Eduardo";
        p.apellido="Suarez";
        
        Hijo h1= new Hijo();
        h1.nombre="Juan";
        h1.apellido="Perez";
        h1.saludar("Hector");
        h1.esMayorEdad();
        
        System.out.println(p.getClass());
        Object cosa= p;
        Padre p2= (Padre)cosa;//Se puede traten de no hacerlo
        System.out.println("P2=" +p2.getClass()+"\n"+p2.apellido);
        

    }
    
}
