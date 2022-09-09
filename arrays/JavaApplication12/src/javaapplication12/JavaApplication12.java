
package javaapplication12;

import java.util.*;

public class JavaApplication12 {

    
    public static void main(String[] args) {
        Random random = new Random();
//        int[] numbers = new int[5];
//        for(int i = 0; i < numbers.length; i++){
//            numbers[i] = random.nextInt();
//        }

        double[] doubArray = new double[6];
        for(int i=0; i < doubArray.length; i++){
            doubArray[i] = random.nextDouble();
        }
        for(double d : doubArray){
            System.out.print(d + ", ");
        }
                
        int[] numbers = {12, 8, 62, 99, 14};
        Arrays.sort(numbers);
        
        for(int num: numbers){
            System.out.println(num);
        }
        
        //formatted
        System.out.print("[");
        for(int i = 0; i < numbers.length; i++){
            if(i != numbers.length-1){
                System.out.print(numbers[i] + ", ");
            }
            else{
                System.out.print(numbers[i]);
            }
        }
        System.out.println("]");
        
        
        String sentence = "This is a long string, with a bunch of words, and other special symbols: like a colon.";
        String[] words = sentence.split("[ ,:.]");
        for(String w : words){
            System.out.println(w);
        }
        
        
        
        //byte[][] table = new byte[3][4];
        byte[][] table = {{1, 2, 3}, {7, 9, 15}, {22, 24, 26}};
        
        for(int row=0; row < table.length; row++){
            for(int col=0; col < table[row].length; col++){
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }
    }
    
    
    
}
