public class Estadistica {
    //atributos
    private int goles;
    private int pases;
    private int faltas;
    //constructores

    public Estadistica() {
    }

    public Estadistica(int goles, int pases, int faltas) {
        this.goles = goles;
        this.pases = pases;
        this.faltas = faltas;
    }

    //Getters y setters

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    //toString

    @Override
    public String toString() {
        return "Estadistica{" +
                "goles=" + goles +
                ", pases=" + pases +
                ", faltas=" + faltas +
                '}';
    }
}
