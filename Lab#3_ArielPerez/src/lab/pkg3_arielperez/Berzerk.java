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
public class Berzerk extends Personajes_Aliados{

    public Berzerk(int suerte, String nombre, int edad, double estatura, double peso, String colorp, String raza, int hp, int ad, int eficacia, int critico, int velocidad) {
        super(suerte, nombre, edad, estatura, peso, colorp, raza, hp, ad, eficacia, critico, velocidad);
        this.setHp(190);
        this.setAd(80);
        this.setEficacia(80);
        this.setCritico(30);
        this.setSuerte(15);
        this.setVelocidad(20);
    }

    
    
    
}//fin de la clase
