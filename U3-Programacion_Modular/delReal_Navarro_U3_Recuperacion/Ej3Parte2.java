package Recuperacion_Ev1;

import java.util.Scanner;

import static Recuperacion_Ev1.LibreriaCadenas.*; //importamos las funciones de la libreria

/*
Crear una librería para trabajar con cadenas que contenga las siguiente funciones:

 invertir

Recibe una cadena (String)
Devuelve esa cadena invertida y en mayúsculas pero colocada en un vector (una letra por posición)
Por ejemplo:

invertir("hola") debe devolver [ "A","L","O","H"]

desplazarVocales

Recibe una cadena (String)
Devuelve esa misma cadena con las vocales desplazadas una posición a -> e , e -> i , i -> o, o -> u , u -> a y colocada en un vector (una letra por posición)
Por ejemplo:

desplazarVocales("hola") devuelve ["h","u","l","e"]
 */
public class Ej3Parte2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cad="";
        System.out.println("Dame una cadena: ");
        cad=sc.nextLine();
        System.out.println("***Probando funcion invertir()***");
        //llamo la funcion
        System.out.println(invertir(cad));

        System.out.println("**********************************");
        System.out.println("***Probando funcion desplazarVocales()***");
        //llamo la funcion
        System.out.println(desplazarVocales(cad));



        sc.close();

    }

}
