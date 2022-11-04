
package mysqlconnection;

import java.sql.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class DatabaseConnector {
    private String url;
    private String username;
    private String password;

    public DatabaseConnector() {
    }

    public DatabaseConnector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
    
    
    public int addData(String table, String[] fields, Object[] values){
        //INSERT INTO People(Name, Age, Town) VALUES("Chris", 44, "Clarksville");
        String insertQuery = "INSERT INTO " + table + "(";
        for(int i =0; i< fields.length; i++){
            insertQuery += fields[i];
            if(i < fields.length -1){
                insertQuery += ",";
            }
            else{
                insertQuery += ")";
            }
        }
        insertQuery += " VALUES(";
        for(int i=0; i < values.length; i++){
            try{
                int temp = (int)values[i];
                insertQuery += values[i];
            }
            catch(Exception e){
                insertQuery += "\"" + values[i] + "\"";
            }
            if(i < values.length-1){
                insertQuery += ",";
            }
            else{
                insertQuery += ");";
            }
        }
    
        int result = -999;
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(insertQuery);
            stmt.close();
            conn.close();
            
        }
        catch(Exception e){
            //
        }
        
        return result;
    }
    
    
    public LinkedList<Record> grabData(String table, String[] fields, String condition){
        //SELECT Field, Field, Field FROM Table WHERE condition
        LinkedList<Record> list = new LinkedList<>();
        String selectQuery = "SELECT ";
        for(int i =0; i< fields.length; i++){
            selectQuery += fields[i];
            if(i < fields.length -1){
                selectQuery += ", ";
            }
            else{
                selectQuery += " FROM ";
            }
        }
        selectQuery += table + " WHERE ";
        selectQuery += condition + ";"; //multiple methods for various conditions is probably best
        
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery(selectQuery);
            

            while(results.next()){
                Record temp = new Record();
                temp.setName(results.getString(1));
                temp.setAge(results.getInt(2));
                temp.setTown(results.getString(3));
                list.add(temp);
            }
            
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            //
        }
        
        
        return list;
    }
    
}
