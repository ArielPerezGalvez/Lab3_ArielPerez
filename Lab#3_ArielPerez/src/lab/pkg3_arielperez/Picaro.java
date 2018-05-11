/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_arielperez;

/**
 *
 * @author ariel
 */
public class Picaro extends Personajes_Aliados {
    
    public Picaro(int suerte, String nombre, int edad, double estatura, double peso, String colorp, String raza, int hp, int ad, int eficacia, int critico, int velocidad) {
        super(suerte, nombre, edad, estatura, peso, colorp, raza, hp, ad, eficacia, critico, velocidad);
        this.setHp(150);
        this.setAd(55);
        this.setEficacia(85);
        this.setCritico(60);
        this.setSuerte(50);
        this.setVelocidad(30);
    }
    
}//fin de la clase 
