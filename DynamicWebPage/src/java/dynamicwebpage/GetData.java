
package dynamicwebpage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;


@WebServlet(name="GetData", urlPatterns="/get-data")
public class GetData extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", "*");
        String format = request.getParameter("format");
        Person[] people = readCSV();
        try{
        PrintWriter writer = response.getWriter();
            if(format.equals("xml")){
                writer.write(makeXML(people));
            }
            else if(format.equals("json")){
                writer.write(makeJSON(people));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//end doGet()

    
    
    public static String makeXML(Person[] people){
        try{
            OutputStream stream = new ByteArrayOutputStream();
            XMLStreamWriter xml = XMLOutputFactory.newInstance().createXMLStreamWriter(stream);
            xml.writeStartDocument();
            xml.writeStartElement("people");
            for(Person person : people){
                xml.writeStartElement("person");
                xml.writeStartElement("name");
                xml.writeCharacters(person.getName());
                xml.writeEndElement();
                xml.writeStartElement("age");
                xml.writeCharacters("" + person.getAge());
                xml.writeEndElement();
                xml.writeStartElement("home");
                xml.writeCharacters(person.getHome());
                xml.writeEndElement();
                xml.writeEndElement();
            }
            xml.writeEndElement();
            xml.writeEndDocument();
            xml.close();
            return stream.toString();
        }
        catch(Exception e){
            //just move on then
            return "";
        }
    }//end makeXML()
    
    
    public static String makeJSON(Person[] people){
        String json = "";
        for(Person person : people){
            json += "{";
            json += "\"name\": \"" + person.getName() + "\", ";
            json += "\"age\": " + person.getAge() + ", ";
            json += "\"home\": \"" + person.getHome() + "\"";
            json += "}\n";
        }
        return json;
    }//end makeJSON()
    
    
    
    public static Person[] readCSV(){
        //File file = new File("C:\\Users\\franc\\Downloads\\test-data.csv");
        
        try{
            //InputStream stream = new URL("").openStream();
            File file = new File("/var/www/data/test-data.csv");
            String rawContent = new String();
            //Scanner open = new Scanner(file);
            Scanner open = new Scanner(file);
            while(open.hasNextLine()){
                rawContent += "\n" + open.nextLine();
            }
            //return rawContent;


            ArrayList<Person> peopleList = new ArrayList<>();
            String[] lines = rawContent.split("\n");
            for(String l : lines){
                if(l.length() > 0){
                    String[] content = l.split(",");
                    peopleList.add(new Person(content[0], Integer.parseInt(content[1]), content[2]+", " + content[3] + ", " + content[4]));
                }
            }
            Person[] people = new Person[peopleList.size()];
            for(int i=0; i < people.length; i++){
                people[i] = peopleList.get(i);
            }
            return people;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }//end readCSV()
    
    
}//end GetData class
