package ExamenT5RRN;

import java.util.Comparator;

public class CompararAtaque implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Personaje p1=(Personaje)o;
        Personaje p2=(Personaje)t1;
        return p1.getCapacidadAtaque()-p2.getCapacidadAtaque(); //para int
    }
}
