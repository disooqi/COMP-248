package tutorial_08_Arrays;

public class Q8 {

	public static void main(String[] args) {
//		int[][] square = {	{1,  2,  3,  4},
//							{5,  6,  7,  8},
//							{9, 10, 11, 12},
//							{13,14, 15, 16}};
		int[][] square = {	{1,  2,  3},
							{5,  6,  7},
							{9, 10, 11}};
		int sum = 0;
		for(int i=0; i<square.length; i++) {
			
			if(i != square.length-1-i)
				sum += square[i][i] + square[i][square.length-1-i];
			else
				sum += square[i][i];
		}
		
		System.out.println(sum);

	}

}
