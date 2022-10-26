
package pizza.pie;

import pizza.toppings.Pepperoni;
import pizza.toppings.Sausage;
import pizza.toppings.Topping;

public class Meaty extends Specialty {
    
    public Meaty(){
        addTopping(null);
    }

    @Override
    public void addTopping(Topping topping) {
        toppings.add(new Pepperoni());
        toppings.add(new Sausage());
    }
    
}
