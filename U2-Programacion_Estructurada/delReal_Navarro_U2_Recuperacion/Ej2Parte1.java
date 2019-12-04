package Recuperacion_Ev1;

import java.util.Scanner;

/*
Escribir un programa que descifre números cifrados sabiendo que las correspondencia entre dígitos es la siguiente:

Se realizarán descifrados de números solicitados al usuario hasta que el usuario introduzca un número negativo.
 */
public class Ej2Parte1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n;
        long aux;
        long descifrado;
        long res=0;

        do{
            System.out.println("Introduzca un número a descifrar:");
            n=sc.nextLong();
            aux=n;
            while(aux>0){
                descifrado=aux*10+(aux%10);
                aux=aux/10;
            }

            System.out.println("Numero descifrado: ");
            if(aux==0){
                res=res*10+0;
            }else if(aux==1){
                res=res*10+3;
            }else if(aux==2){
                res=res*10+4;
            }else if(aux==3){
                res=res*10+5;
            }else if(aux==4){
                res=res*10+6;
            }else if(aux==5){
                res=res*10+7;
            }else if(aux==6){
                res=res*10+8;
            }else if(aux==7){
                res=res*10+9;
            }else if(aux==8){
                res=res*10+2;
            }else { //else if(aux==9)
                res=res*10+1;
            }
            System.out.println("*** resultado***"+res);



        }while(n>0);
        System.out.println("Hasta luego.");
    }
}
