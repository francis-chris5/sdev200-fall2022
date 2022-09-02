
package repeats;

import java.util.Scanner;


public class Repeats {
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many times should this run? ");
        int counter = Integer.parseInt(keyboard.next());
        while(counter > 0){
            System.out.println("The loop is running " + counter);
            counter--;
        }
        
        System.out.print("How many times should this run? ");
        int timer = Integer.parseInt(keyboard.next());
        do{
            System.out.println("counting down " + timer);
            timer--;
        }while(timer > 0);
        
        
        for(int i = 0; i < 10; i++){ 
            System.out.println("for looping..." + i);
        }
    }
}
