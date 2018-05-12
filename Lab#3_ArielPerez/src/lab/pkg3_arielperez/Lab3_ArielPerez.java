/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_arielperez;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ariel
 */
public class Lab3_ArielPerez {

    static Scanner leer = new Scanner(System.in);
    static Random ran = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char resp = 's';
        do {
            Jugador e = new Jugador();
            switch (menu()) {
                case 1:
                    //iniciar la batalla con los personajes
                    switch (personaje()) {
                        case 1:
                            int d = 0;
                            String a = "";
                            e = new Mago(d, a, d, d, d, a, a, d, d, d, d, d, d);
                            break;
                        case 2:
                            int b = 0;
                            String c = "";
                            e = new Berzerk(b, c, b, b, b, c, c, b, b, b, b, b);
                            break;
                        case 3:
                            int s = 0;
                            String p = "";
                            e = new Arquero(s, p, s, s, s, p, p, s, s, s, s, s);
                            break;
                        case 4:
                            int q = 0;
                            String v = "";
                            e = new Picaro(q, v, q, q, q, v, v, q, q, q, q, q);
                            break;
                        default:
                            System.out.println("ese personaje no esta en la lista");
                    }//fin del switch
                    System.out.println("------------------------------------");
                    System.out.println("Ingrese nombre de jugador");
                    e.setNombre(leer.next());
                    System.out.println("Ingrese su edad:");
                    e.setEdad(leer.nextInt());
                    System.out.println("Ingrese su estatura:");
                    e.setEstatura(leer.nextInt());
                    System.out.println("Ingrese su peso:");
                    e.setPeso(leer.nextInt());
                    System.out.println("Ingrese el color del piel:");
                    e.setColorp(leer.next());
                    System.out.println("Ingrese la raza(hoobbit,elfos,humanos,enanos):");
                    e.setRaza(leer.next());
                    /*  while (!"hobbit ".equals(e.getRaza())|| !"elfos".equals(e.getRaza()) || !"humanos".equals(e.getRaza()) || !"enanos".equals(e.getRaza())) {
                        System.out.println("Ingrese una raza correcta");
                        e.setRaza(leer.next());
                    }*/
                    System.out.println("Su personaje ya esta creado:");
                    System.out.println("QUE EMPIEZA LA BATALLA!!!!!!!!!!!");

                    break;
                case 2:
                    //nivel de dificultad
                    nivel();
                    break;
                case 3:
                    //salir de las opciones del juego
                    break;
                default:
                    System.out.println("Elijio algo que no esta en el menu");
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
                int v;
                System.out.println("desea lanzar el dado? ingrese un numero");
                v = leer.nextInt();
                System.out.println("el mapa de la aventura es:");
                System.out.println("usted esta aqui:");
                char[][] m = new char[5][5];
                imprimir(m);
                if (v < dado()) {
                    System.out.println("Ha encontrado un objeto!!!!");
                } else {
                    if (v + dado() < 100 || dado() + v > 95) {
                        System.out.println("Tiene la oportunidad de tirar el dado de nuevo");
                        System.out.println("lanzar:");
                        v = leer.nextInt();
                    }
                }

                break;
            case 2:
                int n;
                System.out.println("desea lanzar el dado? ingrese un numero:");
                n = 1 + ran.nextInt(20);
                System.out.println("El mapa de la aventura es:");
                char[][] b = new char[5][5];
                imprimir(b);
                if (n < dado()) {
                    System.out.println("Ha encontrado un objeto!!!!");
                } else {
                    if (n + dado() < 100 || dado() + n > 95) {
                        System.out.println("Tiene la oportunidad de tirar el dado de nuevo");
                        System.out.println("lanzar:");
                        n = leer.nextInt();
                    }
                }

                break;
            case 3:
                int d;
                System.out.println("desea lanzar el dado,ingrese un numero");
                d = leer.nextInt();
                System.out.println("El mapa de aventura es:");
                System.out.println("Usted esta aqui:");
                char[][] p = new char[5][5];
                imprimir(p);
                if (d < dado()) {
                    System.out.println("Ha encontrado un objeto!!!!");
                } else {
                    if (d + dado() < 100 || dado() + d > 95) {
                        System.out.println("Tiene la oportunidad de tirar el dado de nuevo");
                        System.out.println("lanzar:");
                        n = leer.nextInt();
                    }
                }

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

    static char[][] matriz() {
        char[][] matriz = new char[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[0][0] = 'X';
            }
        }
        return matriz;
    }//mapa

    static void imprimir(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[0][0] = 'X';
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }//imprimir la matriz de un mapa

    static int dado() {
        int s;
        s = 1 + ran.nextInt(100);
        return s;
    }//fin del metodo de dado
}//fin de la clase
