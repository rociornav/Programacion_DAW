package Exam1Mañ_Rocio;

import java.util.Scanner;

/*
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no.

Ejemplo:
Por favor, introduzca un número entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        boolean primo=true;


        do{
            System.out.println("Dame un número entero positivo y te mostraré los 5 consecutivos a partir de este: ");
            n=sc.nextInt();
            if(n<0){
                System.out.println("Error. Debe ser un número positivo mayor que cero.");
            }
        }while(n<0);
        //primos: divisible entre 1 y sí mismo.

        /* Intento 1, sale un fallo.
        for(int i=n; i<n+5; i++){
            System.out.print(i);
            if(n%i==0){
                System.out.print(" es primo");
            }else{
                System.out.print(" no es primo");
            }
            System.out.println();
        }*/
        int contador=0;
        while (contador < 5) {
            System.out.print(n);
            primo = true;
            for (int i = 2; i < n; i++){
                if (n%i == 0){
                    primo = false;
                }
            }
            if (primo){
                System.out.println(" es primo.");
            } else {
                System.out.println(" no es primo.");
            }
            n++; //incremento de n
            contador++; //para que salgan 5 consecutivos
        }



        sc.close();

    }
}
