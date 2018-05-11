/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_arielperez;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Lab3_ArielPerez {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char resp = 's';
        do {
            switch (menu()) {
                case 1:
                    //iniciar la batalla con los personajes
                    switch (personaje()) {
                        case 1:
                            
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("ese personaje no esta en la lista");
                    }//fin del switch

                    break;
                case 2:
                    //nivel de dificultad
                    nivel();
                    break;
                case 3:
                    //salir de las opciones del juego
                    System.out.println("perro");
                    break;
                default:
                    System.out.println("hola perros");
            }//fin del switch
            System.out.println("Desea volver a empezar el juego");
            resp = leer.next().charAt(0);
        } while (resp == 's' || resp == 'S');

    }//fin del main

    static int menu() {
        int opcion;
        System.out.println("Bienvenido al juego DEV & DUNGEON");
        System.out.println("-------------------------------------");
        System.out.println("1.Iniciar");
        System.out.println("2.Nivel de dificultad");
        System.out.println("3.Salir");
        System.out.println("----------------");
        opcion = leer.nextInt();
        return opcion;
    }//fin del metodo del menu

    static void nivel() {
        switch (menunivel()) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Ha seleccionado algo incorrecto");
        }//fin del switch

    }//fin del metodo de nivel de dificultidad

    static int menunivel() {
        int opcion;
        System.out.println("Bienvenido al menu de dificultad");
        System.out.println("1.Dificultad facil");
        System.out.println("2.Dificultad Media");
        System.out.println("3.Dificultad Extrema");
        System.out.println("-------------------------");
        System.out.println("Ingrese una opcion:");
        opcion = leer.nextInt();
        return opcion;
    }//menu de las opciones de los niveles

    static int personaje() {
        int op;
        System.out.println("Bienvenido a la creacion del personaje:");
        System.out.println("Elija uno de las categotrias");
        System.out.println("-----------------");
        System.out.println("1.Mago");
        System.out.println("2.Berzerk");
        System.out.println("3.Picaro");
        System.out.println("4.Arquero");
        System.out.println("-----------------");
        op = leer.nextInt();
        return op;
    }//menu de opciones para el menu del personaje

}//fin de la clase
