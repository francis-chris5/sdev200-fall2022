
package javaapplication14;

import java.util.LinkedList;




public class JavaApplication14 {

    public static void main(String[] args) {
        LinkedList<Double> link = new LinkedList<>();
        link.add(3.14);
        link.add(2.82);
        link.add(7.77);
        
        System.out.println(link);
        
        System.out.println(link.indexOf(2.82));
        System.out.println(link.get(1));
        
        for(int i = 0; i< link.size(); i++){
            System.out.println(link.get(i));
        }
        
        System.out.println("***************");
        
        for(Double d : link){
            System.out.println("next item is " + d);
        }
        
        System.out.println("***************");
        
       link.forEach(dub -> {
            System.out.println("lambda out each element, the next one is " + dub);
        });
        
        System.out.println("\n\n\n**************\n");
        System.out.println(link);
        link.remove(2);
        System.out.println(link);
        link.clear();
        System.out.println(link);
        
    }
    
}
