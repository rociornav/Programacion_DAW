package ExamenT5RRN;

import java.util.Comparator;

public class CompararDefensa implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Personaje p1=(Personaje)o;
        Personaje p2=(Personaje)t1;
        return p1.getCapacidadDefensa()-p2.getCapacidadDefensa(); //para int
    }
}
