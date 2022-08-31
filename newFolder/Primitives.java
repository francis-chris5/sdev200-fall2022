
package primitives;


public class Primitives {

    public static void main(String[] args) {
        byte b1 = 123;
        short s1 = 14567;
        int i = 145678;
        long big = 1234567898765L;
        
        double dub = 1.07;
        float flt = 1.07f;
        
        boolean flag = true;
        boolean otherFlag = false;
        
        char startOfAlphebet = 'A';
        String someWords = "Hello World";
        
        //math: + - * / %
        
        //division
        
        int x, y;
        double w, v;
        
        x = 4;
        y = 3;
        w = 2.34;
        v = 5.76;
        
        System.out.println(x/y);
        System.out.println(w/v);
        System.out.println(x/w);
        System.out.println(x/3.0); //if you want fractional part include decimals
        
        
        System.out.println("8 bits of data to store " + b1 + ".");
        System.out.println("16 bits of data to store " + s1);
        System.out.println("32 bits of data to store " + i);
        System.out.println("64 bits of data to store " + big);
        
        System.out.println("a 64 bit real number " + dub);
        
    }
    
}
