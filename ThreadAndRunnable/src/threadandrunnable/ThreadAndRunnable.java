
package threadandrunnable;


public class ThreadAndRunnable {

    public static void main(String[] args) {
        
//        long start = System.nanoTime();
//        for(int i=0; i < 12; i++){
//            MyThread t = new MyThread("thread_" + i);
//            t.start();
//        }
//        long end = System.nanoTime();
//        System.out.println("Time: " + (end - start));

        for(int i=0; i < 12; i++){
            MyRunnable r = new MyRunnable("thread_" + i);
            r.start();
        }
        
    }
    
}
