package ExamenU7RRN;
/*
De los propietarios de los perros deberemos guardar a su vez los siguiente datos:

El nombre.
Los apellidos.
El número de socio de la Sociedad Canina Mundial.
El país de origen.
 */
public class Propietario {
    //atrib
    private String nombrePropietario;
    private String apellidos;
    private String numSocio;
    private String pais;

    //constr

    public Propietario(String nombrePropietario, String apellidos, String numSocio, String pais) {
        this.nombrePropietario = nombrePropietario;
        this.apellidos = apellidos;
        this.numSocio = numSocio;
        this.pais = pais;
    }

    //getters y setters


    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //toString

    @Override
    public String toString() {
        return "Propietario{" +
                "nombrePropietario='" + nombrePropietario + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numSocio='" + numSocio + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
