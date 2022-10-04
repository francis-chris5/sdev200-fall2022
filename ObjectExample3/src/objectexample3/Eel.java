
package objectexample3;


public class Eel extends Animal implements Noisy {

    public Eel() {
    }

    public Eel(String name, int age, double weight, Covering covering, boolean checkup) {
        super(name, age, weight, covering, checkup);
    }

    @Override
    public String makeSound() {
     return "zap";   
    }
}
