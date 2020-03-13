package ExamenU7RRN;

public class Raza {
    private String nomRaza;

    public Raza(String nomRaza) {
        this.nomRaza = nomRaza;
    }

    public String getNomRaza() {
        return nomRaza;
    }

    public void setNomRaza(String nomRaza) {
        this.nomRaza = nomRaza;
    }

    @Override
    public String toString() {
        return "Raza{" +
                "nomRaza='" + nomRaza + '\'' +
                '}';
    }
}
