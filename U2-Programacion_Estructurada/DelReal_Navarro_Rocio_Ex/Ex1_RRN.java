package ExamenFinal_Mañana_Eval1_RRN;
//Rocío del Real Navarro 06/11/19
import java.util.Scanner;

/*
Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han encargado
realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario
la altura, que debe ser un número entero impar mayor o igual que 5. Si el número
introducido no es correcto, el programa deberá mostrar un mensaje de error. A
continuación, se muestran algunos ejemplos. La anchura de la figura siempre será de 6
caracteres.
 */
public class Ex1_RRN {
    public static void main(String[] args) {
        //Declaración de variables:
        int altura;

        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Por favor, introduzca la altura (número impar mayor o igual a 5):");
            altura=sc.nextInt();

            //Comprobacion de si el número es correcto o no
            if(altura%2==0 || altura<5){
                System.out.println("Error. La altura debe ser mayor o igual a 5.");
            }

        }while(altura%2==0 || altura<5);

        //Pintamos la figura recorriendo primero las filas y luego las columnas:
        for(int i=0; i<altura;i++){
            if(i==0||i==altura-1||i==altura/2){//pinta las 3 filas
                for(int j=0;j<=5;j++){ //la anchura siempre sera de 6 caracteres
                    System.out.print("M");
                }
            }
            if (i!=0 && i!=altura-1 && i!=altura/2){
                for(int j=0;j<=5;j++){ //j=columna
                    if(j==0||j==5){
                        System.out.print("M");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        sc.close();

    }
}
