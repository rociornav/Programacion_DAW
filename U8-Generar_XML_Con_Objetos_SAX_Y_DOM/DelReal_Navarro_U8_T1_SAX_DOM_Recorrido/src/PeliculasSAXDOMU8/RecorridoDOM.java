package PeliculasSAXDOMU8;
/**
 * Clase RecorridoDOM
 * Informacion Recorrido DOM y SAX
 * @author Rocio del Real
 * @version 0.1
 */

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDOM {


    public static void main(String[] args) {
        RecorridoDOM rec1 = new RecorridoDOM("peliculas.xml");
        System.out.println("***NUMERO DE NODOS HIJOS DIRECTOS Y TIPO***");
        rec1.numNodosHijos();
        System.out.println("***MOSTRAR PRIMER NIVEL DEL DOC XML***");
        rec1.mostrarXMLDom();
        System.out.println("***MOSTRAR CONTENIDO DE UNA ETIQUETA O ELEMENT***");
        //creo el elemento con su metodo
        Element e= rec1.createElement("nombre");
        rec1.mostrarContenidoEtiqueta(e);

    }


    private Document doc; //variable de la clase

    //Constructor
    public RecorridoDOM(String nomFile) {
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
    //Metodos

    /**
     * mostrará por pantalla el número de nodos hijos (descendientes directos del nodo raíz)
     * y el tipo de cada uno de esos nodos (etiqueta, texto, comentario)
     */
    public void numNodosHijos() {

        //Obtengo la etiqueta raiz
        Element root = doc.getDocumentElement();

        //Obtengo la lista de nodos directos de la etiqueta raiz
        NodeList nl = root.getChildNodes();

        System.out.println("En este fichero tengo " + nl.getLength() + " nodos hijos directos de la etiqueta-raiz.");

        System.out.println("***Vamos a determinar el tipo de nodo-hijo directo de la etiqueta-raiz:***");
        int contEtiqueta = 0, contText = 0, contComment = 0; //hacer que funcionen
        for (int i = 0; i < nl.getLength(); i++) {

            Node nodo = nl.item(i);


            //si es tipo Element
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) nodo;
                System.out.println("Nodo Tipo ELEMENT: '" + e.getTagName() + "'");
                    /*
                    System.out.println("Y contiene = ");
                    System.out.println(e.getTextContent());
                     */
                contEtiqueta++;
                //compruebo si tiene este nodo atributos
                if (e.hasAttributes()) {
                    System.out.println("****Y este nodo tiene atributos****");

                    //Obtengo los atributos y los muestro
                    NamedNodeMap nodeMap = e.getAttributes();
                    for (int j = 0; j < nodeMap.getLength(); j++) {
                        Node node = nodeMap.item(j);
                        Attr atributo = e.getAttributeNode(node.getNodeName());
                        System.out.println("Atributo: " + atributo.getNodeName());
                        System.out.println("Valor: " + atributo.getValue());
                    }
                }

                //si es tipo Text
            } else if (nodo.getNodeType() == Node.TEXT_NODE) {
                Text texto = (Text) nodo;
                System.out.println("Nodo Tipo TEXT:");
                System.out.println("Y contiene:");
                System.out.println(texto.getTextContent());

                contText++;

                //si es tipo Comment
            } else if (nodo.getNodeType() == Node.COMMENT_NODE) {
                Comment comentario = (Comment) nodo;
                System.out.println("Nodo Tipo COMMENT:");

                System.out.println("Y contiene:");
                System.out.println(comentario.getTextContent());

                contComment++;
            }
            System.out.println("----------------------------------------");

        }

        System.out.println("***CONCLUSION****");
        System.out.println("Numero de Nodos-hijos de la etiqueta-raíz: " + nl.getLength());
        //no van
        System.out.println("Numero de nodos tipo TEXT: " + contText);
        System.out.println("Numero de nodos tipo COMMENT: " + contComment);
        System.out.println("Numero de nodos tipo ELEMENT: " + contEtiqueta);


    }

    /**
     * mostrará por pantalla el contenido del fichero XML llegando únicamente al primer nivel.
     * A partir de ahí puedo mostrar el contenido completo de los nodos.
     */
    public void mostrarXMLDom() {

        //Obtengo la etiqueta raiz
        Element root = doc.getDocumentElement();

        NodeList nodeList = root.getChildNodes();


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

        }
    }


    /**
     * Recorrerá los hijos de todas las etiquetas y cada una de las ocurrencias de esas etiquetas
     * mostrando el contenido de los mismos. Si no hay ninguna ocurrencia de esa etiqueta (element)
     * deberá mostrar un mensaje de aviso.
     *
     * @param e recibe como parámetro un element (etiqueta)
     */
    public void mostrarContenidoEtiqueta(Element e) {
        String cad=e.getTagName().toString();
        NodeList nl = doc.getElementsByTagName(cad);

        for (int i = 0; i < nl.getLength(); i++) {
            Node node = nl.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;

                if(eElement.hasChildNodes()) {
                    NodeList nl2 = node.getChildNodes();
                    for(int j=0; j<nl2.getLength(); j++) {
                        Node nd = nl2.item(j);
                        System.out.println(nd.getTextContent());
                    }
                }
            }
        }
    }


    /**
     * Metodo para crear un Element a partir de la string del nombre que tenga dicho elemento //creado para no sobrecargar la main.
     * @param nomElement String
     * @return devuelve el Element
     */
    public Element createElement(String nomElement) {
        Element root = null;
        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder;

            documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            root = document.createElement(nomElement);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return root;

    }

}
