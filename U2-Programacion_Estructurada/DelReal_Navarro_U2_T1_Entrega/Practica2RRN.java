package U2Cadenas;

import java.util.Scanner;

//num capicua  Rocio del Real
public class Practica2RRN {
    public static void main(String[] args) {
        long dm,umillar,c,d,u;
        boolean capicua=false;
        long n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un numero y te dire si es o no capicua: ");
        n=sc.nextLong();

        //voy descomponiendo el numero
        u=n%10; //en uds
        n=n/10; //aqui se eliminan las uds
        d=n%10; //decenas
        n=n/10;
        c=n%10; //centenas
        n=n/10;
        umillar=n%10; //uds de millar
        n=n/10;
        dm=n%10; //decenas de millar
        n=n/10;

        //cuando tiene n 5 cirfras
        if(dm!=0 && dm==u && umillar==d){
            capicua=true;
        }
        //cuando tiene 4 cifras
        if(dm==0 && umillar!=0 && umillar==u && c==d){
            capicua=true;
        }

        //cuando tiene 3 cifras

        if(dm==0 && umillar==0 && c!=0 && c==u){
            capicua=true;

        }
        //2 cifras

        if(dm==0 && umillar==0 && c==0 && d!=0 && d==u){
            capicua=true;

        }


        if(capicua){
            System.out.println("El numero es capicua");
        }else {
            System.out.println("No es capicua");
        }

        sc.close(); //cierro teclado






    }
}
