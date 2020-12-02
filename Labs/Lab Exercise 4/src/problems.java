import java.util.Scanner;

public class problems {

	public static void main(String[] args) {
		System.out.print("Enter a word: ");
		Scanner myScanner = new Scanner(System.in);
		String word = myScanner.next();
		System.out.println();
		for(int i=word.length()-1; i>=0; i-=2) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
		String capitalWord = word.toUpperCase();
		for(int i=0; i<capitalWord.length(); i+=2) {
			System.out.print(capitalWord.charAt(i));
		}
		System.out.println();
		System.out.print(word);
		
		/*
		nanCy_12a
		
		Enter a word: 
		a1ynn
		NNY1A
		nanCy_12a
		
		elephant
		
		Enter a word: 
		tapl
		EEHN
		elephant
		*/
			

	}

}
