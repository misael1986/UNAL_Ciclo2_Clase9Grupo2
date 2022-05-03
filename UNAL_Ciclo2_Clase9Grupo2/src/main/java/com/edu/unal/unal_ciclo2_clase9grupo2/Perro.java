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
class Perro implements Animal {

    @Override
    public void sonidoAnimal() {//Cuerpo de sonido Animal()
        System.out.println("El perrohace:wowwow");
    }

    @Override
    public void dormir() {//Cuerpo de dormir()
        System.out.println("Zzz");
    }
    
    public void comer(){
        System.out.println("ñam ñan");
        System.out.println(ERROR_1);
        int i=0;
    }
}
