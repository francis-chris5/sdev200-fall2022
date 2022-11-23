
package datastructures;

import java.time.zone.ZoneOffsetTransitionRule;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class DataStructures {

    public static void main(String[] args) {
        System.out.println("\n\nVector");
        Vector<Object> v1 = new Vector<>();
        v1.add("words");
        v1.add(3);
        v1.add(true);
        v1.add(Math.PI);
        System.out.print("[");
        for(Object v : v1){
            System.out.print(v + ", ");
        }
        System.out.print("\b\b");
        System.out.println("]");
        
        System.out.println(v1.get(1));
        v1.remove("words");
        System.out.print("[");
        for(Object v : v1){
            System.out.print(v + ", ");
        }
        System.out.print("\b\b");
        System.out.println("]");
        
        //arraylists and linkedlists inherit from vector and modify memory usage and growth patterns (background)
        
        System.out.println("\n\nStack");
        Stack<Object> s1 = new Stack<>();
        s1.push("words");
        s1.push(3);
        s1.push(true);
        s1.push(Math.PI);
        System.out.println("How big: " + s1.size());
        System.out.print("[");
        while(!s1.empty()){
            System.out.print(s1.pop() + ", ");
        }
        System.out.print("\b\b");
        System.out.println("]");
        System.out.println("How big: " + s1.size());
        
        
        
        System.out.println("\n\nQueue");
        Queue<Object> q1 = new LinkedList<>();
        q1.offer("words");
        q1.offer(3);
        q1.offer(true);
        q1.offer(Math.PI);
        System.out.println("How big: " + q1.size());
        System.out.print("[");
        while(!q1.isEmpty()){
            System.out.print(q1.poll() + ", ");
        }
        System.out.print("\b\b");
        System.out.println("]");
        System.out.println("How big: " + q1.size());
        
        // stacks and queues both have a .peek() method to see the next item without altering it
        
        
        System.out.println("\n\nPriority Queue");
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        p1.offer(7);
        p1.offer(3);
        p1.offer(19);
        p1.offer(2);
        p1.offer(22);
        p1.offer(4);
        System.out.println("How big: " + p1.size());
        System.out.print("[");
        while(!p1.isEmpty()){
            System.out.print(p1.poll() + ", ");
        }
        System.out.print("\b\b");
        System.out.println("]");
        System.out.println("How big: " + p1.size());
        
        
        System.out.println("\n\nSet");
        Set<Object> s2 = new HashSet<>();
        s2.add("words");
        s2.add(3);
        s2.add(true);
        s2.add(Math.PI);
        System.out.print("[");
        for(Object s : s2){
            System.out.print(s + ", ");
        }
        System.out.print("\b\b");
        System.out.println("]");
        
        long start = System.nanoTime();
        
        System.out.println("\n\nMap");
        Map<String, Object> m1 = new HashMap<>();
        m1.put("words", "Hello World");
        m1.put("myInt", 3);
        m1.put("yes", true);
        m1.put("pie", Math.PI);
        
        System.out.println(m1);
        
        System.out.println(m1.get("yes"));
        System.out.println(m1.get("pie"));
        
        m1.replace("yes", 1.0/0);
        System.out.println(m1.get("yes"));
        
        long end = System.nanoTime();
        
        System.out.println("Duration: " + (end - start));
        
        
    }
 
    
}
