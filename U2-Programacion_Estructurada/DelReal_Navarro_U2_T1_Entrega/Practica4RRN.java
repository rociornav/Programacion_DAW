package U2Cadenas;

import java.util.Scanner;

/*
Crear programa que pinte una flecha doble hacia la izquierda. Se pide al usuario la altura de la figura,
 que debe ser un número impar mayor o igual que 3. La distancia entre cada flecha de asteriscos es siempre de 5 espacios.
 Si la altura introducida por el usuario no es un número impar mayor o igual que 3, el programa debe mostrar un mensaje de error.
 */
public class Practica4RRN {
    public static void main(String[] args) {
        int tam;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dame la altura de la figura (un numero impar): ");
        tam=sc.nextInt();

        for(int i=0; i<tam;i++){ //recorre las filas
            for(int j=0; j<tam; j++){//recorre las columnas
                if ((i+j==tam/2) || (i-j==tam/2))  {
                    System.out.print("*");
                    System.out.print("     ");//cinco espacios
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
