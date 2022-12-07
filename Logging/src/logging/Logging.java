
package logging;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.*;

public class Logging {

    public static void main(String[] args) {
        
        Logger myLog = Logger.getLogger("myLog");
        
        try {
            FileHandler fh = new FileHandler("myRecords.log", true);
            myLog.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
            
            System.out.println("just printing to the console");
            myLog.log(Level.INFO, "printed some stuff to the console");
            
            LinkedList<Integer> list = new LinkedList<>();
            myLog.info("made a linked list");
            list.add(3);
            myLog.info("added 3 to the list");
            list.add(7);
            myLog.info("added 7 to the list");
            
            myLog.warning("testing the log warnings");
            myLog.severe("testing the log severes");
            
            File f = new File("myRecords.log");
            Scanner s = new Scanner(f);
            LinkedList<String> lines = new LinkedList<>();
            while(true){
                lines.add(s.nextLine());
            }
            
        } catch (IOException ex) {
            System.out.println("in the io exception");
            Logger.getLogger(Logging.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            System.out.println("in the security exception");
            Logger.getLogger(Logging.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (NoSuchElementException ex){
            System.out.println("in the no such element exception");
            Logger.getLogger(Logging.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
