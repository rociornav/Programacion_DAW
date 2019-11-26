package EntregableU3_RRN;

import java.util.Scanner;

public class Ej2RRN {

    public static int[][] media(int[][]v){
        int sumaTotalFilaCol=0;
        int mediaTotalFilaCol=0;

        int [][] res=new int[v.length+1][v.length+1]; //paso 1, redimensiono

        for(int i=0;i<v.length;i++){  //copio matriz a la nueva matriz recorriendola
            int suma=0;
            int media=0;

            for(int j=0;j<v[i].length;j++){
                res[i][j]=v[i][j];
                suma=suma+v[i][j]; //suma fila
                media=suma/v[i].length; //media fila=suma fila/nº filas
            }
            res[i][v.length]=suma;
            sumaTotalFilaCol+=suma;
            mediaTotalFilaCol=sumaTotalFilaCol/v.length;
        }

        for(int i=0;i<v.length;i++){  //copio matriz a la nueva matriz recorriendola
            int suma=0;
            for(int j=0;j<v[i].length;j++){
                suma=suma+v[j][i];
            }
            res[v.length][i]=suma; //suma col
            sumaTotalFilaCol+=suma;
            mediaTotalFilaCol=sumaTotalFilaCol/v.length;
        }
        res[v.length][v.length]=sumaTotalFilaCol;
        return res;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] vector =new int[4][5];
        int[][] res;
        //int sumaTotalFilaCol=0;
        //relleno
        for(int i=0;i<vector.length;i++){
            for (int j=0; j<vector[i].length;j++){
               // vector[i][j]=(int)(Math.random()*10+1);
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                vector[i][j]=sc.nextInt();

            }
        }
        //muestro
        res=media(vector);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
