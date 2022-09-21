
package objectexample1;

public class ObjectExample1 {

    public static void main(String[] args) {
        Lion a1 = new Lion("simba", 3, 450, true);
        Lion a2 = new Lion("scar", 10, 425, false);
        System.out.println(a1);
        if(a1.equals(a2)){
            System.out.println("everything's good");
        }
        else{
            System.out.println("one of them needs some emergency care");
        }
        System.out.println(a1.makeSound());
        
        
        Gorilla g1 = new Gorilla("george", 5, 123, false);
        System.out.println(g1.makeSound());
        
        Cat c1 = new Cat("fluffy", 7, 5, true);
        System.out.println(c1.makeSound());
        
        Dog d1 = new Dog("fido", 4, 15, false, true);
        System.out.println(d1 + " and wears a bandana");
        
    }//end main()
    
    
    
}
