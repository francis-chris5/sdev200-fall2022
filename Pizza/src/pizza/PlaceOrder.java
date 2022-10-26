
package pizza;

import java.util.LinkedList;
import java.util.Scanner;
import pizza.pie.Custom;
import pizza.pie.Meaty;
import pizza.pie.Pie;
import pizza.pie.Supreme;
import pizza.toppings.GreenPepper;


public class PlaceOrder {
    
    private LinkedList<Pie> pies = new LinkedList<>();

    public PlaceOrder() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Will this be a \"specialty\" or a \"custom\" pizza: ");
        String type = keyboard.next();
        Pie nextPizza;
        if(type.equals("specialty")){
            System.out.println("will that be meaty or supreme");
            String choice = keyboard.next();
            if(choice.equals("meaty")){
                nextPizza = new Meaty();
            }
            else{
                nextPizza = new Supreme();
            }
        }
        else{
            nextPizza = new Custom();
            System.out.println("what topping do you want: ");
            System.out.println("nope you can have green peppers");
            nextPizza.addTopping(new GreenPepper());
        }

        //skipping the crust
        System.out.println("that will be " + nextPizza.calculateCost() + " today.");
        
        
    }
    
}
