package tutorial_05_Nested_Selection_switch;
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		
		

		
		Scanner myKeyboard = new Scanner(System.in);
		String msg = myKeyboard.next();
		int x = 0;
		int y = 10;
		int z = 100;
		switch (msg.charAt(0)) {
		case 'a':
		case 'b':
			System.out.println("case 1");
			x = (msg.equals("abc") ? (5 + y++) : (--y + z--));
			break;
		case 'c':
			System.out.println("case 2");
			y /= 5; // y = y/5
		default:
			System.out.println("default");
	
		}
		System.out.println(x + " " + y + " " + z);
//		


	}

}
