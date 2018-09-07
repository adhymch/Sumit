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
public class SpecialXMLParser extends OOCharParser {

    private int countOp, countCl;
    private boolean valid;

    public int getCountOp() {
        return countOp;
    }

    public int getCountCl() {
        return countCl;
    }

    public void SpecialParser(File xml) throws ParserConfigurationException, SAXException, IOException {
        countOp = 0;
        countCl = 0;

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xml);

        doc.getDocumentElement().normalize();

        doc.getDocumentElement();
        NodeList opList = doc.getElementsByTagName("Operation");
        NodeList clList = doc.getElementsByTagName("Class");

        for (int temp = 0;
                temp < opList.getLength();
                temp++) {

            Node nNode = opList.item(temp);
            Element eElement = (Element) nNode;
            if (eElement.getAttribute("Name") != null) {
                countOp++;
            }
        }

        for (int temp = 0;
                temp < clList.getLength();
                temp++) {

            Node nNode = clList.item(temp);
            Element eElement = (Element) nNode;
            if (eElement.getAttributeNode("AttributeSortType") != null) {
                countCl++;
            }
        }

    }

    public boolean ValidateStructure(File xml) throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xml);

        doc.getDocumentElement().normalize();

        doc.getDocumentElement();
        NodeList strc = doc.getElementsByTagName("Project");

        Node nNode = strc.item(0);
        Element eElement = (Element) nNode;
        if (!"simple".equalsIgnoreCase(eElement.getAttribute("Xml_structure"))) {
            valid = false;
        } else {
            valid = true;
        }
        return valid;
    }

    public void Executor(File xml) throws ParserConfigurationException, SAXException, IOException {
        CohesionParser(xml);
        CouplingParser(xml);
        InheritanceParser(xml);
        SpecialParser(xml);
    }

}
