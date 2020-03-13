package ExamenU7RRN;

import java.util.Comparator;
//decreciente
public class ComparaPeso implements Comparator<Perro> {
    @Override
    public int compare(Perro p1, Perro p2) {
        return (int) (p2.getPeso()-p1.getPeso());
    }
}
