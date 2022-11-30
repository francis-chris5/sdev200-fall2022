
package javaapplication32;



public class MyList<T> {
    private Node head;
    
    
    
    public void add(T element){
        Node newNode = new Node();
        newNode.setElement(element);
        
        if(this.head == null){
            this.head = newNode;
        }
        else{
            Node current = this.head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
    
    
    public T get(int index){
        int counter = 0;
        Node current = this.head;
        while(counter < index && current.getNext() != null){
            counter++;
            current = current.getNext();
        }
        return (T)current.getElement();
    }
    

    public void remove(T element){
        Node current = this.head;
        while(current.getNext().getElement() != element && current.getNext().getNext() != null){
            current = current.getNext();
        }
        if(current.getNext().getNext()!= null){
            current.setNext(current.getNext().getNext());
        }
        else{
            current.setNext(null);
        }
        
    }
    
    
   public void printList(){
       System.out.print("[");
       Node current = this.head;
       while(current != null){
           System.out.print(current.getElement() + ", ");
           current = current.getNext();
       }
       System.out.println("\b\b]");
   }
    
    
    
    
    class Node<T>{
        private T element;
        private Node next;

        public Node() {
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        
        
        
    }
}
