package ExamenU7RRN;

import java.util.*;

/*
Usar dicha clase y todos sus métodos en la clase Main. Deberéis tener, al menos, 3 razas,
 10 perros y 3 dueños (combinados de la manera que queráis).
 */
public class Main {
    public static void main(String[] args) {
        //creo el conjunto de perros
        Set<Perro> conjunto=new HashSet<>();

        //Creo los objetos perro
        Perro p1= new Perro("Zeus", 3, 22.0, true,"Manuel", new Raza("Border Collie"));
        Perro p2= new Perro("Carry", 2, 18.0, false,"Manuel", new Raza("Raza A"));
        Perro p3= new Perro("A", 11, 22.0, true,"Isa", new Raza("Border Collie"));
        Perro p4= new Perro("X", 8, 20.0, false,"Isa", new Raza("Border Collie"));
        Perro p5= new Perro("B", 5, 10.0, true,"Manuel", new Raza("pekines"));
        Perro p6= new Perro("V", 10, 40.0, true,"Raquel", new Raza("Pastor aleman"));
        Perro p7= new Perro("C", 5, 33.0, true,"Raquel", new Raza("Border Collie"));
        Perro p8= new Perro("E", 6, 23.0, true,"Jaime", new Raza("Raza A"));
        Perro p9= new Perro("W", 6, 25.0, true,"Manuel", new Raza("XXX"));
        Perro p10= new Perro("D", 1, 8.0, false,"Carlos", new Raza("YYY"));
        Perro p11= new Perro("T", 11, 7.0, false,"Jaime", new Raza("YYY"));


        //Inserto 10 perros

        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        conjunto.add(p4);
        conjunto.add(p5);
        conjunto.add(p6);
        conjunto.add(p7);
        conjunto.add(p8);
        conjunto.add(p9);
        conjunto.add(p10);


        Concurso c1=new Concurso(conjunto,"La Resistencia","Z");
        System.out.println("Perro inscrito:");
        c1.disqualifyDog(p1);
        System.out.println("Perro no inscrito");
        c1.disqualifyDog(p11);

        System.out.println();
        System.out.println("__________________________________________________");
        System.out.println();

        c1.perrosporPeso(conjunto);

        System.out.println();
        System.out.println("__________________________________________________");
        System.out.println();

        c1.perrosporEdad(conjunto);

        System.out.println();
        System.out.println("__________________________________________________");
        System.out.println();
        System.out.println("Creando 'perros.dat' independientemente de la raza");
        c1.guardarPerros(conjunto);






    }
}
