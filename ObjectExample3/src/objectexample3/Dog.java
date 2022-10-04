
package objectexample3;


public class Dog extends Animal implements Noisy{
    
    private boolean wearsBandana;

    public Dog() {
    }

    public Dog(String name, int age, double weight,  Covering covering, boolean checkup, boolean wearsBandana) {
        super(name, age, weight, covering, checkup);
        this.wearsBandana = wearsBandana;
    }

    public boolean isWearsBandana() {
        return wearsBandana;
    }

    public void setWearsBandana(boolean wearsBandana) {
        this.wearsBandana = wearsBandana;
    }

    
    @Override
    public String makeSound() {
        return "woof";
    }
    
    
    
}
