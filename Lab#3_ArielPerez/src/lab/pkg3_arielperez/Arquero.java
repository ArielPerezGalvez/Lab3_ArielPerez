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
public class Arquero extends Personajes_Aliados {
    private String a="";
    public Arquero(int suerte, String nombre, int edad, double estatura, double peso, String colorp, String raza, int hp, int ad, int eficacia, int critico, int velocidad) {
        super(suerte, nombre, edad, estatura, peso, colorp, raza, hp, ad, eficacia, critico, velocidad);
        this.setHp(150);
        this.setAd(50);
        this.setEficacia(85);
        this.setCritico(60);
        this.setSuerte(20);
        this.setVelocidad(15);
        System.out.println("SOMOS LOS ARQUEROS");
        System.out.println("A LANZAR!!!");
        a ="LAAAALLLL";
        System.out.println(a);
        System.out.println("Consigue tu arcol l) ---->");
    }
    
    
}//fin de la clase
