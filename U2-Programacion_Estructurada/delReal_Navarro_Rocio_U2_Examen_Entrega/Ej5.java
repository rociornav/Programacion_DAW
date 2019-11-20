package Exam1Mañ_Rocio;

import java.util.Scanner;

/*
Escribir un programa que incremente la hora de un reloj tantos segundos como le solicitemos mostrando
cada vez la hora nueva.
Se solicitará al usuario por teclado las horas, los minutos y los segundos y el número
de segundos que se quiere aumentar la hora.

Supondremos que el usuario siempre introduce valores correctos.
Ejemplo 1:

Introducza horas: 13
Introduzca minutos: 59
Introduzca segundos: 51
Introduzca segundos a incrementar: 10

Aumentando la hora...
13:59:52
13:59:53
13:59:54
13:59:55
13:59:56
13:59:57
13.59:58
13:59:59
14:00:00
14:00:01
 */
public class Ej5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h, m, s, incrementoSeg = 0;
        System.out.println("Vamos a suponer que los datos que me inserta son correctos.");
        System.out.println("Dame las horas: ");
        h = sc.nextInt();
        System.out.println("Dame los minutos: ");
        m = sc.nextInt();
        System.out.println("Dame los segundos: ");
        s = sc.nextInt();

        System.out.println("Cuántos segundos quiere incrementar la hora?: ");
        incrementoSeg = sc.nextInt();


        // suponemos que la hora introducida es correcta
        // incrementamos los segundos
        s=s+incrementoSeg;
        // si los segundos superan 59, los reiniciamos a 0 e incrementamos los minutos

        if (s >= 60) {
            s = 0;
            m++;

        // si los minutos superan 59, los reiniciamos a 0 e incrementamos la hora
            if (m >= 60) {
                m = 0;
                h++;

        // si la hora supera 23, la reiniciamos a 0
                if (h >= 24)
                    h = 0;
            }
        }
        System.out.println("Hora Completa: " + h + ":" + m + ":" + s);


    }
}
