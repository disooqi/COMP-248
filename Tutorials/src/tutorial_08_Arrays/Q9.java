package tutorial_08_Arrays;


public class Q9 {

	public static void main(String[] args) {
		int[][] magicSquare = {	{4,  9,  2},
								{3,  5,  7},
								{8,  1,  6}};
		
		int diag1=0, diag2=0;
		boolean isRowOK = true;
		boolean isColOK = true;
		int[] cols = new int[magicSquare.length];
		for(int i=0; i<magicSquare.length;i++) {
			diag1 += magicSquare[i][i];
			diag2 += magicSquare[i][magicSquare.length-1-i];
			
			int row = 0;
			for(int j=0; j<magicSquare[i].length; j++) {
				cols[j] += magicSquare[i][j];
				row += magicSquare[i][j];
			}
			if(row != 15) {
				isRowOK = false;
				break;
			}
		}
		for(int i=0; i<cols.length;i++)
			if(cols[i] != 15) {
				isColOK = false;
				break;
			}
		
		if(isRowOK && isColOK && diag1==15 && diag2==15) 
			System.out.println("This is a magic square.");
		else
			System.out.println("Not a magic square.");
	
		

	}

}
