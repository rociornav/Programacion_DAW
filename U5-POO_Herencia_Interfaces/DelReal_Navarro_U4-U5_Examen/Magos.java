package ExamenT5RRN;

public class Magos extends Hombres implements Magia{
    //atrib
    private double longitudBarba;

    //constr
    public Magos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantados, double longi) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa, encantados);
        this.longitudBarba=longi;
    }
    //Metodos toString

    @Override
    public String toString() {
        return "Magos:" +super.toString()+
                "longitudBarba=" + longitudBarba;
    }

    //implemento los metodos de la interfaz Magia
    @Override
    public boolean encantar(RPG tipoPersonaje) {
       return this.encantados=true;
    }

    @Override
    public boolean desencantar(RPG tipoPersonaje) {
        return this.encantados=false;
    }
}
