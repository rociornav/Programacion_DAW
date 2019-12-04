package Recuperacion_Ev1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1mediaVector {
    public static float[] mediaVectores(int[] v1, int[] v2){
        int tamaño, tamañoMenor;
        if(v1.length>v2.length){
            tamaño=v1.length;
        }else{
            tamaño=v2.length;
        }

        if(v1.length>v2.length){
            tamañoMenor=v2.length;
        }else{
            tamañoMenor=v1.length;
        }
        float[] res= new float[tamaño];

        for (int i = 0; i <tamañoMenor ; i++) {
            int suma=0;
            res[i] =(v1[i]+v2[i])/2; //media
        }

        //añado la parte del vector más larga al final de res
        for (int i = 0; i <res.length ; i++) {
            if(v1.length>v2.length){
                for ( i = tamañoMenor; i <v1.length ; i++) {

                    res[i]=res[i]+v1[i];
                }
            }else{
                for (i = tamañoMenor; i <v2.length ; i++) {

                    res[i]=res[i]+v2[i];
                }
            }
        }





        return res;
    }
    public static void main(String[] args) {
        //Los vectores deberán ser rellenados por el usuario. Se le solicitará el tamaño y los valores de
        // los dos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame el tamaño del vector 1: ");
        int tam1=sc.nextInt();
        System.out.println("Dame el tamaño del vector 2: ");
        int tam2=sc.nextInt();

        //declaro vectores
        int[] vector1=new int[tam1];
        int[] vector2=new int[tam2];

        //rellenamos los vectores
        System.out.println("***Rellenamos el vector 1: ***");
        for (int i = 0; i <vector1.length ; i++) {
            System.out.println("Dame el valor del vector 1 en la posición "+i +" :");
            vector1[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("***Rellenamos el vector 2: ***");
        for (int i = 0; i <vector1.length ; i++) {
            System.out.println("Dame el valor del vector 2 en la posición "+i +" :");
            vector2[i]=sc.nextInt();
        }
        System.out.println();

        //Mostramos vectores al usuario
        System.out.println("***Mostramos los vectores***");
        System.out.println("Vector 1: ");
        for (int i = 0; i <vector1.length ; i++) {
            if(i==0){
                System.out.print("{"+vector1[i]+", ");
            }else if(i==vector1.length-1){
                System.out.print(vector1[i]+"} ");
            }else{
                System.out.print(vector1[i]+", ");
            }

        }
        System.out.println();
        System.out.println("Vector 2: ");
        for (int i = 0; i <vector2.length ; i++) {
            if(i==0){
                System.out.print("{"+vector2[i]+", ");
            }else if(i==vector2.length-1){
                System.out.print(vector2[i]+"} ");
            }else{
                System.out.print(vector2[i]+", ");
            }
        }

        System.out.println();
        System.out.println();
        //llamada a la funcion:
        System.out.println("***Solucion***");
        System.out.println(Arrays.toString(mediaVectores(vector1,vector2)));

        sc.close();

    }
}
