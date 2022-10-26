
package pizza.pie;

import pizza.toppings.Topping;


public abstract class Specialty extends Pie {


    @Override
    public double calculateCost() {
        return 23.95;
    }
    
}
