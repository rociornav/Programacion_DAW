package GarajeVehiculosHerencia;

public class Avioneta extends Aereo {
    //constr
    public Avioneta(String nombre, int numPersonas, String codOaci) {
        super(nombre, numPersonas, codOaci);
    }
    /*
    public Avioneta(String nombre, int numPersonas, int altitud, String codOaci) {
        super(nombre, numPersonas, altitud, codOaci);
    }*/


    @Override
    public String toString() {
        return "Avioneta{"+super.toString()+"}";
    }
}
