
package pizza.pie;

import pizza.toppings.Topping;


public class Custom extends Pie{

    private double price = 17.00;
    @Override
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    @Override
    public double calculateCost() {
        for(int i = 0; i < toppings.size(); i++){
            price += toppings.get(i).calculateCost();
        }
        return price;
    }
    
}
