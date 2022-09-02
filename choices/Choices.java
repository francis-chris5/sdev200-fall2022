
package choices;
import java.util.*;

public class Choices {
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Gimme a whole number!!!: ");
        //int userNumber = keyboard.nextInt();
        int userNumber = Integer.parseInt(keyboard.next());
        
        if(userNumber < 5){
            System.out.println("that's a small number");
        }
        else if(userNumber == 7){
            System.out.println("that's a seven");
        }
        else{
            System.out.println("that's a big number");
        }
        
        System.out.print("Enter a grade: ");
        char grade = keyboard.next().charAt(0);
        
        
        switch(grade){
            case 'A':
            case 'a':
                System.out.println("Great Job");
                break;
            case 'B':
            case 'b':
                System.out.println("well done");
                break;
            case 'C':
            case 'c':
                System.out.println("not bad");
                break;
            case 'D':
            case 'd':
                System.out.println("needs improvement");
                break;
            default:
                System.out.println("that's a problem");
                break;      
        }
        
        
        /*
         * and &&
         * or ||
         * not !
         * bitwise and &
         * bitwise or |
         * bitwise xor ^
         */
        
        
       boolean show = false;
        if(show){
            System.out.println("it shows");
        }
        else{
            System.out.println("can't see it");
        }
        
        
    }//end main()
}
