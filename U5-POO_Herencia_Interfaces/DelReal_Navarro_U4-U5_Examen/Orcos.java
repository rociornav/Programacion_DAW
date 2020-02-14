package ExamenT5RRN;

public class Orcos extends Personaje{
    //atrib
    private double tonelaje;

    //constr
    public Orcos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantados, double ton) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantados);
        this.tonelaje=ton;
    }

    //getters y setters

    public double getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(double tonelaje) {
        this.tonelaje = tonelaje;
    }

    //toString

    @Override
    public String toString() {
        return "Orcos: " + super.toString()+
                "tonelaje=" + tonelaje;
    }
}
