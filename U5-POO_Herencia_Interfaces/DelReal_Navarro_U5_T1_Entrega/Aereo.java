package GarajeVehiculosHerencia;

public abstract class Aereo extends Vehiculo{
    //atrib
    protected int altitud;
    protected String codOaci;

    //constructor
    public Aereo(String nombre, int numPersonas, String codOaci) {
        super(nombre, numPersonas);
        this.altitud = 0;
        this.codOaci = codOaci;
    }
    /*
    public Aereo(String nombre, int numPersonas, int altitud, String codOaci) {
        super(nombre, numPersonas);
        this.altitud = altitud;
        this.codOaci = codOaci;
    }
    */
    //Getters y setters

    public int getAltitud() {
        return altitud;
    }

    public void altura(int altitud) {
        this.altitud = altitud;
    }

    public String getCodOaci() {
        return codOaci;
    }

    public void setCodOaci(String codOaci) {
        this.codOaci = codOaci;
    }

    //toString


    @Override
    public String toString() {
        return "Aereo{" + super.toString()+
                "altitud=" + altitud +
                ", codOaci='" + codOaci + '\'' +
                '}';
    }
    public String tipo(){
        return "Aereo{" + getClass().getSimpleName() +
                "altitud=" + altitud +
                ", codOaci='" + codOaci + '\'' +
                '}';
    }
}
