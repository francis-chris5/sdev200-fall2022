
package objectexample3;


public class Cat extends Animal implements Noisy {

    public Cat() {
    }

    public Cat(String name, int age, double weight, Covering covering, boolean checkup) {
        super(name, age, weight, covering, checkup);
    }

    @Override
    public String makeSound() {
        return "meow";
    }
    
    
}
