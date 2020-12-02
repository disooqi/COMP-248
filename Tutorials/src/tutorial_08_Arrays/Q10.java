package tutorial_08_Arrays;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter quare size: ");
		int n = kb.nextInt();
		
		int[][] square = new int[n][n];
		int curRow = n-1, curCol = (n-1)/2;
		if (n%2 == 1) {
			for(int i=1; i<=Math.pow(n, 2); i++) {
				square[curRow][curCol] = i;
				int newRow = (curRow+1)%n;
				int newCol = (curCol+1)%n;
				if(square[newRow][newCol] != 0) {
//					newRow = curRow-1<0?n-1:(curRow-1)%n;
					newRow = (curRow-1+n)%n;
					newCol = curCol;
					}
				curRow = newRow; curCol = newCol;
			}
			
		}else {
			System.out.print("n must be odd"); 
			System.exit(0);
		}
		
		
		for(int i = 0; i<square.length; i++) {
			for(int j=0; j<square.length; j++) {
				if(i*j < 10)
					System.out.print(square[i][j] + "\t");
				else
					System.out.print(square[i][j] + "\t");
			}
			System.out.println();
		}
		
		kb.close();
			

	}

}
