
package objectexample1;

import java.util.ArrayList;

public class ObjectExample1 {

    public static void main(String[] args) {
        ArrayList<Object> stuff = new ArrayList<>();
        stuff.add(3);
        stuff.add(3.14);
        stuff.add(3.14f);
        stuff.add(new Cat("kitty-kitty", 1, 3, Covering.HAIR, true));
        stuff.add(new Lion("thing", 1, 1, Covering.SCALES, false));
        stuff.add("Hello World");
        System.out.println(stuff);
        
        ObjectExample1 thisThing = new ObjectExample1();
        Lion a1 = new Lion("simba", 3, 450, Covering.HAIR, true);
        Lion a2 = new Lion("scar", 10, 425, Covering.HAIR, false);
        System.out.println(a1);
        if(a1.getCovering() == a2.getCovering()){
            System.out.println("everything's good");
        }
        else{
            System.out.println("one of them needs some emergency care");
        }
        System.out.println(a1.makeSound());
        
        
        Gorilla g1 = new Gorilla("george", 5, 123, Covering.HAIR, false);
        System.out.println(g1.makeSound());
        
        Cat c1 = new Cat("fluffy", 7, 5, Covering.HAIR, true);
        System.out.println(c1.makeSound());
        
        Dog d1 = new Dog("fido", 4, 15, Covering.HAIR, false, true);
        System.out.println(d1 + " and wears a bandana");
        
        Dog d2 = new Dog("Rex", 9, 21, Covering.HAIR, true, true); 
        
        System.out.println(Animal.getAnimalCounter());

        Animal fish = new Fish("Boobs", 4, 1, Covering.SCALES, true);
        Animal eel = new Eel("Slick", 2, 5, Covering.SLIME, false);
        
        System.out.println(fish);
        System.out.println(eel);
        
        System.out.println("\n\n");
        thisThing.doesNotLikeTheVet(a1);
        thisThing.doesNotLikeTheVet(eel);
        thisThing.doesNotLikeTheVet(fish);
        thisThing.doesNotLikeTheVet(eel);
        thisThing.doesNotLikeTheVet(d1);
        thisThing.doesNotLikeTheVet(d2);
        thisThing.doesNotLikeTheVet(g1);
        thisThing.doesNotLikeTheVet(c1);
        
        
        System.out.println(thisThing.hasFur(eel));
        System.out.println(thisThing.hasFur(d1));
        System.out.println(thisThing.hasFur(a1));
        
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(eel);
        animals.add(fish);
        animals.add(d2);
        animals.add(d1);
        animals.add(c1);
        animals.add(g1);
        animals.add(a2);
        animals.add(a1);
        System.out.println(animals);

    }//end main()
    
    
    
    public void doesNotLikeTheVet(Animal animal){
        System.out.println(animal.makeSound());
        System.out.println(animal.makeSound());
        System.out.println(animal.makeSound());
        System.out.println(animal.makeSound());
    }
    
    
    
    public Animal hasFur(Animal animal){
        if(animal.getCovering() == Covering.HAIR){
            return animal;
        }
        else{
            return null;
        }
    }
    
    
}
