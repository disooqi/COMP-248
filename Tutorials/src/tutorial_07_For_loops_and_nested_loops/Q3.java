package tutorial_07_For_loops_and_nested_loops;

public class Q3 {

	public static void main(String[] args) {
		
		// Write a program to compute PI: PI = 4 * (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 ....)
		/* 
		 * * A. Use a for loop (10000 iteration) and % symbol to find odd numbers.
		 * * B. Use a for loop (10000 iteration) but don’t use % symbol to find odd numbers.
		 */
		
		double sum = 0;
		boolean sign = true;
		for(int i=1; i<=10000; i+=2) {
				if(sign)
					sum += 1.0/i;
				else
					sum -= 1.0/i;
				sign = !sign;
		}
		System.out.println("PI = " + (4 * sum));
		
		


	}

}
