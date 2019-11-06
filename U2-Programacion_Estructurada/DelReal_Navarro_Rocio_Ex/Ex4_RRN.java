package ExamenFinal_Mañana_Eval1_RRN;
//Rocío del Real Navarro 06/11/19
import java.util.Scanner;
/*
Realiza un programa que calcule el máximo, el mínimo y la media de una serie de
números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se tendrá en
cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir).
Ejemplo:
Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un
número primo:
6
8
15
12
23
Ha introducido 4 números no primos.
Máximo: 15
Mínimo: 6
Media: 10.25
 */
public class Ex4_RRN {
    public static void main(String[] args) {
        //Declaración de variables:
        int n;
        boolean esPrimo=false;
        int cont=0;
        double suma=0.0;
        int max=0, min=0;
        double media=0.0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un " +
                "número primo:");
        n=sc.nextInt();
        cont=1; //añado el numero de arriba

        while (n<=0||esPrimo==false){

            if(n<=0){
                esPrimo=false;
                System.out.println("Error. Introduce un número entero positivo mayor que cero.");
            }else{
                esPrimo=true;
                for (int i = 2; i < n; i++) { //todo numero primo es divisible entre 1 y sí mismo.
                    if (n % i == 0) {
                        esPrimo = false;
                    }
                }
                if(esPrimo==false){
                    cont++;
                    suma=suma+n;
                }else{

                    if(n>max){
                        max=n;
                    }else if(n<min){
                        min=n;
                    }
                }
            }
            System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un " +
                    "número primo:");
            n=sc.nextInt();
        }
        //******Solucion*******
        System.out.println("___________________");
        System.out.println("     Solución:");
        System.out.println("___________________");
        System.out.println();
        System.out.println("Números no primos introducidos: "+cont);
        media=suma/cont;
        System.out.println("Media = "+media);
        System.out.println("Número máximo = "+max);
        System.out.println("Número mínimo = "+min);

        //Cierro teclado
        sc.close();

        //Nota: Fallos del programa-> detecta el segundo numero primo introducido...no el primero.

    }
}
