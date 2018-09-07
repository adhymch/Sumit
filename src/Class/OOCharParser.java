package Class;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author User
 */
public abstract class OOCharParser {

    protected int countAt;
    protected int countCh;
    protected int countAs;

    public int getCountAt() {
        return countAt;
    }

    public int getCountCh() {
        return countCh;
    }

    public int getCountAs() {
        return countAs;
    }

    public void CohesionParser(File xml) throws ParserConfigurationException, SAXException, IOException {

        countAt = 0;

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xml);

        doc.getDocumentElement().normalize();

        doc.getDocumentElement();
        NodeList atList = doc.getElementsByTagName("Attribute");

        for (int temp = 0;
                temp < atList.getLength();
                temp++) {

            Node nNode = atList.item(temp);
            Element eElement = (Element) nNode;
            if (eElement.getAttribute("Id") != null) {
                countAt++;
            }
        }
    }

    public void CouplingParser(File xml) throws ParserConfigurationException, SAXException, IOException {

        countAs = 0;

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xml);

        doc.getDocumentElement().normalize();

        doc.getDocumentElement();
        NodeList asList = doc.getElementsByTagName("AssociationEnd");

        for (int temp = 0;
                temp < asList.getLength();
                temp++) {

            Node nNode = asList.item(temp);
            Element eElement = (Element) nNode;
            if (eElement.getAttribute("Id") != null) {
                countAs++;
            }
        }
        countAs = countAs / 2;
    }

    public void InheritanceParser(File xml) throws ParserConfigurationException, SAXException, IOException {

        countCh = 0;

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xml);

        doc.getDocumentElement().normalize();

        doc.getDocumentElement();
        NodeList chList = doc.getElementsByTagName("ToSimpleRelationships");

        for (int temp = 0;
                temp < chList.getLength();
                temp++) {

            Node nNode = chList.item(temp);
            Element eElement = (Element) nNode;
            if (eElement.getAttribute("Generalization") != null) {
                countCh++;
            }
        }
    }
    
    public abstract void SpecialParser(File xml) throws ParserConfigurationException, SAXException, IOException;
}