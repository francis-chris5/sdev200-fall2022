
package methods;


public class Methods1 {

    
    public static void main(String[] args){
        Methods1 thisThing = new Methods1();
        int coupleInts = thisThing.addingTwoNumbers(7, 2);
        System.out.println(coupleInts);
        
        double coupleReals = thisThing.addingTwoNumbers(3.14, 2.82);
        System.out.println(coupleReals);
    }
    
    
   public int addingTwoNumbers(int firstNumber, int secondNumber){
     return firstNumber + secondNumber;
   }
   
   
   //overloading
   public double addingTwoNumbers(double firstNumber, double secondNumber){
       return firstNumber + secondNumber;
   }
   
}