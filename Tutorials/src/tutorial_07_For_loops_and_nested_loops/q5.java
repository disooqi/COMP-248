package tutorial_07_For_loops_and_nested_loops;

public class q5 {

	public static void main(String[] args) {
		/*
Question 5:
Write programs to draw the following shapes:

A.
*
**
***
****
*****

B.

    *
   ***
  *****
 *******
*********


		 * */
		

		for(int i=0; i<5; i++) {
			for(int k=0; k<4-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++)
				System.out.print("*");
			System.out.println();
		}
		


	}

}
