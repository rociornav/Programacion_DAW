package ExamenT5RRN;

public class Elfos extends Personaje {
    //Atrib
    private TipoElfo tipo;

    //constr
    public Elfos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantados, TipoElfo tip) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantados);
        this.tipo=tip;
    }
    //getter y setters

    public TipoElfo getTipo() {
        return tipo;
    }

    public void setTipo(TipoElfo tipo) {
        this.tipo = tipo;
    }

    //toString

    @Override
    public String toString() {
        return "Información Elfos: " +super.toString()+
                "tipo=" + tipo;
    }
}
