package U2Cadenas;
/*
Realiza un programa lea un número entero positivo de la pantalla y que lo pase a binario.
 */
import java.util.Scanner;

public class Practica3RRN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número decimal positivo");
        int numero = sc.nextInt();
        String binario = " ";// para almacenar los restos

        if (numero > 0) { //numero mayor a cero
            while (numero > 0) {
                if (numero % 2 == 0) {//12 es multiplo de dos?...
                    binario = "0" + binario; // si va cero
                } else {
                    binario = "1" + binario;
                }
                numero = numero / 2;//lo divido por dos
            }
        } else if (numero == 0) {
            binario = "0";
        } else {//el numero decimal es menor de cero
            binario = "No se pudo convertir el número. Ingrese sólo números positivos";
        }
        System.out.println("El número convertido a binario es: " + binario);

        sc.close();
    }
}
