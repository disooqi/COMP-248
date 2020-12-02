package tutorial_04_Boolean_Expr_and_Selection_Instructions;

public class q4 {

	public static void main(String[] args) {
		/*
		Question 4:
			Write a series of if statement statements to compute the amount of shipping due on an online sale. 
			If the cost of the purchase is less than or equal to $20, the shipping cost is $5.99. If the cost of 
			the purchase is over $20 and at most $65, the shipping cost is $10.99. If the cost of the purchase is 
			over $65, the shipping cost is $15.99.
		 */
		
		double purchase = 92.03;
		
		if (purchase <= 20.0)
			System.out.println("the shipping cost is $5.99");
		
		if (purchase > 20 && purchase <= 65)
			System.out.println("the shipping cost is $10.99");
		
		if (purchase > 65)
			System.out.println("the shipping cost is $15.99");
		
		

		
		
	}

}
