import java.util.ArrayList;

public class Demarcacion {
    //atributo
    private ArrayList<String> demarcacion;

    //constructor

    public Demarcacion() {
    }

    public Demarcacion(ArrayList<String> demarcacion) {
        this.demarcacion = demarcacion;
    }


    //Getters y Setters

    public ArrayList<String> getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(ArrayList<String> demarcacion) {
        this.demarcacion = demarcacion;
    }


    //toString

    @Override
    public String toString() {
        return "Demarcacion{" +
                "demarcacion=" + demarcacion +
                '}';
    }
}
