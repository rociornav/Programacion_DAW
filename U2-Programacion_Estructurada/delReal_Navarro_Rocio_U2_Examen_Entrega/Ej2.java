package Exam1Mañ_Rocio;

import java.util.Scanner;

/*
Realizar un programa que dado un número que se solicita la usuario por consola eliminará de ese número
todos los 0 y todos los 8 indicando adicionalmente cuántos números ha eliminado.Deberá solicitar el número mientras
 que el número introducido no sea positivo.

Ejemplo 1:
Introduzca un número entero positivo: 34084091
Número resultado: 34491
Dígitos eliminados: 3
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n;
        int conEliminados=0;

        do{
            System.out.println("Dame un numero positivo (un long): ");
            n=sc.nextLong();

            if(n<0){
                System.out.println("Error, debe insertar un numero mayor o igual que cero.");
            }


        }while(n<0);

        String numUsu=String.valueOf(n); //pasamos el numero del usuario a string

        String nuevoNum="";

        //recorremos la string
        for(int i=0; i<numUsu.length();i++){
            if(numUsu.contains("0")||numUsu.contains("8")){
                conEliminados++;
            }else{
                nuevoNum=nuevoNum+String.valueOf(numUsu)+" "; //lo almaceno en la cajita
            }
        }

        System.out.println("****Resultado del número con los dígitos eliminados****");
        System.out.println(nuevoNum);
        System.out.println("****Dígitos eliminados:****");
        System.out.println(conEliminados);





        sc.close();
    }
}
