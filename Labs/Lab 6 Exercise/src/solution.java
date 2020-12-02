import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a string of digits: ");
		String numeronym = kb.nextLine();
		
		for(char c : numeronym.toCharArray()) {
			System.out.print(c);
			System.out.print(' ');
		}
		System.out.println();

		
		for(int i=1; i<numeronym.length()-1; i++) {
			System.out.print(numeronym.toCharArray()[i]);
			for(int j=0; j<numeronym.length()*2-3; j++) {
				System.out.print(' ');
			}
			System.out.print(numeronym.toCharArray()[numeronym.length()-1-i]);
			System.out.println();
		}
		
		for(int i=numeronym.length()-1; i>=0; i--) {
			System.out.print(numeronym.toCharArray()[i]);
			if(i!=0)
				System.out.print(' ');
			else
				System.out.println();
		}

	}
// 32478
// 06783219
}
