package ExamenT5RRN;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Creo una lista de 6 personajes, la clase Personaje no es instanciable
        //Personaje[] personajes=new Personaje[6];
        RPG[] personaje=new RPG[6];
        personaje[0]=new RPG("Sara",80,500,50,false);
        personaje[1]=new RPG("Zoe",500,5,11,true);
        personaje[2]=new RPG("Pat",1,1,20,true);
        personaje[3]=new RPG("Smith",900,980,500,false);
        personaje[4]=new RPG("XXx2",20,200,660,false);
        personaje[5]=new RPG("Vico",1000,300,56,true);
        RPG p1 = personaje[0];
        RPG p2 = personaje[1];
        RPG p3 = personaje[2];
        RPG p4 = personaje[3];
        RPG p5 = personaje[4];
        RPG p6 = personaje[5];
        //Nota personal: el nummuertos no va, ni numPersonajes. Mirar si borrar el ultimo parametro de este constr,
        //Ordeno por energia con comparable
        System.out.println("__________________________________");
        System.out.println("_________Ordenar por energia_______");
        System.out.println("__________________________________");
        Arrays.sort(personaje);
        System.out.println(Arrays.deepToString(personaje));

        //Ordeno por ataque
        System.out.println();
        System.out.println("__________________________________");
        System.out.println("_________Ordenar por ataque_______");
        System.out.println("__________________________________");
        Arrays.sort(personaje, new CompararAtaque());
        System.out.println(Arrays.deepToString(personaje));

        //Ordeno por defensa
        System.out.println();
        System.out.println("__________________________________");
        System.out.println("_________Ordenar por defensa_______");
        System.out.println("__________________________________");
        Arrays.sort(personaje, new CompararDefensa());
        System.out.println(Arrays.deepToString(personaje));

        //5 ataques al menos
        System.out.println();
        System.out.println("__________________________________");
        System.out.println("_________Ataques_______");
        System.out.println("__________________________________");
        p1.atacarPersonaje(p1,p2);
        p3.atacarPersonaje(p3,p6);
        p2.atacarPersonaje(p2,p3);
        p4.atacarPersonaje(p4,p1);
        p5.atacarPersonaje(p5,p4);

        System.out.println();
        System.out.println("__________________________________");
        System.out.println("_________Encantamientos_______");
        System.out.println("__________________________________");
        //Creo algun mago
        Magos m1=new Magos("Mago1",700,300, 100,false,7);
        System.out.println("El 'Mago1' desencanta al personaje 'Vico'. Tiene que salir encantados=false.");
        System.out.println(m1.desencantar(p6));
        System.out.println();
        System.out.println("El 'Mago1' hace 2 encantamientos al personaje 'Vico' y 'Sara'. Tiene que salir encantados=true.");
        System.out.println(m1.encantar(p6));
        System.out.println(m1.encantar(p1));



        //
    }
}
