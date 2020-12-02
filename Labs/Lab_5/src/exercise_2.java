import java.util.Scanner;

public class exercise_2 {
	private static String numeronym;
	private static String numeronym_reversed = "";
	public static void print_pattern(int _len) {
		 if(_len >= numeronym_reversed.length()){
			 System.out.println(numeronym_reversed.substring(0, _len));
			    return;
			  }
			  System.out.println(numeronym_reversed.substring(0, _len));
			  print_pattern(_len+1);
			  System.out.println(numeronym_reversed.substring(0, _len));
	}

	public static void main(String[] args) {
		System.out.print("Enter a string of digits: ");
		Scanner kb = new Scanner(System.in);
		numeronym = kb.nextLine();
		

		
//		for(int i = numeronym.length()-1; i>-numeronym.length(); i--) {
//			System.out.println();
//			for(int j = 0; j < numeronym.length() -Math.abs(i); j++)
//				System.out.print(numeronym.charAt(numeronym.length()-1-j)+"\t");
//		}
		
		/*
		 * Ahmed Mamdouh
		 * */
		
	
	     char[] ch = numeronym.toCharArray();  
		 for (int i = ch.length - 1; i >= 0; i--)
			 numeronym_reversed += ch[i];
	
		print_pattern(0);
		
		

	}

}
