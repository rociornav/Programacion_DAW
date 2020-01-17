package Pizzeria_RRN;

import java.util.Arrays;

/**
 * Clase Pizza
 * Informacion Pizzeria
 * @author Rocio del Real
 * @version 0.1
 */
public class Pizza {

    //Atributos:
    public enum size {MEDIANA, FAMILIAR}
    public size mSize; //se refiere al tamanyo de la pizza.
    //Lista de hasta 3 ingredientes
    private Ingrediente[] mIngredientes;


    //Constructores:

    /**
     * Constructor numero 1. El usuario especifica el tamanyo de la pizza. Siempre habra 3 ingredientes como maximo.
     * @param mSize
     */
    public Pizza(size mSize) {
        this.mSize = mSize;
        this.mIngredientes = new Ingrediente[3];
    }

    /**
     * Constructor numero 2. Si el usuario no determina el tamanyo, por defecto sera Familiar y habra 3 ingredientes como
     * maximo.
     */
    public Pizza(){
        this.mSize = size.FAMILIAR;
        this.mIngredientes = new Ingrediente[3];
    }

    //Metodos getters y setters

    /**
     * Obtiene el tamanyo definido por el usuario, y en caso de no fijar ninguno sera el tamanyo familiar.
     * @return un valor tipo size.
     */
    public size getmSize() {
        return mSize;
    }

    /**
     * Fija el tamanyo deseado de la pizza.
     * @param mSize se le pasa por parametro el tamanyo (cualquiera de los disponibles: mediana o familiar).
     */
    public void setmSize(size mSize) {
        this.mSize = mSize;
    }

    /**
     * Obtiene los ingredientes de la lista de Ingredientes
     * @return te devuelve una lista
     */
    public Ingrediente[] getmIngredientes() {
        return mIngredientes;
    }

    /**
     * Metodo que pone un nuevo ingrediente en la lista de Ingredientes.
     * @param mIngredientes se le pasa una lista de ingredientes.
     */
    public void setmIngredientes(Ingrediente[] mIngredientes) {
        this.mIngredientes = mIngredientes;
    }


    /**
     * contarIngredientes() cuenta los ingredientes que lleva una pizza.
     * @return devuelve un int con el numero de ingredientes.
     */
    public int contarIngredientes(){
        int contIngredientes=0;
        //bucle para contar ingredientes
        for (int i = 0; i < mIngredientes.length; i++) {
            if(!(mIngredientes[i]==null)){
                contIngredientes++;
            }

        }
        return contIngredientes;
    }

    /**
     * Este metodo inserta un nuevo ingrediente en caso de haber espacio en la lista (menos de 3 ingredientes)
     * @param ingrediente, le pasamos por parametro el ingrediente a insertar.
     * @return un boolean true en caso de poder insertar el ingrediente, y false en caso contrario.
     */
    public boolean anyadirIngrediente(Ingrediente ingrediente){
        //Cuando hay espacio en la lista Ingredientes
        for (int i = 0; i < mIngredientes.length ; i++) {
            if(contarIngredientes()<mIngredientes.length){
                this.mIngredientes[contarIngredientes()]=ingrediente; //me lo pone en la ultima posicion
                //contIngredientes++; se actualiza ya en la funcion contarIngredientes.
                return true;
            }
        }
        return false;
    }

    /*
    Esta clase debe tener un método de clase que nos muestre por pantalla todos los
     tamaños disponibles para la clase Pizza.
     */

    /**
     * Metodo tipo String que muestra la informacion de la pizza en general
     * @return devuelve un texto con los datos de la pizza
     */
    public String datosPizza() {
        String texto="La pizza tiene: ";
        for (int i = 0; i <mIngredientes.length ; i++) {
            if(mIngredientes[i]!=null){
                texto+=mIngredientes[i].getmNombre()+" de "+mIngredientes[i].getmNumCalorias()+" gramos.";
            }
        }
        texto+=" Y es de tamanyo "+mSize;
        return texto;
    }

    /**
     * Metodo tipo String que muestra todos los tamanyos disponibles de la pizza
     * @return devuelve el texto con todos los tamanyos
     */
    public String datoSize(){

        return mSize.FAMILIAR+" y "+mSize.MEDIANA;
    }


}
