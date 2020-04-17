package StaX_RRN;
/**
 * Clase crearStaxCero
 * Informacion Escritura xml con StaX
 * @author Rocio del Real
 * @version 0.1
 */
/*
Crear una clase crearStaxCero en cuyo main debes:
Crear un ArrayList con al menos 10 objetos. Dicho objetos deben tener al menos 4 atributos. La clase del Objeto deberá crearse en un fichero aparte.
Usando Stax volcar el contenido de ese ArrayList al fichero XML stax.xml
Se valorará que el fichero esté lo mejor maquetado posible.
 */

import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class crearStaxCero {
    public static void main(String[] args) {

        ArrayList<Pelicula> peliculas = new ArrayList<>();

        //Creo los 10 objetos necesarios
        Pelicula p1 = new Pelicula("francesa", "Amelie", "director1", "publico1");
        Pelicula p2 = new Pelicula("británica", "El pianista", "director2", "publico2");
        Pelicula p3 = new Pelicula("americana", "Mujercitas", "director3", "publico3");
        Pelicula p4 = new Pelicula("americana", "Pulp Fiction", "director4", "publico4");
        Pelicula p5 = new Pelicula("española", "El Orfanato", "director5", "publico5");
        Pelicula p6 = new Pelicula("americana", "Puñales por la espalda", "director6", "publico6");
        Pelicula p7 = new Pelicula("española", "Lo imposible", "director7", "publico7");
        Pelicula p8 = new Pelicula("italiana", "La hora del cambio", "director8", "publico8");
        Pelicula p9 = new Pelicula("alemana", "La sombra del pasado", "director9", "publico9");
        Pelicula p10 = new Pelicula("francesa", "Los niños del coro", "director10", "publico10");

        //Los añado a la lista peliculas
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        peliculas.add(p4);
        peliculas.add(p5);
        peliculas.add(p6);
        peliculas.add(p7);
        peliculas.add(p8);
        peliculas.add(p9);
        peliculas.add(p10);


        try {
            //Creo el objeto que me va a servir para escribir (Usando Stax volcar el contenido de ese ArrayList al fichero XML stax.xml)
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("stax.xml"));

            //Creo el objeto que me va a servir para crear los eventos
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            //Creo el evento de principio de documento y lo escribo con el objeto escritor
            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);

            //Creo el evento para introducir el salto de línea y el de salto de línea con tabulador
            //Los usaré para maquetar el fichero correctamente (aunque no son estrictamente necesarios)
            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);


            //Creo el evento necesario para crear la etiqueta raíz peliculas
            StartElement peliculasStartElement = eventFactory.createStartElement("", "", "peliculas");
            xmlWriter.add(peliculasStartElement);
            xmlWriter.add(saltoDeLineaTab);


            int longitud = 0;
            //Recorro las peliculas y voy creando las etiquetas (eventos) necesarias para cada una
            for (Pelicula p : peliculas) {

                //Creo todas las etiquetas de apertura  que va a tener cada uno de los pedidos
                StartElement peliculaStart = eventFactory.createStartElement("", "", "pelicula");
                StartElement nombreStart = eventFactory.createStartElement("", "", "nombre");
                StartElement directorStart = eventFactory.createStartElement("", "", "director");
                StartElement publicoStart = eventFactory.createStartElement("", "", "publico");

                //Creo el atribudo nacionalidad tipo String
                Attribute nacionalidad = eventFactory.createAttribute("nacionalidad", p.getNacionalidad());

                //Creo todas las etiquetas de cierre que va a tener cada pelicula
                EndElement peliculaEnd = eventFactory.createEndElement("", "", "pelicula");
                EndElement nombreEnd = eventFactory.createEndElement("", "", "nombre");
                EndElement directorEnd = eventFactory.createEndElement("", "", "director");
                EndElement publicoEnd = eventFactory.createEndElement("", "", "publico");

                //Creo los contenidos
                Characters nombre = eventFactory.createCharacters(p.getNombre());
                Characters director = eventFactory.createCharacters(p.getDirector());
                Characters publico = eventFactory.createCharacters(p.getPublico());

                //Inserto los elementos correspondientes a una pelicula en el orden que es necesario
                xmlWriter.add(peliculaStart);

                //Inserto el atributo
                xmlWriter.add(nacionalidad);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                //Lo hijos de cada pelicula + dar formato
                xmlWriter.add(nombreStart);
                xmlWriter.add(nombre);
                xmlWriter.add(nombreEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(directorStart);
                xmlWriter.add(director);
                xmlWriter.add(directorEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(publicoStart);
                xmlWriter.add(publico);
                xmlWriter.add(publicoEnd);
                xmlWriter.add(saltoDeLineaTab);

                //Cierro la pelicula que estoy escribiendo
                xmlWriter.add(peliculaEnd);

                //En el último quiero un tratamiendo diferente
                if (longitud == peliculas.size() - 1) {
                    xmlWriter.add(saltoDeLinea);
                } else {
                    xmlWriter.add(saltoDeLineaTab);
                }
                longitud++;

            }

            //Creo el evento necesario para cerrar la etiqueta raíz pedidos
            EndElement peliculasEndElement = eventFactory.createEndElement("", "", "peliculas");
            xmlWriter.add(peliculasEndElement);
            xmlWriter.add(saltoDeLinea);

            //Creo el evento de finalización del documento y lo escribo con el objeto writer
            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);

        } catch (XMLStreamException | FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }
    }
}