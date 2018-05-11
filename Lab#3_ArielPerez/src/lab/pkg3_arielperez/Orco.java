/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_arielperez;

import java.util.Random;

/**
 *
 * @author ariel
 */
public class Orco extends Personaje_Enemigo {

    Random ran = new Random();

    public Orco(String nombre, int edad, double estatura, double peso, String colorp, String raza, int hp, int ad, int eficacia, int critico, int velocidad) {
        super(nombre, edad, estatura, peso, colorp, raza, hp, ad, eficacia, critico, velocidad);
        this.setHp(70 + ran.nextInt(90));
        this.setAd(30 + ran.nextInt(45));
        this.setEficacia(20 + ran.nextInt(50));
        this.setCritico(60);
        this.setVelocidad(20);
        this.setNombre("Orco");
    }

//    
}//fin de la clase
