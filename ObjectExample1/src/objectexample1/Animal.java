
package objectexample1;


public class Animal {
    private String name;
    private int age;
    private double weight;
    private boolean checkup;

    public Animal() {
    }

    public Animal(String name, int age, double weight, boolean checkup) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.checkup = checkup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isCheckup() {
        return checkup;
    }

    public void setCheckup(boolean checkup) {
        this.checkup = checkup;
    }

    @Override
    public String toString() {
        return this.getName() + " is " + this.getAge() + " years old and weighs " + this.getWeight();
    }

    @Override
    public boolean equals(Object obj) {
        Animal a = (Animal)obj;
        if(this.isCheckup() == a.isCheckup()){
            return true;
        }
        else{
            return false;
        }
        // return this.isCheckup() == ((Animal)obj).isCheckup();
    }
    
    
    public String makeSound(){
        return "Roar!!!";
    }
    
    
    
}//end Animal class
