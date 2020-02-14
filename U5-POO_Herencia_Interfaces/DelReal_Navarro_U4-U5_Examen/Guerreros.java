package ExamenT5RRN;

public class Guerreros extends Hombres {
    //atrib
    private int edad;

    //constr
    public Guerreros(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantados, int ed) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantados);
        this.edad=ed;
    }
    //getters y setters

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //toString

    @Override
    public String toString() {
        return "Guerreros:" +super.toString()+
                "edad=" + edad;
    }
}
