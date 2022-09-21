
package objectexample1;


public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age, double weight, boolean checkup) {
        super(name, age, weight, checkup);
    }

    @Override
    public String makeSound() {
        return "meow";
    }
    
    
}
