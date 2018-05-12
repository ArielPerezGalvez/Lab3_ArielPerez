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
public class Jugador {

    private String nombre;
    private int edad;
    private double estatura;
    private double peso;
    private String colorpiel;
    private String raza;
    private int hp;
    private int ad;
    private int eficacia;
    private int critico;
    private int velocidad;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, double estatura, double peso, String colorp, String raza, int hp, int ad, int eficacia, int critico, int velocidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.colorpiel = colorp;
        this.raza = raza;
        this.hp = hp;
        this.ad = ad;
        this.eficacia = eficacia;
        this.critico = critico;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColorp() {
        return colorpiel;
    }

    public void setColorp(String colorp) {
        this.colorpiel = colorp;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }

    public int getCritico() {
        return critico;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + ", colorpiel=" + colorpiel + ", raza=" + raza + ", hp=" + hp + ", ad=" + ad + ", eficacia=" + eficacia + ", critico=" + critico + ", velocidad=" + velocidad + '}';
    }

}//fin de la clase jugadors
