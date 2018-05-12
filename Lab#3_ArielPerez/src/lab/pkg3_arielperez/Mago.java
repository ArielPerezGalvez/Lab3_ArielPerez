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
public class Mago extends Personajes_Aliados {

    private String grito = "";
    private int ap;

    public Mago(int suerte, String nombre, int edad, double estatura, double peso, String colorp, String raza, int hp, int ap, int ad, int eficacia, int critico, int velocidad) {
        super(suerte, nombre, edad, estatura, peso, colorp, raza, hp, ad, eficacia, critico, velocidad);
        this.setHp(120);
        this.setAp(50);
        this.setAd(50);
        this.setEficacia(70);
        this.setCritico(2);
        this.setSuerte(20);
        this.setVelocidad(10);
        System.out.println("SOMOS LOS MAGOS");
        System.out.println("CUAL ES NUESTRA PROFESION!!!!");
        grito = "RRRRAAAR";
        System.out.println("GET READY FOR THE FIGHT!!!");
        System.out.println(grito);
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

}//fin de la clase
