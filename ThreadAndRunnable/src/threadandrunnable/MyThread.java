
package threadandrunnable;


public class MyThread extends Thread {
    
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Running " + this.name);
        
        try{
            for(int i = 0; i < (int)(Math.random() * 10) + 1; i++){
                System.out.println(this.name + " has ran " + i + " times");
                Thread.sleep(123);
            }
            System.out.println(this.name + " has finsihed running");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
}
