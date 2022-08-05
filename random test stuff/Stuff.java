

import java.util.*;

public class Stuff{

	public static void main(String[] args){
		if(args[0].equals("knock knock")){
			System.out.println("Who's knocking on my door?");
		}
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Now just who do you think you are? ");
		String name = keyboard.next();
		System.out.println("Oh, in that case... my apologies, Hello " + name);
	}//end main()

}//end Stuff class