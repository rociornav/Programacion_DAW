package Recuperacion_Ev1;

import java.util.Scanner;

/*
Crear una aplicación que solicite una fecha (día, mes y año) en formato (dd/mm/yyyy) y muestre la fecha
correspondiente al día siguiente. No tendremos en cuenta los años bisiestos, y supondremos correcta la fecha
introducida tiene el formato correcto. Se solicitarán fechas hasta que el usuario introduzca FIN.
 Supondremos que el usuario siempre usa el formato correcto.
 */
public class Ej3Parte1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dia, mes, año;
        String solicitud="";
        sc.nextLine();
        do{
            System.out.println("Dame un día, mes y año: (Para salir pon FIN o fin)  ");
            dia=sc.nextInt();
            mes=sc.nextInt();
            año=sc.nextInt();


            System.out.println("***Muestro la fecha que acaba de introducir***");
            System.out.println(dia+"/"+mes+"/"+año);

            //supongo correcta la fecha introducida segun el enunciado

            if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){ //meses con 31 dias

            }else if(mes==2){ //mes con 28 dias

            }else{ //resto de meses con 30 dias

            }
            System.out.println("El siguiente día es: ");
        }while (solicitud!="fin" || solicitud!="FIN");

    }
}
