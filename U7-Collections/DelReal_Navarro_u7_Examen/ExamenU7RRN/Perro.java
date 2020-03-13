package ExamenU7RRN;

import java.io.Serializable;

/*
De cada uno de los perros debemos guardar la siguiente lista de atributos:

El nombre del perro.
La edad (un entero, no hace falta que sea una fecha de nacimiento).
El peso del perro.
Si tienen o no tienen todas las vacunas requeridas.
El Propietario del perro.
Y por supuesto la raza del mismo.
 */
public class Perro implements Serializable {
    //atrib
    private String nombrePerro;
    private int edad;
    private double peso;
    private boolean estaVacunado;
    private String propietario;
    private Raza raza;

    //constr


    public Perro(String nombrePerro, int edad, double peso, boolean estaVacunado, String propietario, Raza raza) {
        this.nombrePerro = nombrePerro;
        this.edad = edad;
        this.peso = peso;
        this.estaVacunado = estaVacunado;
        this.propietario = propietario;
        this.raza = raza;
    }

    public Perro(Raza raza) {
        this.raza=raza;
    }

    //getters y setters


    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEstaVacunado() {
        return estaVacunado;
    }

    public void setEstaVacunado(boolean estaVacunado) {
        this.estaVacunado = estaVacunado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }


    //toString

    @Override
    public String toString() {
        return "Perro{" +
                "nombrePerro='" + nombrePerro + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", estaVacunado=" + estaVacunado +
                ", propietario='" + propietario + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }


}
