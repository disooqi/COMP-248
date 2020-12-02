package tutorial_07_For_loops_and_nested_loops;

public class q2 {

	public static void main(String[] args) 
	{
		// Assume the following program:
		int prevprev = 2, prev = 2, sum = 0;

//		for (int i = 1; i < 4; i++)
//		for (int i = 1; ++i < 4;)
		for (int i = 1; i < 4; ++i)
		{
			sum = prevprev + prev;
			System.out.println(prevprev + " " + prev + " " + sum);
			prevprev = prev;
			prev = sum;
		}
	}
}
/*
A.
	What is the output of this program?
	2 2 4
	2 4 6
	4 6 10

	prevprev = 6, prev = 10, sum = 10, i=4
B.
	If we replace the for with the following lines, will the output be the same? If the output will be different, what will it be?
	for (int i = 1; ++i < 4;)
	2 2 4
	2 4 6
	
	prevprev = 4, prev = 6, sum = 6, i=4
	
	for (int i = 1; i < 4; ++i)

*/