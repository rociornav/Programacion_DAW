package Pizzeria_RRN;
/**
 * Clase Ingrediente
 * Información Pizzeria
 * @author Rocío del Real
 * @version 0.1
 */
public class Ingrediente {
    //Atributos
    private String mNombre;
    private int mNumCalorias;

    //Constructores:

    /**
     * Constructor numero 1. para inciar los valores por defecto. Sin pasar parámetros.
     */
    public Ingrediente() {
        this.mNombre = "Queso";
        this.mNumCalorias = 250;
    }

    /**
     * Constructor numero 2. El usuario fijara los valores desde la main.
     * @param nom
     * @param calorias
     */
    public Ingrediente(String nom, int calorias) {
        this.mNombre = nom;
        this.mNumCalorias = calorias;
    }

    //Metodos getters y setters

    /**
     * Metodo para obtener el nombre del ingrediente de la pizza.
     * @return nombre del ingrediente.
     */
    public String getmNombre() {
        return mNombre;
    }

    /**
     * Metodo para fijar otro ingrediente.
     * @param mNombre nombre del nuevo ingrediente.
     */
    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    /**
     * Metodo para obtener el numero de ingredientes por pizza.
     * @return devuelve un int, la cantidad de ingredientes.
     */
    public int getmNumCalorias() {
        return mNumCalorias;
    }


    /**
     * Metodo para fijar un nuevo valor en la cantidad de calorias.
     * @param mNumCalorias le pasamos como parametro la cantidad de calorias inicial.
     */
    public void setmNumCalorias(int mNumCalorias) {
        this.mNumCalorias = mNumCalorias;
    }

    /**
     * Metodo para mostrar la informacion referente a los ingredientes de la pizza.
     * @return devuelve una String.
     */
    @Override
    public String toString() {
        return "Ingrediente{" +
                "mNombre='" + mNombre + '\'' +
                ", mNumCalorias=" + mNumCalorias +
                '}';
    }
}
