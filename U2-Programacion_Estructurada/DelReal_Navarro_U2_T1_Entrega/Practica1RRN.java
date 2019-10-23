package U2Cadenas;

import java.util.Scanner;

public class Practica1RRN {
    public static void main(String[] args) {
        double ex1, ex2, media;

        Scanner sc=new Scanner(System.in);
        System.out.println("Dame la nota de tu primer examen: ");
        ex1=sc.nextDouble();
        System.out.println("Dame la nota de tu segundo examen: ");
        ex2=sc.nextDouble();
        sc.nextLine(); //Importante para que me lea el ultimo else.

        media=(ex1+ex2)/2;

        System.out.println("Tu nota media de programación es: "+media);

        if(media>=5){
            System.out.println("Tiene un 'Suficiente' de nota. ");
        }else if(media>=6 && media<7){
            System.out.println("Tiene un 'Bien' de nota. ");
        }else if(media>=7 && media<9){
            System.out.println("Tiene un 'Notable' de nota. ");
        }else if(media>=9 && media<=10){
            System.out.println("Tiene un 'Sobresaliente' de nota. ");
        }else{
            System.out.println("Como suspendiste. ¿Qué nota tuviste en el examen de recuperación? Escribe una opción apto o no apto");

            String opcion=sc.nextLine();

            opcion=opcion.toLowerCase();
            if(opcion.equals("apto")){
                System.out.println("Resultado = Apto");
                System.out.println("Tu nota de programación es suficiente.");

            }else{
                System.out.println("Resultado = No Apto");
                System.out.println("Tu nota de Programación es 4.5 - Suspenso");
            }





        }

    }
}
