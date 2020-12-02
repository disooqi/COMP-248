package tutorial_04_Boolean_Expr_and_Selection_Instructions;

public class q7 {

	public static void main(String[] args) {
		/*
		 * https://www.w3schools.com/java/ref_string_compareto.asp
		 * 
		 * Question 7:
		 * Assume the following declarations:
		 * */
		
		int x = 1;
		boolean isFree = false;
		char initial = 'L';
		char code = 'Y';
		String english = "hi";
		String italian = "ciao";
		boolean q = (5 == 6); // q = false
		
		/* For each of the following expressions, indicate if it creates a syntax error or not. If
			there is no error, indicate the value of the expression.
			
			*	(true && (5 > 6))  true && false => false
			*   ((x != 0) || (x % 2 == 1))  => ((x != 0) || (1 == 1)) => true || true => true
			*   (isFree | (x < 0)) => flase | false => fasle
			*   initial == code => false
			*   !!q  => false
			*   (0 <= x <= 10) => invlid (0 <= x && x <= 10)
			*   (english > italian)  invalid , italian.compareTo(english)
			*   initial = code => 
			*   "italian".equals(italian)
			*
			*/
		
		System.out.println("italian".equals(italian));
		
		
//		System.out.println((true && (5 > 6)));
//		System.out.println(((x != 0) || (x % 2 == 1)));
//		System.out.println((isFree | (x < 0)));
//		System.out.println(initial == code);
//		System.out.println(!!q);
//		System.out.println((0 <= x <= 10));
//		System.out.println((english > italian));
//		System.out.println(initial = code);
//		System.out.println("italian".equals(italian));
		
	

	}

}
