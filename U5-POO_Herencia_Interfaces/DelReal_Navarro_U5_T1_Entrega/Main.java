package GarajeVehiculosHerencia;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Crear  3 coches, 3 motos, un helicóptero y una avioneta
        System.out.println("________________________Coches________________________________");
        System.out.println("_____________________________________________________________");
        Coche[] coches =new Coche[3];
        coches[0]=new Coche("5534ZZZ","Elegance",2,2020, Color.ROJO);
        coches[1]=new Coche("1234ABC","Family",8,2023,Color.VERDE);
        coches[2]=new Coche("9234SYM","Progress",4,2015,Color.AZUL);

        //Compruebo la funcionalidad del criterio de ordenacion natural:
        Arrays.sort(coches);
        System.out.println(Arrays.deepToString(coches));

        //Criterio de ordenacion con clase anonima:
        Arrays.sort(coches, new Comparator<Coche>() {
            @Override
            public int compare(Coche coche, Coche t1) {
                return coche.anyoFabricacion-t1.getAnyoFabricacion();
            }
        });
        System.out.println(Arrays.deepToString(coches));

        System.out.println("_____________________________________________________________");
        System.out.println("________________________Motos________________________________");
        System.out.println("_____________________________________________________________");


        Moto[] motos = new Moto[3];
        motos[0]=new Moto("2222aaa","Speed",2,1990,Color.AMARILLO);
        motos[1]=new Moto("3333ccc","Pete",1,2000,Color.ROJO);
        motos[2]=new Moto("1111aaa","rose",2,2020,Color.AZUL);
        //Compruebo la funcionalidad del criterio de ordenacion natural:
        Arrays.sort(motos);
        System.out.println(Arrays.deepToString(motos));

        //Criterio de ordenacion con clase anonima:
        Arrays.sort(motos, new Comparator<Moto>() {
            @Override
            public int compare(Moto moto, Moto t1) {
                return moto.anyoFabricacion-t1.getAnyoFabricacion();
            }
        });
        System.out.println(Arrays.deepToString(motos));

        System.out.println("_____________________________________________________________");
        System.out.println("________________________Helicoptero________________________________");
        System.out.println("_____________________________________________________________");


        Helicoptero[] helicopteros=new Helicoptero[1];
        helicopteros[0]=new Helicoptero("heli1",10,"arg1700");
        helicopteros[0].transportar(9);
        System.out.println(helicopteros[0].toString());

        System.out.println("_____________________________________________________________");
        System.out.println("________________________avion________________________________");
        System.out.println("_____________________________________________________________");

        Avioneta[] avionetas=new Avioneta[1];
        avionetas[0]=new Avioneta("avion1",6,"wwwnet");




    }
}
