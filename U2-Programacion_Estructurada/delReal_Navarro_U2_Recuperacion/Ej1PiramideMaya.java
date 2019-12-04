package Recuperacion_Ev1;

import java.util.Scanner;

/*
Realizar un programa que pinte una pirámide maya. Por los lados, se trata de una pirámide normal y corriente.
Por el centro se van pintando líneas de asteriscos de forma alterna (empezando por la superior):
 la primera se pinta, la segunda no, la tercera sí, la cuarta no, etc. La terraza (la línea superior)
  de la pirámide siempre tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide normal
   tienen 4 asteriscos y el espacio entre las líneas que no se pintan tiene también 4 asteriscos.

Se solicitará al usuario la altura hasta que el usuario introduza una altura mayor o igual que 3.


 */
public class Ej1PiramideMaya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame la altura de la piramide: ");
        int altura=sc.nextInt();
        int anchoTotal=14; //solo para altura 5.
        int ancho=6;//el del centro

        for (int i = 0; i <altura ; i++) {

            for (int j = 0; j <ancho ; j++) {
                //con esto pinto la parte central de la piramide maya
                if(i==0 || i==altura-1 || j==0 || j==altura || i==(altura)/2){
                    System.out.print("*");
                }else{

                    System.out.print("-");
                }

            }
            System.out.println();

        }

    }
}
