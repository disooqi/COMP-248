package tutorial_07_For_loops_and_nested_loops;

public class q4 {

	public static void main(String[] args) {
		/*
		 * Question 4: Write a program that prints the numbers from 1 to 100. But for
		 * multiples of three print “Fizz” instead of the number and for the multiples
		 * of five print “Buzz”. For numbers which are multiples of both three and five
		 * print “FizzBuzz”.
		 * 
		 * Use a for loop to solve this problem.
		 * 
		 */

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}

	}

}
