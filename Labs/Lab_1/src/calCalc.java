import java.util.Scanner;

public class calCalc {
	
	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final int RUNNING_MET = 10;
		final int TENNIS_MET = 8;
		final int SLEEPING_MET = 1;
		
		// metabolic equivalents (MET)	
		
		System.out.print ("Input person's weight in kg: ");
		int kg  = keyboard.nextInt();
		
		double running_cal = RUNNING_MET * 3.5 * kg / 200;
		double tennis_cal = TENNIS_MET * 3.5 * kg / 200;
		double sleeping_cal = SLEEPING_MET * 3.5 * kg / 200;
		
		int total_cal = (int) (running_cal*30+tennis_cal*30+sleeping_cal*6*60);
		
		System.out.println(total_cal);
		

	}

}
