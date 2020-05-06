public class Futbolista {
    //atributos
    private Integer id;
    private String nombre;
    private String equipo;
    private Estadistica estadistica;

    //constructores

    public Futbolista() {
    }

    public Futbolista(Integer id, String nombre, String equipo, Estadistica estadistica) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.estadistica = estadistica;
    }

    //getters y setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Estadistica getEstadistica() {
        return estadistica;
    }

    public void setEstadistica(Estadistica estadistica) {
        this.estadistica = estadistica;
    }

    //toString
    @Override
    public String toString() {
        return "Futbolista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", estadistica=" + estadistica +
                '}';
    }
}
