public class Asignatura {
    //atributos
    private Integer id;
    private String nombre;
    private Integer idAlumno;
    //constructores

    public Asignatura() {
    }

    public Asignatura(Integer id, String nombre, Integer idAlumno) {
        this.id = id;
        this.nombre = nombre;
        this.idAlumno = idAlumno;
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

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    //toString

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", idAlumno=" + idAlumno +
                '}';
    }
}
