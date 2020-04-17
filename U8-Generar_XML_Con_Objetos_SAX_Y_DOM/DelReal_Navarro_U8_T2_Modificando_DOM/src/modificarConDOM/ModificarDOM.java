package modificarConDOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
/**
 * Clase ModificarDOM
 * Informacion Modificar con DOM
 * @author Rocio del Real
 * @version 0.1
 */
public class ModificarDOM {
    //U8_T2_Modificación con DOM y guardado a fichero (Parte 1: Crear una clase ModificarDOM que en el main de esa misma clase, que es el método que se ejecutará, debe:)
    public static void main(String[] args) {

        try {

            //Obtenemos la referencia al objeto Document
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            //Parseamos el documento XML para tenerlo en memoria cargado
            Document doc = db.parse(new File("peliculas.xml"));

            //Obtenemos el nodo raíz
            Node root = doc.getDocumentElement();

            //Apartado a. Cargar el contenido del xml (peliculas.xml) en la estructura DOM completo.
            ModificarDOM md1 = new ModificarDOM("peliculas.xml");
            System.out.println("***CONTENIDO DEL XML EN LA ESTRUCTURA DOM COMPLETO***");
            md1.mostrarXMLDom();
            System.out.println("***FIN DEL XML EN LA ESTRUCTURA DOM COMPLETO***");
            System.out.println("//Nota: ver cambios del xml en 'dom_modificado.xml'");


            //Apartado b. Añadir antes de cada nodo hijo de tipo etiqueta el siguiente comentario <!-- COMENTARIO AÑADIDO DESDE DOM -->

            /*OJO ESTA OPCION SOLO TE AÑADE EL COMENTARIO 1 VEZ
            Element cadaPelicula = (Element) doc.getElementsByTagName("pelicula").item(0);
            root.insertBefore(comentario,cadaPelicula);*/

            Comment comentario = doc.createComment("COMENTARIO AÑADIDO DESDE DOM");

            NodeList nl = doc.getElementsByTagName("pelicula"); //NodeList nl=root.getChildNodes(); me daria un numero mayor equivalente a todos los nodos

            for (int i = 0; i < nl.getLength(); i++) {
                root.getParentNode();
                Element cadaPelicula = (Element) doc.getElementsByTagName("pelicula").item(i);
                comentario = doc.createComment("COMENTARIO AÑADIDO DESDE DOM");
                root.insertBefore(comentario, cadaPelicula);
            }


            //Apartado c. Uso de appendChild(): Añadir un nueva etiqueta hija (en el ejemplo una nueva persona) como último hijo
            //Vamos a insertar un nuevo nodo Element pelicula

            // Creo la etiqueta padre pelicula, le doy nombre
            Element pelicula = doc.createElement("pelicula");
            pelicula.setAttribute("nacionalidad","americana");

            //Creo la etiqueta hija nombre y le doy valor
            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Blade Runner");


            //Creo la etiqueta hija director y le doy valor
            Element director = doc.createElement("director");
            director.setTextContent("Ridley Scott");

            //Creo la etiqueta hija publico y le doy valor
            Element publico = doc.createElement("publico");
            publico.setTextContent("Todos los públicos");

            //Construyo toda la estructura general de la etiqueta

            pelicula.appendChild(nombre);
            pelicula.appendChild(director);
            pelicula.appendChild(publico);


            //Añadimos ese nuevo nodo al root: de esta forma se inserta al final de la lista
            root.appendChild(pelicula);

            //Apartado d. Crear un nuevo nodo etiqueta (en el ejemplo una nueva persona) y reemplazar la primera etiqueta hija por ese nodo creado.

            //Paso d.1. Creo la nueva etiqueta
            // Creo la etiqueta padre pelicula, le doy nombre
            Element pelicula2 = doc.createElement("pelicula");
            pelicula2.setAttribute("nacionalidad","griega");

            //Creo la etiqueta hija nombre y le doy valor
            Element nombre2 = doc.createElement("nombre");
            nombre2.setTextContent("Xenia");


            //Creo la etiqueta hija director y le doy valor
            Element director2 = doc.createElement("director");
            director2.setTextContent("Panos H. Koutras");

            //Creo la etiqueta hija publico y le doy valor
            Element publico2 = doc.createElement("publico");
            publico2.setTextContent("Todos los públicos");

            //Construyo toda la estructura general de la etiqueta

            pelicula2.appendChild(nombre2);
            pelicula2.appendChild(director2);
            pelicula2.appendChild(publico2);


            //Añadimos ese nuevo nodo al root al final de la lista
            root.appendChild(pelicula2);

            //Paso d.2. Voy a reemplazar la primera pelicula por la última que acabo de crear
            Element primeraPelicula = (Element) doc.getElementsByTagName("pelicula").item(0);
            root.replaceChild(pelicula2,primeraPelicula);



            // PROCEDEMOS A VOLCAR TODAS LAS MODIFICACIONES, TODO ÉL ARBOL AL FICHERO

            //Obtenemos el objeto transformer
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            //Configuración del transformer
            //Podéis ver toda la lista de propiedades aquí
            // https://docs.oracle.com/javase/7/docs/api/javax/xml/transform/OutputKeys.html
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            //Creación del origen DOMSource
            DOMSource origenDOM = new DOMSource(root);

            //Apartado e. Creación del fichero que va a ser mi destino: Volcar todo a un fichero XML llamado dom_modificado.xml
            File nuevoPeliculas = new File("dom_modificado.xml");
            StreamResult destino = new StreamResult(nuevoPeliculas);

            //Hacemos la transformación que en nuestro caso es la escritura
            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException
                | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }



    private Document doc; //variable de la clase

    //Constructor
    public ModificarDOM(String nomFile) {
        try {
            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File(nomFile));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }



    //Metodos para mostrar estructura arbol completa de xml con dom

    public static void todoArbolXMLDOM(NodeList nodeList) {

        for (int i = 0; i < nodeList.getLength(); i++) {

            Node childNode = nodeList.item(i);

            if (childNode.getNodeType() == Node.ELEMENT_NODE) {

                System.out.print(childNode.getNodeName());

                if (childNode.getFirstChild() != null
                        && childNode.getFirstChild().getNodeType() == Node.TEXT_NODE) {

                    System.out.print(" = " + childNode.getFirstChild().getNodeValue());

                }

                if (childNode.getFirstChild() != null && childNode.getFirstChild().getNodeType() == Node.COMMENT_NODE) {

                    System.out.print(" = " + childNode.getFirstChild().getTextContent());

                }

                if (childNode.hasAttributes()) {

                    NamedNodeMap nodeMap = childNode.getAttributes();
                    for (int j = 0; j < nodeMap.getLength(); j++) {
                        Node node = nodeMap.item(j);
                        Attr atributo = ((Element) childNode).getAttributeNode(node.getNodeName());
                        System.out.println("Atributo: " + atributo.getNodeName());
                        System.out.println("Valor: " + atributo.getValue());
                    }
                }

                System.out.println();
            }

            NodeList children = childNode.getChildNodes();
            if (children != null) {
                todoArbolXMLDOM(children);
            }
        }
    }

    public void mostrarXMLDom() {

        //Obtengo la etiqueta raiz
        Element root = doc.getDocumentElement();

        NodeList children = root.getChildNodes();

        todoArbolXMLDOM(children);
    }

}

