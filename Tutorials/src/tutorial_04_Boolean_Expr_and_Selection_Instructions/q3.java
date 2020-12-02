package tutorial_04_Boolean_Expr_and_Selection_Instructions;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
//		Question 3:
//			Write a series of if statements that evaluate a person’s weight on the following criteria:
//			• A weight less than 116 pounds, output: Eat 5 banana splits!
//			• A weight between 116 pounds and 130 pounds, output: Eat a banana split!
//			• A weight between 131 pounds and 200 pounds, output: Perfect!
//			• A weight greater than 200 pounds, output: Plenty of banana splits have been consumed!
		
		Scanner inStream = new Scanner(System.in);
		
		int weight = inStream.nextInt();
		
		if(weight < 116)
			System.out.println("Eat 5 banana splits!");
		if(weight >= 116 && weight <= 130)
			System.out.println("Eat a banana split!");
		if(weight >= 131 && weight <= 200)
			System.out.println("Perfect!");
		if(weight > 200)
			System.out.println("Plenty of banana splits have been consumed!");

	}

}
