
package javaapplication26;

import java.sql.*;


public class MySQLConnector {
    private String url;
    private String username; //"root"
    private String password; //""

    public MySQLConnector() {
    }

    public MySQLConnector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
    
    
    public int addData(String table, Record record){
        //INSERT INTO People(Name, Age, Town) VALUES(r1, r2, r3)
        String insertQuery = "INSERT INTO " + table;
        insertQuery += "(Name, Age, Town) VALUES(";
        insertQuery += "\"" + record.getName() + "\", " + record.getAge() + ", \"" + record.getTown() + "\"";
        insertQuery += ");";
        
        //System.out.println(insertQuery);
        
        try{
                //make sure and import .sql.* first or wrong library
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(insertQuery);
            stmt.close();
            conn.close();
            return result;
        }
        catch(Exception e){
            e.printStackTrace();
            return -999;
        }
    }
    
}
