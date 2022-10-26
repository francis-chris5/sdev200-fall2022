
package pizza.pie;

import pizza.toppings.Topping;
import java.util.LinkedList;
import pizza.Pricing;


public abstract class Pie implements Pricing {
    
    private Crust crust;
    private boolean cheese;
    private boolean sauce;
    protected LinkedList<Topping> toppings = new LinkedList<>();

    public Pie() {
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean hasSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public LinkedList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(LinkedList<Topping> toppings) {
        this.toppings = toppings;
    }
    
    
    public abstract void addTopping(Topping topping);

    
}
