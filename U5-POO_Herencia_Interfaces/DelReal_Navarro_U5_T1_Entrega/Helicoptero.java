package GarajeVehiculosHerencia;

public class Helicoptero extends Aereo {

    //Constr.
    public Helicoptero(String nombre, int numPersonas, String codOaci) {
        super(nombre, numPersonas, codOaci);
    }

    /*public Helicoptero(String nombre, int numPersonas, int altitud, String codOaci) {
        super(nombre, numPersonas, altitud, codOaci);
    }*/
    //tostring

    @Override
    public String toString() {
        return "Helicoptero{"+super.toString()+"}";
    }
}
