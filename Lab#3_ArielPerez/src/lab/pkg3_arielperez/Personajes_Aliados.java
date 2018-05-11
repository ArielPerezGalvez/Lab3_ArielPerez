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
public class Personajes_Aliados extends Jugador{
    private int suerte;
    public Personajes_Aliados(int suerte, String nombre, int edad, double estatura, double peso, String colorp, String raza, int hp, int ad, int eficacia, int critico, int velocidad) {
        super(nombre, edad, estatura, peso, colorp, raza, hp, ad, eficacia, critico, velocidad);
        this.suerte = suerte;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }
    
    
    
    
    
}//fin de la clase aliados
