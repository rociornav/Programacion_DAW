package ExamenT5RRN;

public abstract class Hombres extends Personaje{
    //constr
    public Hombres(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantados) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantados);
    }
    //defino el metodo toString


    @Override

    public String toString() {
        return "Hombres:"+super.toString();
    }
}
