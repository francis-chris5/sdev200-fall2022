import java.util.*;

public class SayHi {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hey, who are you? ");
		String userName = keyboard.nextLine();
		System.out.println("Well hello there " + userName + ", this is all this software does.");
	}
}