package AlternativaEleganteMainOptima;

import java.util.ArrayList;
import java.util.List;

public class Demarcacion {
    //atributo
    private ArrayList<String> demarcacionD;

    //constructor

    public Demarcacion() {
    }

    public Demarcacion(ArrayList<String> demarcacion) {
        this.demarcacionD = demarcacion;
    }


    //Getters y Setters

    public ArrayList<String> getDemarcacionD() {
        return demarcacionD;
    }

    public void setDemarcacionD(ArrayList<String> demarcacion) {
        this.demarcacionD = demarcacion;
    }


    //toString

    @Override
    public String toString() {
        return "Demarcacion{" +
                "demarcacion=" + demarcacionD +
                '}';
    }


    //Metodo para hacer la Main2 mas elegante

    public static List<Demarcacion> demarcaciones() {

        ArrayList<String> demarcacionUno = new ArrayList<String>();
        demarcacionUno.add("Portero");

        ArrayList<String> demarcacionDos = new ArrayList<String>();
        demarcacionDos.add("Lateral derecho");
        demarcacionDos.add("Medio Centro");

        ArrayList<String> demarcacionTres = new ArrayList<String>();
        demarcacionTres.add("Central");

        ArrayList<String> demarcacionCuatro = new ArrayList<String>();
        demarcacionCuatro.add("Central");

        ArrayList<String> demarcacionCinco = new ArrayList<String>();
        demarcacionCinco.add("Lateral izquierdo");

        ArrayList<String> demarcacionSeis = new ArrayList<String>();
        demarcacionSeis.add("Defensa mediocampo");
        demarcacionSeis.add("Mediocampo");

        ArrayList<String> demarcacionSiete = new ArrayList<String>();
        demarcacionSiete.add("Defensa mediocampo");

        ArrayList<String> demarcacionOcho = new ArrayList<String>();
        demarcacionOcho.add("Mediocampo");

        ArrayList<String> demarcacionNueve = new ArrayList<String>();
        demarcacionNueve.add("Extremo izquierdo");
        demarcacionNueve.add("Falso extremo");

        ArrayList<String> demarcacionDiez = new ArrayList<String>();
        demarcacionDiez.add("Extremo derecho");
        demarcacionDiez.add("Mediocampo");

        ArrayList<String> demarcacionOnce = new ArrayList<String>();
        demarcacionOnce.add("Delantero centro");

        Demarcacion demOne = new Demarcacion(demarcacionUno);
        Demarcacion demTwo = new Demarcacion(demarcacionDos);
        Demarcacion demThree = new Demarcacion(demarcacionTres);
        Demarcacion demFour = new Demarcacion(demarcacionCuatro);
        Demarcacion demFive = new Demarcacion(demarcacionCinco);
        Demarcacion demSix = new Demarcacion(demarcacionSeis);
        Demarcacion demSeven = new Demarcacion(demarcacionSiete);
        Demarcacion demEight = new Demarcacion(demarcacionOcho);
        Demarcacion demNine = new Demarcacion(demarcacionNueve);
        Demarcacion demTen = new Demarcacion(demarcacionDiez);
        Demarcacion demEleven = new Demarcacion(demarcacionOnce);

        ArrayList<Demarcacion> totalDemarcacion = new ArrayList<Demarcacion>();

        totalDemarcacion.add(demOne);
        totalDemarcacion.add(demTwo);
        totalDemarcacion.add(demThree);
        totalDemarcacion.add(demFour);
        totalDemarcacion.add(demFive);
        totalDemarcacion.add(demSix);
        totalDemarcacion.add(demSeven);
        totalDemarcacion.add(demEight);
        totalDemarcacion.add(demNine);
        totalDemarcacion.add(demTen);
        totalDemarcacion.add(demEleven);

        return totalDemarcacion;

    }
}
