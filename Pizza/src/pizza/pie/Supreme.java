
package pizza.pie;

import pizza.toppings.GreenPepper;
import pizza.toppings.Mushroom;
import pizza.toppings.Pepperoni;
import pizza.toppings.Topping;


public class Supreme extends Specialty {

    public Supreme() {
        addTopping(null);
    }

    
    @Override
    public void addTopping(Topping topping) {
        toppings.add(new Pepperoni());
        toppings.add(new GreenPepper());
        toppings.add(new Mushroom());
    }
    
}
