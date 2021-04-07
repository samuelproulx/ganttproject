package net.sourceforge.ganttproject.resource;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.List;

public class SharedHumanResourceManager {


  public List<HumanResource> readFile(){
    List<HumanResource> resources = null;
    try {
      File fXmlFile = new File("SharedHumanRessource.xml");
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(fXmlFile);
      doc.getDocumentElement().normalize();

      NodeList nList = doc.getElementsByTagName("project");

      //read each items in every project of the XML file and add each item in resources
      for (int temp = 0; temp < nList.getLength(); temp++) {

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return resources;
  }

  public void writeInFile(HumanResource resources){

  }

}
