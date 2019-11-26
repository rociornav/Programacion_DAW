package EntregableU3_RRN;

import java.util.Scanner;

public class Ej4 {

    public static String convierteArrayEnString(int[] a){
        //me tiene que convertir de int a caracter
        String res="";
        /*
        Otra solucion factible más compleja:

        StringBuffer res= new StringBuffer();

        //recorro la tabla
        for(int i=0; i<a.length;i++){
            res=res.append(a[i]);
        }*/

        for(int i=0; i<a.length;i++){
            res=res+Integer.toString(a[i]);
        }

        return res;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame el tamaño del vector de 1 dimension: ");
        int tam=sc.nextInt();
        int [] vector=new int[tam]; //mi array inicial contiene int

        System.out.println("Vamos a rellenar la matriz: ");

        //relleno
        for(int i=0;i<vector.length;i++){
                System.out.print("Elemento ["+i+"]: ");
                vector[i]=sc.nextInt();
        }

        //Mostramos la matriz
        System.out.println("Mostramos el vector: ");
        for (int i=0; i<vector.length; i++) {
            if(i==0){
                System.out.print("{"+vector[i]+", ");
            }else if(i==vector.length-1){
                System.out.print(vector[i]+"}");
            }else{
                System.out.print(vector[i]+", ");
            }
        }
        System.out.println();
        System.out.println("Lo pasamos a String: ");
        System.out.println(" ' "+convierteArrayEnString(vector)+" ' ");
        //convierteArrayEnString(vector);



    }

}
