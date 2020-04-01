package PeliculasSAXDOMU8;
/**
 * Clase RecorridoSAX
 * Informacion Recorrido DOM y SAX
 * @author Rocio del Real
 * @version 0.1
 */
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class RecorridoSAX extends DefaultHandler {

    static long lasting = System.currentTimeMillis();

    public RecorridoSAX() {
        super();
    }

    public static void parse(String nomFile) {
        try {

            SAXParserFactory sf = SAXParserFactory.newInstance();
            SAXParser sp = sf.newSAXParser();
            RecorridoSAX reader = new RecorridoSAX();
            sp.parse(new InputSource(nomFile), reader);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Running time:" + (System.currentTimeMillis() - lasting) + "Millisecond");

    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        super.characters(ch, start, length);

        String content = new String(ch, start, length);

        if(content.trim().length()>0){
            System.out.println(content);
        }


    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        if(attributes.getQName(0) != null) {
            System.out.println("<" + qName +" " +  attributes.getQName(0)+ "=" + attributes.getValue(0)+">");
        } else {
            System.out.println("<" + qName +">");
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

        System.out.println("</" + qName + ">");
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("****Iniciando lectura del doc XML****");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("****Lectura Finalizada.****");
    }
}

