package GarajeVehiculosHerencia;

public class Moto extends Terrestre {
    //constructor
    public Moto(String matricula, String nombre, int numPersonas, int anyo, Color color) {
        super(matricula, nombre, numPersonas, anyo, color);
    }

    @Override
    public String toString() {
        return "Moto{"+super.toString()+"}";
    }

}
