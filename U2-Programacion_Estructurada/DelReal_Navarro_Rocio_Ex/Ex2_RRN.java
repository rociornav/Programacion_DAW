package ExamenFinal_Mañana_Eval1_RRN;
//Rocío del Real Navarro 06/11/19
import java.util.Scanner;

/*
Escribe un programa que permita partir un número introducido por teclado en dos
partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir, el número
introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en este
ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena).
Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición a partir de la cual quiere partir el número: 5
Los números partidos son el 4067 y el 83.
 */
public class Ex2_RRN {
    public static void main(String[] args) {
        //Declaración variables:
        int numero;
        int posicion;
        int contCifras; //variable que determina la cantidad de dígitos del número
        int aux;
        int parteDos;

        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("Por favor, introduzca un número entero positivo, debe tener 2 dígitos como mínimo:");
            numero=sc.nextInt();
            if(numero<10){ //si el numero es menor de 10 (tiene menos de un dígito y además incluye los negativos)
                System.out.println("Error, el número debe tener al menos 2 dígitos.");
            }

        }while(numero<10);

        //*************necesito conocer el numero de posiciones que tiene el numero.*****************
        contCifras=0;
        aux=numero; //usamos un auxiliar para no machacar el numero
        while(aux>0){ //mientras que el numeroAux sea menor que cero
            aux=aux/10; //entre 10, es la forma correcta de eliminar el ultimo digito e ir contando su tamaño.
            contCifras++;
        }
        //*******************************************************************************************

        System.out.println("Introduzca la posición a partir de la cual quiere partir el número (al menos a partir" +
                " de la posición 2):");
        posicion=sc.nextInt();

        while(posicion<2||posicion>contCifras){

            if(posicion<=2||posicion>contCifras){
                System.out.println("Error. La posición a introducir a de ser mayor o igual a 2 " +
                        "y no superar la cantidad de dígitos del número introducido. ");
            }
            System.out.println("Introduzca la posición a partir de la cual quiere partir el número (al menos a partir" +
                    " de la posición 2):");
            posicion=sc.nextInt();

        }

        //Recorro el número dígito a dígito
        aux=numero;//reinicio el valor del auxiliar

        for(int i=posicion; i<=contCifras;i++){ //****Primera partición
            aux=aux/10; //elimino el último dígito el número de veces que hay entre posicion y la longitud de cifras del número
        }
        System.out.println("**********Resultados:*********");
        System.out.println("Primera partición del número: "+aux);

        for(int i=posicion; i<=contCifras;i++){
            aux=aux*10; //calcula el excedente Ej: si elijo el num=1234 y pos=2 mi auxFinal aquí sería 1000
        }
        parteDos=numero-aux;
        System.out.println("Segunda partición del número a partir la posición "+posicion+" es: "+parteDos);


        sc.close(); //cierro teclado.


    }
}
