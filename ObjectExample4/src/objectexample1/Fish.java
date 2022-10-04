
package objectexample1;


public class Fish extends Animal{

    public Fish() {
    }

    public Fish(String name, int age, double weight, Covering covering, boolean checkup) {
        super(name, age, weight, covering, checkup);
    }

    @Override
    public String makeSound() {
        return "boop";
    }
    
}
