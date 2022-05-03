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
public interface Animal {

    final String ERROR_1 = "ERROR 1: Problema de lectora de la DB, no hay conexion";

    public void sonidoAnimal();/*metodo de interfaz
                        (prototipo, no tiene cuerpo)*/

    public void dormir();/*metodo de interfaz
                        (prototipo, no tiene cuerpo)*/

    public void comer();

    public default void salida () {
        System.out.println("Salir");
    }

}
