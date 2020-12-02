package tutorial_04_Boolean_Expr_and_Selection_Instructions;

public class q5 {

	public static void main(String[] args) {
		/*
		Question 5:
			What is the value of these expressions?
			1+2 > 4-2 && 12 < 23  => 3 > 2 && 12 < 23 => true && true => true 
			1+2 > 4-2 || 12 < 23 => true || true => true 
			1+2 > 4-2 && 12 > 23 => true && false => false
			1+2 > 4-2 || 12 > 23 => true || false => true
			*/
		
		System.out.println(1+2 > 4-2 && 12 < 23);
		System.out.println(1+2 > 4-2 || 12 < 23);
		System.out.println(1+2 > 4-2 && 12 > 23);
		System.out.println(1+2 > 4-2 || 12 > 23);
		
		

	}

}
