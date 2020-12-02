package tutorial_07_For_loops_and_nested_loops;

public class q6 {

	public static void main(String[] args) {
	// Question 6:
	//	Write a nested for loop to display the following output:
	/*
		a b c d e
		a b c d
		a b c
		a b
		a
	*/
		for(int i=0; i<5; i++) {
		for(char ch = 'a'; ch <='e'-i; ch++)
			System.out.print(ch+" ");
		System.out.println();
		}

		

	}

}
