
package com.mycompany.mavenproject1;

import java.util.ArrayList;


public class Mavenproject1 {

    public static void main(String[] args) {
        ArrayList<String> arrLis = new ArrayList<>();
        arrLis.add("Hello");
        arrLis.add("world");
        arrLis.add("more words");
        arrLis.add("a rather long string compared to the others");
        
        arrLis.add(2, "addendum");
        
        //System.out.println(arrLis);
        System.out.println("\n\t****** regular for loop ********\b\n\n");
        for(int i=0; i< arrLis.size(); i++){
            System.out.println("next item in the list is " + arrLis.get(i));
        }
        System.out.println("\n\t****** java for each loop********\b\n\n");
        for(String element : arrLis){
            System.out.println("next item in the list is " + element);
        }
        System.out.println("\n\t****** arraylist foreach method ********\b\n\n");
        arrLis.forEach(e -> {
            System.out.println("next item in the list is " + e);
        });
        
    }
}
