package Exam1Mañ_Rocio;

import java.util.Scanner;

/*
Ahora que se acerca la notería de Navidad queremos saber si un número va a proporcionar suerte a un usuario.
Solicitaremos a un usuario cuáles son sus 3 números favoritos y para calcular  si un número le va a dar suerte
dicho número tendrá más ocurrencias de esos números que de los demás.

Ejemplo 1:

Introduzca sus números favoritos 1:

3

5

7

Introduzca el número de la lotería: 74123

Ese número no le va a dar suerte

Ejemplo 2:

Introduzca sus números favoritos 1:

3

5

7

Introduzca el número de la lotería: 55173

Ese número le va a dar suerte.
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int fav;
        int fav1, fav2, fav3;
        String lot="";
        System.out.println("Me dará en total 3 números favoritos.");
        /*
        System.out.println("Inserte 3 numeros uno seguido de otro en esta línea: ");
        fav=sc.nextInt();*/
        System.out.println("Dame el numero 1: ");
        fav1=sc.nextInt();
        String f1=Integer.toString(fav1);
        System.out.println("Dame el numero 2: ");
        fav2=sc.nextInt();
        String f2=Integer.toString(fav2);
        System.out.println("Dame el numero 3: ");
        fav3=sc.nextInt();
        //de int a char-->
        /*
        int a = 1;
        char b = (char) a;
         */
       String f3=Integer.toString(fav3);
       //char f3=(char)fav3;

        //pasamos el numero fav a String:
        //String favorito=Integer.toString(fav);

        System.out.println("*******Introduzca el número de la lotería (5num): ********");
        lot=sc.nextLine();
        sc.nextLine();

        //bucle para comprobar si los num del usuario estan en la loteria
        for(int i=0; i<lot.length(); i++){ //recorro la loteria
            //reviso la loteria caracter a caracter
            /*
                char caracter=lot.charAt(i);
                if(caracter== 'fav1' ||caracter== 'fav2' || caracter== 'f3'){
                    System.out.println("Va a tener suerte.");
                }else{
                    System.out.println("No va a tener suerte.");
                }*/
            if(lot.contains(f1)==true||lot.contains(f2)==true||lot.contains(f3)==true){
                System.out.println("Va a tener suerte");
            }else{
                System.out.println("No va a tener suerte");
            }

        }

        sc.close();


    }
}
