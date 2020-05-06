import com.google.gson.Gson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Paso 1. Creamos el objeto futbolista que vamos a transformar en cadena en formato Json

        //Crear las demarcaciones
    /*
    En el fichero principal por tanto, se debe crear un ArrayList de Futbolistas con la información anterior,
    y a partir de él y utilizando Gson generar una única String en formato Json que se deberá mostrar por pantalla.
     */

    //creo las listas de cada tipo de demarcacion
        //Nota: lo suyo seria hacer un metodo de esto
        ArrayList<String> demarcacionUno=new ArrayList<String>();
        demarcacionUno.add("Portero");

        ArrayList<String> demarcacionDos=new ArrayList<String>();
        demarcacionDos.add("Lateral derecho");
        demarcacionDos.add("Medio Centro");

        ArrayList<String> demarcacionTres=new ArrayList<String>();
        demarcacionTres.add("Central");

        ArrayList<String> demarcacionCuatro=new ArrayList<String>();
        demarcacionCuatro.add("Central");

        ArrayList<String> demarcacionCinco=new ArrayList<String>();
        demarcacionCinco.add("Lateral izquierdo");

        ArrayList<String> demarcacionSeis=new ArrayList<String>();
        demarcacionSeis.add("Defensa mediocampo");
        demarcacionSeis.add("Mediocampo");

        ArrayList<String> demarcacionSiete=new ArrayList<String>();
        demarcacionSiete.add("Defensa mediocampo");

        ArrayList<String> demarcacionOcho=new ArrayList<String>();
        demarcacionOcho.add("Mediocampo");

        ArrayList<String> demarcacionNueve=new ArrayList<String>();
        demarcacionNueve.add("Extremo izquierdo");
        demarcacionNueve.add("Falso extremo");

        ArrayList<String> demarcacionDiez=new ArrayList<String>();
        demarcacionDiez.add("Extremo derecho");
        demarcacionDiez.add("Mediocampo");

        ArrayList<String> demarcacionOnce=new ArrayList<String>();
        demarcacionOnce.add("Delantero centro");

        //creo el objeto de tipo Demarcacion al que le paso su lista correspondiente
        Demarcacion demOne=new Demarcacion(demarcacionUno);
        Demarcacion demTwo=new Demarcacion(demarcacionDos);
        Demarcacion demThree=new Demarcacion(demarcacionTres);
        Demarcacion demFour=new Demarcacion(demarcacionCuatro);
        Demarcacion demFive=new Demarcacion(demarcacionCinco);
        Demarcacion demSix=new Demarcacion(demarcacionSeis);
        Demarcacion demSeven=new Demarcacion(demarcacionSiete);
        Demarcacion demEight=new Demarcacion(demarcacionOcho);
        Demarcacion demNine=new Demarcacion(demarcacionNueve);
        Demarcacion demTen=new Demarcacion(demarcacionDiez);
        Demarcacion demEleven=new Demarcacion(demarcacionOnce);

        //creo el objeto futbolista
        Futbolista futOne=new Futbolista(1,"Casillas",demOne, "Real Madrid");
        Futbolista futTwo=new Futbolista(15, "Ramos",demTwo, "Real Madrid");
        Futbolista futThree=new Futbolista(3, "Pique", demThree, "FC Barcelona");
        Futbolista futFour=new Futbolista(5, "Puyol", demFour, "FC Barcelona");
        Futbolista futFive=new Futbolista(11, "Capdevila", demFive, "Villareal");
        Futbolista futSix=new Futbolista(14, "Xabi Alonso", demSix, "Real Madrid");
        Futbolista futSeven=new Futbolista(16, "Busquets", demSeven, "FC Barcelona");
        Futbolista futEight=new Futbolista(8, "Xavi Hernandez", demEight, "FC Barcelona");
        Futbolista futNine=new Futbolista(18, "Pedrito", demNine, "FC Barcelona");
        Futbolista futTen=new Futbolista(6, "Iniesta", demTen, "FC Barcelona");
        Futbolista futEleven=new Futbolista(6, "Iniesta", demEleven, "FC Barcelona");



        //Paso 2. Crear el objeto Gson que se encargará de las conversiones

        /*

En el fichero principal por tanto, se debe crear un ArrayList de Futbolistas con la información anterior,
y a partir de él y utilizando Gson generar una única String en formato Json que se deberá mostrar por pantalla.
         */

        ArrayList<Futbolista> listaFutbolista=new ArrayList<>(); //creo la lista de futbolistas e inserto
        //Nota: lo suyo seria hacer un metodo de esto
        listaFutbolista.add(futOne);
        listaFutbolista.add(futTwo);
        listaFutbolista.add(futThree);
        listaFutbolista.add(futFour);
        listaFutbolista.add(futFive);
        listaFutbolista.add(futSix);
        listaFutbolista.add(futSeven);
        listaFutbolista.add(futEight);
        listaFutbolista.add(futNine);
        listaFutbolista.add(futTen);
        listaFutbolista.add(futEleven);
        Gson gson=new Gson();


        //Paso 3. Convertir el objeto-compuesto a Json
        System.out.println(gson.toJson(listaFutbolista));







    }




}
