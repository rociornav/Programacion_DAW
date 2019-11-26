package EntregableU3_RRN;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //las mesas:
        int mesa [] =new int [10];
        int comensal;

        //las mesas se cargan con valores aleatorios entre 0 y 4
        for (int i = 0; i < 10; i++) {
            mesa[i] = (int)(Math.random() * 5);
        }



        System.out.println();
        do{
            System.out.println("Número de la mesa: ");
            for (int i = 1; i < 11; i++) {
                System.out.print(" "+ i);
            }

            System.out.println();
            System.out.println("Ocupación de las mesas: ");
            /*
            for (int m : mesa) {
                System.out.print(" "+ m);
            }*/
            //Muestro el vector
            for(int i=0; i<mesa.length;i++){
                System.out.print(mesa[i]+" ");
            }


            System.out.println();
            System.out.println();

            System.out.println("¿Cuántos comensales sois?. Para salir escribe -1");
            comensal=sc.nextInt();

            if(comensal>5){
                System.out.println("Lo siento, no admitimos grupos de "+comensal+" haga grupos de 4 personas como máximo e intente de nuevo");
            }else if(comensal==-1) {
                System.out.println("Gracias por su visita. ");
            } else {
                // Busca una mesa que esté vacía.
                int posVacia = 0;
                boolean hayMesaVacia = false;
                for (int i = 9; i >= 0; i--) {
                    if (mesa[i] == 0) {
                        posVacia = i;
                        hayMesaVacia = true;
                    }
                }

                if (hayMesaVacia) {
                    mesa[posVacia] = comensal; // pongo el comensal en aquella posicion donde quepa
                    System.out.println("Por favor, siéntense en la mesa número " + (posVacia + 1) + ".");
                } else {
                    int posHueco = 0;
                    boolean hayHueco = false;
                    for(int i = 0; i < 10; i++) {
                        if (comensal <= (4 - mesa[i])) {
                            posHueco = i;
                            hayHueco = true;
                        }
                    }

                    if (hayHueco) {
                        mesa[posHueco] = mesa[posHueco]+comensal; // coloca a los clientes en el primer hueco disponible
                        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (posHueco + 1) + ".");
                    } else {
                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                    }

                }
            }

        }while( comensal!= -1);


    }
}
