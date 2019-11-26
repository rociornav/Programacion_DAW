package EntregableU3_RRN;


import java.util.Scanner;

/*
Implementa la función aleatorioDeArray con la cabecera que se muestra a
continuación:
public static int aleatorioDeArray(int[] a)
Esta función debe devolver un número del array escogido al azar entre todos
los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorio-
DeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
prueba.
 */
public class Ej5 {

    public static int aleatorioDeArray(int[] a){
        int res= (int)(Math.random()*a.length);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //defino mi tabla.
        int[] vector = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Muestro el vector predefinido: ");
        System.out.println();
        for(int i=0; i<vector.length;i++){
            if(i==0){
                System.out.print("{"+vector[i]+", ");
            }else if(i==vector.length-1){
                System.out.print(vector[i]+"}");
            }else{
                System.out.print(vector[i]+", ");
            }
        }
        System.out.println();
        System.out.println("****************************************************");
        System.out.println("Ahora la función eligirá un nº al azar de ese vector.");
        System.out.println("****************************************************");

        System.out.println("Numero elegido al azar--> "+ aleatorioDeArray(vector));


    }
}
