package StaX_RRN;
/**
 * Clase Pelicula
 * Informacion Lectura y escritura xml con StaX
 * @author Rocio del Real
 * @version 0.1
 */
public class Pelicula {
    //Atributos
    private String nacionalidad;
    private String nombre;
    private String director;
    private String publico;

    //Constructores
    //Constructor 1. Por defecto.
    public Pelicula() {
    }
    //Constructor 2. para usar a la hora de escribir en el fichero
    public Pelicula(String nacionalidad, String nombre, String director, String publico) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.director = director;
        this.publico = publico;
    }

    //Getters y Setters

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    //toString

    @Override
    public String toString() {
        return "Pelicula{" +
                "nacionalidad='" + nacionalidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                ", publico='" + publico + '\'' +
                '}';
    }
}
