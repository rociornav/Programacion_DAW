package Pizzeria_RRN;

/**
 * Clase Main
 * Informacion Pizzeria
 * @author Rocio del Real
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Probando la funcionalidad de la Clase Ingrediente: ");
        System.out.println("*** a). Sin especificar ingrediente: ***");
        Ingrediente ing1=new Ingrediente();
        System.out.println(ing1.toString());
        System.out.println("*** b). Especificar ingrediente (le pongo 2): ***");
        Ingrediente cebolla=new Ingrediente("Cebolla",100);
        System.out.println(cebolla.toString());
        Ingrediente tomate=new Ingrediente("Tomate",150);
        System.out.println(tomate.toString());
        System.out.println();
        System.out.println("_______________________________________________________________");
        System.out.println();


        System.out.println();
        System.out.println("_______________________________________________________________");
        System.out.println();
        System.out.println("***Probando la clase Pizza*** ");
        System.out.println("Especifico que quiero la pizza de tamanyo mediano. ");
        Pizza pizza1=new Pizza(Pizza.size.MEDIANA);
        System.out.println("Cuento los ingredientes y muestro los datos de la pizza: ");
        //inserto ingredientes
        pizza1.anyadirIngrediente(cebolla);
        pizza1.anyadirIngrediente(tomate);
        pizza1.contarIngredientes();
        System.out.println(pizza1.datosPizza());
        System.out.println();
        System.out.println("_______________________________________________________________");
        System.out.println();
        System.out.println("Mostrar tamanyos disponibles de las pizzas: ");
        System.out.println(pizza1.datoSize());

    }
}
