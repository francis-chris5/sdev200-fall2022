
package javaapplication32;

public class JavaApplication32 {


    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(3);
        list.add(9);
        list.add(27);
        list.add(12);
        list.add(6);
        list.add(15);
        list.printList();
        
        System.out.println(list.get(2));
        
        list.remove(12);
        list.printList();
    }
    
}
