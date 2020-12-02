package tutorial_08_Arrays;

public class Q4 {

	public static void main(String[] args) {
		int[] x = { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }; // x has 50 elements

		int i, t;

//		for (i = 2; i < 8; i++) 			// line 1
//			if (x[i] != 0) 					// line 2
//			{ 								// line 3
//				System.out.print(i + " "); 	// line 4 – for question A
//				t = 2 * i; 					// line 5
//				while (t < 100) 			// line 6
//				{ 							// line 7
//					x[t] = 0; 				// line 8
//					t += i; 				// line 9
//				} 							// line 10
//			} 								// line 11
		System.out.println(); 				// line 12
		for (i = 2; i <= 50; i++) 			// line 13
			if (x[i] != 0) 					// line 14
				System.out.println(i); 		// line 15 – for question B

	}

}
