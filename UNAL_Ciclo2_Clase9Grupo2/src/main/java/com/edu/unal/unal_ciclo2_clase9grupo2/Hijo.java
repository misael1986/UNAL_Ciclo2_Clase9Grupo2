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
public class Hijo extends Padre{

    public boolean esMayorEdad(){
    boolean mayor=false;
    if (this.edad>=18) mayor=true;
    return mayor;
    }
    
}
