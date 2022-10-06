
package javaapplication22;

import java.util.*;

public class JavaApplication22 {

    private Scanner keyboard = new Scanner(System.in); 
        
    public static void main(String[] args) {
        JavaApplication22 T = new JavaApplication22();
        
        double[] dubs = T.fillList();
        for(double d : dubs){
            System.out.println(d + ", ");
        }
        
        
        
        
        try{
            T.tooBig(dubs);
        }
        catch(ArrayIndexOutOfBoundsException aob){
            System.out.println("array index...");
        }
        catch(IndexOutOfBoundsException iob){
            System.out.println("index out of bound");
        }
        catch(Exception e){
            System.out.println("exception");
        }
        finally{
            System.out.println("all done!");
        }
    }//end main
    
    
    
    public double[] fillList(){
        ArrayList<Double> list = new ArrayList<>();
        String input = "";
        while(input != "done"){
            try{
                System.out.println("Enter the next number or \"done\" when finished: ");
                list.add(Double.parseDouble(keyboard.next()));
            }
            catch(NumberFormatException nfe){
                input = "done";
            }
        }
        
        double[] arr = new double[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }//end fillList()
    
    
    
    public void tooBig(double[] dub)throws Exception{
        System.out.println(dub[dub.length+3]);
    }

    
    
}


