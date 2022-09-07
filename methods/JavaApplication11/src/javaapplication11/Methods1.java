
package javaapplication11;


/**
 * A class example for introducing the syntax for methods in Java
 * @author Chris
 */
public class Methods1 {

    
    public static void main(String[] args){
        //TODO create the javadocs
        Methods1 thisThing = new Methods1();
        int coupleInts = thisThing.addingTwoNumbers(7, 2);
        System.out.println(coupleInts);
        
        double coupleReals = thisThing.addingTwoNumbers(3.14, 2.82);
        System.out.println(coupleReals);
    }
    
   /**
    * A method to add two integers
    * @param firstNumber int one of the numbers to be added
    * @param secondNumber int the other number to be added
    * @return int the sum of the two numbers
    */
   public int addingTwoNumbers(int firstNumber, int secondNumber){
     return firstNumber + secondNumber;
   }
   
   
   /**
    * overloaded method to add two floating point numbers
    * @param firstNumber double number to add
    * @param secondNumber double number to add
    * @return double the sum of those numbers
    */
   public double addingTwoNumbers(double firstNumber, double secondNumber){
       return firstNumber + secondNumber;
   }
   
}