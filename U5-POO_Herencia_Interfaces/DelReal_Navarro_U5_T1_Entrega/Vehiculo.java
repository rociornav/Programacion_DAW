package GarajeVehiculosHerencia;

public abstract class Vehiculo {
    //Atributos
    protected String nombre;
    protected int numPersonas;
    protected int persona;


    //Constructor

    public Vehiculo(String nombre, int numPersonas) {
        this.nombre = nombre;
        this.numPersonas = numPersonas;
        this.persona=0; //al ppio no hay nadie.
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    //metodo transportar
    public void transportar(int persona){

        if(persona<=this.numPersonas){
            this.persona=persona;
        }else{
            System.out.println("No entran más personas, no hay tantas plazas.");
        }
    }
    //toString

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", numPersonas=" + numPersonas +
                ", persona=" + persona +
                '}';
    }
}
