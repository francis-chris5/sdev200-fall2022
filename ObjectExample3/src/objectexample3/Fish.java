
package objectexample3;


public class Fish extends Animal implements Noisy{

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
