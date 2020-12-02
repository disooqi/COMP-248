package tutorial_09_Introduction_to_Classes;

public class Question {
	// Complete the method computeTotal() so that it calculates the total score (sum of gradeQ1,
	// gradeQ2 and gradeQ3) and assigns it to the attribute total.

	private int gradeQ1;
	private int gradeQ2;
	private int gradeQ3;
	private int total;

	public void computeTotal() {
		total = gradeQ1 + gradeQ2 + gradeQ3;
	}

	public int returnTotal() {
		return total;
	}

	public void printTotal() {
		System.out.println("The total score is" + total);
	}

	public boolean getQuestionRight() {
		return true;
	}

}
