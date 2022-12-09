
package collectionstreams;

import java.util.*;
import java.util.stream.*;

public class CollectionStreams {
    
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        for(int i =0; i < 25; i++){
            mySet.add((int)(Math.random()*100));
        }
        System.out.println(mySet);
        
        mySet.stream().limit(8).filter(i -> i < 60).forEach(i ->System.out.print(i + ", "));
        
        //find sum of all element less than some value n
        System.out.println();
        System.out.println(mySet.stream().filter(i -> i < 10).reduce(0, (a, b) -> a + b));
        
            //find the sum of the list using parrallel processors
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(mySet.stream().parallel().reduce(0, (a, b) -> a + b));
    }
    
}
