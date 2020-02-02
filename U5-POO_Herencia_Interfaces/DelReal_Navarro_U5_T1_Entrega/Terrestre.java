package GarajeVehiculosHerencia;

import java.util.Objects;

public abstract class Terrestre extends Vehiculo implements Comparable{
    //atributos
    protected String matricula;
    protected int anyoFabricacion;
    protected Color color;

    //constructor
    public Terrestre(String matricula, String nombre, int numPersonas, int anyo, Color color) {
        super(nombre, numPersonas);
        this.matricula=matricula;
        this.anyoFabricacion=anyo;
        this.color=color;
    }

    //Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //toString

    @Override
    public String toString() {
        return "Terrestre{" + super.toString()+
                "matricula='" + matricula + '\'' +
                ", anyoFabricacion=" + anyoFabricacion +
                ", color=" + color +
                '}';
    }

    //equals basado en la matricula


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return getMatricula().equals(terrestre.getMatricula());
    }
    //Comparable con ordenacion natural matricula.
    @Override
    public int compareTo(Object o) {
        Terrestre t=(Terrestre)o;
        return getMatricula().compareTo(t.getMatricula());
    }

    //Nota: aplique comparator en la main con una clase anonima para motos y coches.


}
