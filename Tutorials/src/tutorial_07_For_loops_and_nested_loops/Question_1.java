package tutorial_07_For_loops_and_nested_loops;

public class Question_1 {

	public static void main(String[] args) {
		// i++ => i+=1 => i = i+1
		// Question 1: What is the output of the following code segments:
		// for(stat 1; stat 2; stat 3)
//		for(;;)
//			System.out.println("Hello There");

//		// A.
//		for (int i = 1; ++i < 4;)
//			System.out.print(i);

//
//		// B.
//		for (int i = 1; i < 4; i++)
//			System.out.print(i);

//		System.out.println();

//
//		// C.
//		for (int i = 1; i++ < 4;)
//			System.out.print(i);
//
//		// D.
//		for (int i = 1; i < 4; ++i)
//			System.out.print(i);
//
//		// E.
//		for (int j = 0; j <= 2; j++) // outer loop
//		{
//			System.out.print(j);
//			for (char ch = 'A'; ch <= 'M'; ch += (3 + j)) // inner loop
//				System.out.print((char) (ch + 1));
//			System.out.println();
//		}
//
		// F.
//		for (int i = 1; i < 9; i++) {
//			if (i % 2 == 0)
//				System.out.println(i + 1);
//			else if (i % 3 == 0)
//				continue;
//			else if (i % 5 == 0)
//				break;
//			else
//				System.out.println("Not multiple of 2, 3 or 5.");
//		}
//		System.out.println("End");

//		// G.
		int sum = 0;
		for (int k = 0; k < 7; k++) {
			for (int j = 7; j > 2 * k; j -= 2) {
				System.out.print(" " + (j - k) + "+");
				sum += (j - k);
			}
			System.out.println();
		}
		System.out.println(" = " + sum);

	}

}
