package tutorial_04_Boolean_Expr_and_Selection_Instructions;

public class q8 {

	public static void main(String[] args) {
		/* 
		 * Question 8:
		 * 		What is the output of the following?
		 * */
		
		int x = 555;
		boolean isNegative = (x < 0);  // true
		
		if (isNegative) {
			
			x = 100;
			isNegative = (x < 0);
			
			if (isNegative)
				System.out.println("no");
			else
				System.out.println("yes");
		} else
			System.out.println("maybe");

	}

}
