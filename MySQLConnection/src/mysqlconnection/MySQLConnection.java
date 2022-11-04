
package mysqlconnection;

import java.util.LinkedList;


public class MySQLConnection {

    private static String url = "jdbc:mysql://localhost:3306/SDEV200";
    private static String username = "admin";
    private static String password = "admin";
    
    public static void main(String[] args) {
        DatabaseConnector db = new DatabaseConnector(url, username, password);
        
        
        //String[] fields = {"Name", "Age", "Town"};
        Object[][] values = {
            {"Sally", 21, "Salem"},
            {"Charlie", 84, "Charlestown"},
            {"Mary", 12, "Marysville"},
            {"Corey", 38, "Corydon"},
        };
        
        int result = 0;
//        for(int i = 0; i < values.length; i++){
//            result += db.addData("People", fields, values[i]);
//        }

        String[] fields = {"Name", "Age", "Town"};
        //String[] fields = {"Name"};
        LinkedList<Record> list = db.grabData("People", fields, "Age > 18 AND Age < 65");
        
        System.out.println(list);
        
    }//end main
    
 
}//end class
