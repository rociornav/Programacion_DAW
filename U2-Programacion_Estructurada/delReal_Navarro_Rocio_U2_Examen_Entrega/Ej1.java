package Exam1Mañ_Rocio;
/*
Escribe un programa que pinte por pantalla un par de calcetines, de los que se ponen al lado del árbol
de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una altura mayor o igual a 4.
Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.

Ejemplo 1:
Introduzca la altura de los calcetines: 6

***      ***
***      ***
***      ***
***      ***
******  ******
******  ******


Ejemplo 2:
Introduzca la altura de los calcetines: 4


***      ***
***      ***
******  ******
******  ******
 */
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int altura;
        int anchuraLargo=3;


        do{
            System.out.println("Dame la altura de los calcetines: ");
            altura=sc.nextInt();

            if(altura<4){
                System.out.println("Error, la altura de los calcetines debe ser mayor o igual a 4.");
            }

        }while(altura<4);

        for(int i=0; i<altura;i++){
            for(int j=0; j<anchuraLargo;j++){
                System.out.print("*");

                if(i==altura-1 || i==altura-2){
                    System.out.print("*");

                }/*else{
                    System.out.print("*");
                }*/


            }
            /*if(i!=altura-1 || i!=altura-2){
                System.out.print("--"); //establezco 5 espacios de separacion
            }*/
            System.out.print("  ");//establezco los 2 espacios de separación

            System.out.println();
        }



    }
}
