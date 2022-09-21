
package objectexample1;


public class Dog extends Animal{
    
    private boolean wearsBandana;

    public Dog() {
    }

    public Dog(String name, int age, double weight, boolean checkup, boolean wearsBandana) {
        super(name, age, weight, checkup);
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
