
package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileIO {

    public static void main(String[] args) {
        String s1 = new String("Here is some data to write to a text file.");
        File stringFile =new File("randomString.txt");
        try {
            PrintWriter writer = new PrintWriter(stringFile);
            writer.println(s1);
            writer.close();
        } 
        catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
        
        try {
            Scanner fromFile = new Scanner(stringFile);
            String stuffInFile = new String();
            while(fromFile.hasNextLine()){
                stuffInFile += fromFile.nextLine();
            }
            System.out.println(stuffInFile);
        } catch (FileNotFoundException ex) {
            System.out.println("can't find the file to read from");
        }
        
        
        
        MyData data = new MyData(34, "thirty-four", true);
        File streamFile = new File("randomStream.str");
        try {
            FileOutputStream fos = new FileOutputStream(streamFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("can't find the file");
        } catch (IOException ex) {
            System.out.println("can't make that object ready for in/out");
        }
        
        
        try {
            FileInputStream fis = new FileInputStream(streamFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyData fileData = (MyData)ois.readObject();
            System.out.println(fileData);
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("can't find the file to read from");
        } catch (IOException ex) {
            System.out.println("can't bring data in");
        } catch (ClassNotFoundException ex) {
            System.out.println("can't recognize file data as a known object");
        }
        
        
    }//end main()
    
}//end FileIO class
