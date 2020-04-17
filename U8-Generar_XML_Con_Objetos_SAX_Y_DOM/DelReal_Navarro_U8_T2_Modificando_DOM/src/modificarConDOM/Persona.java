package modificarConDOM;
/**
 * Clase Persona
 * Informacion Modificar con DOM
 * @author Rocio del Real
 * @version 0.1
 */
/*
Crear un ArrayList con al menos 10 objetos. Dichos objetos deben tener al menos 4 atributos.
La clase del Objeto deberá crearse en un fichero aparte (Persona.java).
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Persona {

    private String firstName;
    private String lastName;
    private String address;
    private int edad;

    public Persona() {
    }

    public Persona(String firstName, String lastName, String address, int edad) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.edad = edad;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", edad=" + edad
                + "]";
    }

    public static List<Persona> getListPersonas() {

        List<Persona> listPersonas = new ArrayList<Persona>();
        String[] nombres = { "Pablo", "Rocío", "Antonio", "Manoli", "Juan Carlos", "Juanma", "Dolores", "Carmele",
                "Benito" };
        String[] apellidos = { "Martínez", "Pérez", "Navarro", "Rodríguez", "Silva", "Márquez", "Dueñas" };
        String[] direccion = { "C/ La Niña " + Integer.toString((int) (Math.random() * 100)),
                "C/ Falsa " + Integer.toString((int) (Math.random() * 100)),
                "C/ Blanca Paloma " + Integer.toString((int) (Math.random() * 100)),
                "C/ Fuerteventura " + Integer.toString((int) (Math.random() * 100)),
                "C/Atalaya" + Integer.toString((int) (Math.random() * 100)),
                "C/ Descubrimientos " + Integer.toString((int) (Math.random() * 100)),
                "C/ Larga " + Integer.toString((int) (Math.random() * 100)) };

        for (int i = 0; i < 10; i++) {
            listPersonas.add(new Persona(nombres[new Random().nextInt(nombres.length)],
                    apellidos[new Random().nextInt(apellidos.length)],
                    direccion[new Random().nextInt(direccion.length)], (int) (Math.random() * 100)));
        }

        return listPersonas;

    }

    public static void createDOMtoXMLPersonas(List<Persona> personas, String nameFileXML) {

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder;

        try {
            documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            Element root = document.createElement("Personas");

            document.appendChild(root);

            for (Persona persona : personas) {

                Element personaElement = document.createElement("Persona");

                root.appendChild(personaElement);

                Element nombre = document.createElement("Nombre");
                nombre.appendChild(document.createTextNode(persona.getFirstName()));
                personaElement.appendChild(nombre);

                Element apellidos = document.createElement("Apellidos");
                apellidos.appendChild(document.createTextNode(persona.getLastName()));
                personaElement.appendChild(apellidos);

                Element direccion = document.createElement("Dirección");
                direccion.appendChild(document.createTextNode(persona.getAddress()));
                personaElement.appendChild(direccion);

                Element edad = document.createElement("Edad");
                edad.appendChild(document.createTextNode(Integer.toString(persona.getEdad())));
                personaElement.appendChild(edad);

            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            Transformer transformer = transformerFactory.newTransformer();

            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(nameFileXML));

            transformer.transform(domSource, streamResult);

            System.out.println("***Archivo cero.xml creado correctamente.***");

        } catch (ParserConfigurationException | TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}