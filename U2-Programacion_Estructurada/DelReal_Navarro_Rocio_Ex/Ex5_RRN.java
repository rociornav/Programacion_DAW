package ExamenFinal_Mañana_Eval1_RRN;

import java.util.Scanner;

//Rocío del Real Navarro 06/11/19
/*
Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.
Ejemplo:
Entrada: cad = "Hola tu"
Salida: La cantidad de vocales es 3
 */
public class Ex5_RRN {
    public static void main(String[] args) {
        //Declaración de variables:
        String frase;
        int vocal=0; //contador de vocales


        Scanner sc=new Scanner(System.in);
        System.out.println("Dame una frase y te cuento el número de vocales: ");
        frase=sc.nextLine();
        frase=frase.toLowerCase(); //las pasamos a minusculas todas

        for(int i=0; i<frase.length();i++){ //recorremos la cadena caracter a caracter
            char letra=frase.charAt(i); //caracter a caracter

            //preguntamos si es una vocal, y de serlo lo sumamos en su variable.
            if(letra=='a' || letra=='e'|| letra=='i'||letra=='o'||letra=='u'||letra=='a'){
                vocal++;
            }
        }

        System.out.println("Cantidad total de vocales = "+vocal);

        sc.close();
    }
}
