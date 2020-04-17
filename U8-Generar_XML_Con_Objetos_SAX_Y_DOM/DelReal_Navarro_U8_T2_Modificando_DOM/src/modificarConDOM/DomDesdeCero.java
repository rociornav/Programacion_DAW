package modificarConDOM;
/**
 * Clase DomDesdeCero
 * Informacion Modificar con DOM
 * @author Rocio del Real
 * @version 0.1
 */
import java.util.List;

public class DomDesdeCero {
    ////U8_T2_Modificación con DOM y guardado a fichero (Parte 2: Crear una clase DomDesdeCero en cuyo main debes:)
    public static void main(String[] args) {
        //Apartado a. Crear un ArrayList con al menos 10 objetos. Dichos objetos deben tener al menos 4 atributos. La clase del Objeto deberá crearse en un fichero aparte.
        List<Persona> listPersonas = Persona.getListPersonas();

        //Apartado b. Usando DOM volcar el contenido de ese ArrayList al fichero XML cero.xml
        Persona.createDOMtoXMLPersonas(listPersonas, "cero.xml");

    }
}
