package AlternativaEleganteMainOptima;

import java.util.ArrayList;
import java.util.List;

public class Futbolista {
    //Atributos
    private int dorsal;
    private String nombre;
    private Demarcacion demarcacion;
    private String equipo;

    //Constructor

    public Futbolista() {
    }

    public Futbolista(int dorsal, String nombre, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public Futbolista(int dorsal, String nombre, Demarcacion demarcacion, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcacion = demarcacion;
        this.equipo = equipo;
    }
//Getters y setters

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Demarcacion getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(Demarcacion demarcacion) {
        this.demarcacion = demarcacion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    //toString


    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", demarcacion=" + demarcacion +
                ", equipo='" + equipo + '\'' +
                '}';
    }

    //Metodos para hacer una main menos tocha y que sea mas elegante
    public static List<Futbolista> createList() {

        String[] nombre = { "Casillas", "Ramos", "Pique", "Puyol", "Capdevila", "Xabi Alonso", "Busquets",
                "Xavi Hernandez", "Pedrito", "Iniesta", "Villa" };
        Integer[] dorsal = { 1, 15, 3, 5, 11, 14, 16, 8, 18, 6, 7 };
        String[] equipo = { "Real Madrid", "Real Madrid", "FC Barcelona", "FC Barcelona", "Villareal", "Real Madrid",
                "FC Barcelona", "FC Barcelona", "FC Barcelona", "FC Barcelona", "FC Barcelona" };
        List<Demarcacion> listDemarcacion = Demarcacion.demarcaciones();

        List<Futbolista> listFutbolistas = new ArrayList<Futbolista>();

        for (int i = 0; i < 11; i++) {
            Futbolista futbolista = new Futbolista(dorsal[i], nombre[i], listDemarcacion.get(i), equipo[i]);
            listFutbolistas.add(futbolista);
        }

        return listFutbolistas;

    }
}
