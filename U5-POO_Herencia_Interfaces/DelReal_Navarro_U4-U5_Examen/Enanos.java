package ExamenT5RRN;

public class Enanos extends Personaje{
    private double altura;
    //constr
    public Enanos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantados, int altura) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantados);
        this.altura=altura;
    }

    //getters y setters

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //toString

    @Override
    public String toString() {
        return "Enanos: " + super.toString()+
                "altura=" + altura;
    }
}
