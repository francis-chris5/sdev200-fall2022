
package javaapplication26;

import java.util.ArrayList;


public class JavaApplication26 {

    public static void main(String[] args) {
        /*
         * Download the JDBC driver, add to a new library, then
         * include that library in the module path for the 
         * project
         */
        String url = "jdbc:mysql://localhost:3306/Folder";
        String username = "root";
        String password = "";
        
        MySQLConnector db = new MySQLConnector(url, username, password);
        
        ArrayList<Record> records = new ArrayList<>();
        records.add(new Record("Sally", 39, "Salem"));
        records.add(new Record("Chuck", 22, "Charlestown"));
        records.add(new Record("Alex", 18, "New Albany"));
        records.add(new Record("Shelly", 49, "Sellersburg"));
        records.add(new Record("Mary", 29, "Marysville"));
        
        for(int i = 0; i < records.size(); i++){
            if(db.addData("People", records.get(i)) >= 0){
                System.out.println("seemed to insert...");
            }
            else{
                System.out.println("something went wrong");
            }
        }
    }
    
}
