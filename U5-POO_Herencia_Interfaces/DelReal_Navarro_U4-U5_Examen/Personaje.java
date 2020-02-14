package ExamenT5RRN;

public abstract class Personaje  {
    //atributos
    protected String nombre;
    protected int energia;
    protected int capacidadAtaque;
    protected int capacidadDefensa;
    protected boolean encantados;
    protected int numMuertos;
    protected int numPersonajes;

    //constructor

    public Personaje(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantados) {
        this.nombre = nombre;
        this.energia = energia;
        this.capacidadAtaque = capacidadAtaque;
        this.capacidadDefensa = capacidadDefensa;
        this.encantados = encantados;
        this.numMuertos = 0;
        this.numPersonajes = 0;
    }

/*
  public Personaje(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, boolean encantados) {
        this.nombre = nombre;
        //energia entre 0 y 1000: si es menor o igual a cero-->muerto
        if(this.energia>0 || this.energia<=1000){
            this.energia=energia;
            numPersonajes++;
        }else if(energia<=0) {
            numMuertos++;
        }
        //capAtaque: entre 0 y 1000
        if(this.capacidadAtaque>0 || this.capacidadAtaque<=1000){
            this.capacidadAtaque=capacidadAtaque;

        }

        //capDefensa: entre 0 y 100
       if(this.capacidadDefensa>0 || this.capacidadDefensa<=100){
            this.capacidadAtaque=capacidadAtaque;
       }

        this.encantados = encantados;
    }
 */
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getCapacidadAtaque() {
        return capacidadAtaque;
    }

    public void setCapacidadAtaque(int capacidadAtaque) {
        this.capacidadAtaque = capacidadAtaque;
    }

    public int getCapacidadDefensa() {
        return capacidadDefensa;
    }

    public void setCapacidadDefensa(int capacidadDefensa) {
        this.capacidadDefensa = capacidadDefensa;
    }

    public boolean isEncantados() {
        return true;
    }

    public void setEncantados(boolean encantados) {
        this.encantados = encantados;
    }

    //completo el cuerpo del metodo de la interfaz Atacar




    //toString


    @Override
    public String toString() {
        return "Personaje: " +
                "Nombre ='" + nombre + '\'' +
                ", energia=" + energia +
                ", capacidadAtaque=" + capacidadAtaque +
                ", capacidadDefensa=" + capacidadDefensa +
                ", encantados=" + encantados +
                ", numMuertos=" + numMuertos +
                ", numPersonajes=" + numPersonajes +
                '}';
    }


}


