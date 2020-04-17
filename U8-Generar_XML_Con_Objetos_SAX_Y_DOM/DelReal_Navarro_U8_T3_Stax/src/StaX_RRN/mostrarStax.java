package StaX_RRN;
/**
 * Clase mostrarStax
 * Informacion Lectura xml con StaX
 * @author Rocio del Real
 * @version 0.1
 */
/*
Crear una clase mostrarStax que en el main de esa misma clase, que es el método que se ejecutará, debe:
Recorrer el fichero XML con Stax
Mostrar por pantalla el contenido del fichero XML.
Se valorará que la salida esté lo mejor maquetada posible.
 */
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class mostrarStax {
    public static void main(String[] args) {
        //Relleno esta estructura de datos con los datos del fichero XML peliculas.xml
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        Pelicula peliculaActual = null;
        String tagActual="";
        try{
            //Paso 1. Obtener el objeto XMLEventReader
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("peliculas.xml"));
            //Paso 2. Iterar sobre la lista de eventos
            while (xmlReader.hasNext()){
                //Obtengo el evento siguiente que voy a tratar
                XMLEvent xmlEvent = xmlReader.nextEvent();
                //evento de apertura de etiqueta
                if (xmlEvent.isStartElement()) {

                    //Obtengo la información de la etiqueta
                    StartElement startTag = xmlEvent.asStartElement();

                    //Inicio la apertura de la etiqueta pero no lo cierro por si tiene atributos
                    System.out.print("<"+ startTag.getName().getLocalPart());

                    //Dependiendo del nombre la etiqueta
                    //Establezco tagActual al nombre de la etiqueta que he detectado
                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName) {
                        case "pelicula" :

                            //Empieza una pelicula tengo que crear el objeto para añadirlo
                            //posteriormente al ArrayList
                            peliculaActual = new Pelicula();
                            tagActual = "pelicula";

                            //Es la única etiqueta que tiene atributos
                            //Si tuviera varios
                            //Iterator it = startTag.getAttributes();
                            //Tendría que recorrerlo como hemos hecho hasta ahora
                            Attribute nacionalidad = startTag.getAttributeByName(new QName("nacionalidad"));

                            peliculaActual.setNacionalidad(nacionalidad.getValue());

                            System.out.print(" "+nacionalidad.getName()+"=\""+nacionalidad.getValue()+"\"");
                            break;

                        case "nombre" :
                            //Establezco cuál es la etiqueta que estoy tratando
                            tagActual = "nombre";
                            break;

                        case "director" :
                            //Establezco cuál es la etiqueta que estoy tratando
                            tagActual = "director";
                            break;

                        case "publico" :
                            //Establezco cuál es la etiqueta que estoy tratando
                            tagActual = "publico";
                            break;
                    }

                    //Cierro la etiqueta de apertura
                    System.out.print(">");

                } else if (xmlEvent.isEndElement()) {

                    //Si he recibido el evento de fin de una etiqueta
                    //Muestro la etiqueta de cierre
                    EndElement endtag = xmlEvent.asEndElement();
                    System.out.println("<\\" + endtag.getName().getLocalPart()+">");

                    //Si estoy cerrando pedido ya tengo el pedido relleno lo añado a la lista
                    if (endtag.getName().getLocalPart().equals("pedido")) {
                        peliculas.add(peliculaActual);
                    }

                    //Ya no estoy dentro de ninguna de las etiquetas
                    tagActual = "";

                } else if (xmlEvent.isStartDocument()) {
                    System.out.println("Inicio del parseado con StaX");

                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("Fin del parseado con StaX");

                } else if (xmlEvent.isCharacters()) {

                    //Estoy en un nodo de texto
                    Characters texto = xmlEvent.asCharacters();

                    //suponiendo que el texto de las etiquetas nodo no lleva un salto de línea
                    if (!texto.getData().contains("\n")) {
                        System.out.print(texto.getData());
                    }

                    //Añado el texto de dentro de las etiquetas al objeto que estoy creando (peliculaActual)
                    if (!tagActual.equals("")) {
                        switch (tagActual) {
                            case "nombre" :
                                peliculaActual.setNombre(texto.getData());
                                break;
                            case "director" :
                                peliculaActual.setDirector(texto.getData());
                                break;
                            case "publico" :
                                peliculaActual.setPublico(texto.getData());
                                break;
                        }
                    }
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        //Al salir del bloque ya tengo en la lista todas las peliculas, y puedo mostrarlas por consola
        System.out.println(peliculas);
    }
}
