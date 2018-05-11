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
public class Bruja extends Personaje_Enemigo {

    Random ran = new Random();
    private int ap;

    public Bruja(String nombre, int edad, double estatura, double peso, String colorp, String raza, int hp, int ap, int ad, int eficacia, int critico, int velocidad) {
        super(nombre, edad, estatura, peso, colorp, raza, hp, ad, eficacia, critico, velocidad);
        this.setHp(60 + ran.nextInt(80));
        this.setAp(20 + ran.nextInt(40));
        this.setAd(5 + ran.nextInt(10));
        this.setEficacia(1);
        this.setVelocidad(3 + ran.nextInt(7));
        this.setNombre("Bruja");
        
    }
    
    public int getAp() {
        return ap;
    }
    
    public void setAp(int ap) {
        this.ap = ap;
    }
    
}//fin de la clase
