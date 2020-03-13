package ExamenU7RRN;

import java.util.Comparator;
//ordena por edad de forma decreciente
public class ComparaEdad implements Comparator<Perro> {

    @Override
    public int compare(Perro p1, Perro p2) {
        return p2.getEdad()-p1.getEdad();
    }
}
