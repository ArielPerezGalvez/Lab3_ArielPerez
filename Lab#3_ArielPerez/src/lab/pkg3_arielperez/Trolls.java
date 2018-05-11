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
public class Trolls extends Personaje_Enemigo {
    Random ran = new Random();
    public Trolls(String nombre, int edad, double estatura, double peso, String colorp, String raza, int hp, int ad, int eficacia, int critico, int velocidad) {
        super(nombre, edad, estatura, peso, colorp, raza, hp, ad, eficacia, critico, velocidad);
        this.setHp(50+ran.nextInt(80));
        this.setAd(30+ran.nextInt(50));
        this.setEficacia(50+ran.nextInt(65));
        this.setCritico(15+ran.nextInt(20));
        this.setVelocidad(10);
        this.setNombre("Troll");
        
    }
    
    
    
}//fin de la clase
