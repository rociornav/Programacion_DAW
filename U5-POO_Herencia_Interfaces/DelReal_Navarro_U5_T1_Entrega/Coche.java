package GarajeVehiculosHerencia;

public class Coche extends Terrestre {

    //constructor
    public Coche(String matricula, String nombre, int numPersonas, int anyo, Color color) {
        super(matricula, nombre, numPersonas, anyo, color);
    }
    @Override
    public String toString() {
        return "Coche{"+super.toString()+"}";
    }





}
