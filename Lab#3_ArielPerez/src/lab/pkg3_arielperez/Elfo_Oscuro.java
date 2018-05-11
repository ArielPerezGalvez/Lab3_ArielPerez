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
public class Elfo_Oscuro extends Personaje_Enemigo {
    
    Random ran = new Random();
    
    public Elfo_Oscuro(String nombre, int edad, double estatura, double peso, String colorp, String raza, int hp, int ad, int eficacia, int critico, int velocidad) {
        super(nombre, edad, estatura, peso, colorp, raza, hp, ad, eficacia, critico, velocidad);
        this.setHp(60 + ran.nextInt(120));
        this.setAd(30 + ran.nextInt(50));
        this.setEficacia(50 + ran.nextInt(70));
        this.setCritico(0 + ran.nextInt(100));
        this.setVelocidad(20);
        this.setNombre("Elfo Oscuro");
    }
    
}//fin de la clase 
