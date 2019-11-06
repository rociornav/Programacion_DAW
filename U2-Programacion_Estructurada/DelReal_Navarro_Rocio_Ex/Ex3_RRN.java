package ExamenFinal_Mañana_Eval1_RRN;
//Rocío del Real Navarro 06/11/19
import java.util.Scanner;

/*
Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un
número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
largos.
Ejemplo 1:
Introduzca un número entero: 67706
Dígitos que aparecen en el número: 0 6 7
Dígitos que no aparecen: 1 2 3 4 5 8 9
 */
public class Ex3_RRN {
    public static void main(String[] args) {
        //Declaración de variables:
        long n; //numero del usuario tipo long
        String numUsuario;
        String conDigito;
        String sinDigito;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n = sc.nextLong();

        //Pasamos el número del usuario a String para recorrerla con for
        numUsuario = String.valueOf(n); //Nota:valueOf me da el valor primitivo del numero que le estamos pasando
        conDigito = new String();
        sinDigito = new String();

        //recorremos la string
        for (int i = 0; i <= 9; i++) { //ya que tenemos estos numeros 0 1 2 3 4 5 6 7 8 9
            if (numUsuario.contains(String.valueOf(i))) {//si mi cadena del numero del usuario contiene un numero en la pos i que estoy mirando
                conDigito = conDigito + i + ", ";//lo añado al cajon 'conDigito', añado la coma para separarlos.
            } else {
                sinDigito = sinDigito + i + ", ";
            }
        }

        //Solución
        System.out.println("___________________");
        System.out.println("     Solución:");
        System.out.println("___________________");
        System.out.println();
        System.out.println("Solución 1.-Dígitos que aparecen en el número " + numUsuario + " :" + conDigito);
        System.out.println("Solución 2.-Dígitos que no aparecen en el número " + numUsuario + " :" + sinDigito);

        //Cierro Scanner:
        sc.close();

    }
}
