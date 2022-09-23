
package objectexample2;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ObjectExample2 {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ford", "Ranger", 1993);
        v1.setColor("White");
        v1.setManufacturingPlant("Louisville");
        Vehicle v2 = new Vehicle();
        v2.setMake("Toyota");
        v2.setModel("Corolla");
        v2.setColor("Green");
        v2.setYear(2002);
        v2.setManufacturingPlant("Georgetown");
        
//        System.out.println(v1 + " and " + v2);
//        System.out.println(v1.equals(v2));
//        System.out.println(v1.compareTo(v2));
//        System.out.println(Vehicle.getVehicleCounter());

        makeBeans(v1, "ranger");
        makeBeans(v2, "corolla");
        
        System.out.println(retrieveBeans("ranger"));
        System.out.println(retrieveBeans("corolla"));
        
    }
    
    public static void makeBeans(Vehicle v, String filename){
        try{
            XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename + ".xml")));
            e.writeObject(v);
            e.close();
            System.out.println("success");
        }
        catch(Exception e){
            System.out.println("failure");
        }
    }
    
    
    public static Vehicle retrieveBeans(String filename){
        try{
            XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename + ".xml")));
            Vehicle v = (Vehicle)d.readObject();
            d.close();
            System.out.println("success");
            return v;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    
}
