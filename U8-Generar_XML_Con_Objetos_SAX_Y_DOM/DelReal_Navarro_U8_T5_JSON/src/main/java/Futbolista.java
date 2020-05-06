import java.util.ArrayList;

/*
Se desea generar una cadena en formato json que contenga la alineación de la selección española que ganó
el mundial de Fútbol.

Se tiene por tanto, que implementar una clase Futbolista, que contenga un entero para el dorsal,
un String para el nombre y una lista de dermacaciones posibles en las que puede jugar.
También se tendrá un atributo (un String) para el equipo del que procede.
 */
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
}
