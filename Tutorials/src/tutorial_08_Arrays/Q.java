package tutorial_08_Arrays;

public class Q {

	public static void main(String[] args) {
		
		int[][] magicSquare = {	{4,  9,  2},
								{3,  5,  7},
								{8,  1,  6}};
		
		int diag1_sum = 0, diag2_sum = 0;
		int rowSum = 0;
		
		int[] ColSums = new int[magicSquare.length];
		int[] rowSums = new int[magicSquare.length];
		
		for(int i=0; i<magicSquare.length; i++) {
			diag1_sum += magicSquare[i][i];
			diag2_sum += magicSquare[i][magicSquare.length-1-i];	

			for(int j=0; j<magicSquare[i].length; j++) {
				ColSums[j] += magicSquare[i][j];
				rowSums[i] += magicSquare[i][j];
			}
		}
		
		boolean flag = true;
		for(int i=1; i<magicSquare.length; i++) {
			if(ColSums[i] != ColSums[i-1] || rowSums[i] != rowSums[i-1]) {
				flag = false;
				break;
			}	
		}
		
		if(diag1_sum==diag2_sum && flag==true && diag1_sum==ColSums[0] && diag1_sum==rowSums[0]) {
			System.out.println("It is a magic square");
		}else
			System.out.println("Not a magic square");
			
		
		
		
		
		
		
		
//		int[][] square = {	{1,  2,  3,  4},
//							{5,  6,  7,  8},
//							{9, 10, 11, 12},
//							{13,14, 15, 16}};
		
//		int[][] square = {	{1,  2,  3},
//							{5,  6,  7},
//							{9, 10, 11}};
		
//		int sum = 0;
//		for(int i=0; i<square.length; i++) {
//			sum += square[i][i] + square[i][square.length-1-i];
//		}
//		
//		if(square.length % 2 == 1)
//			sum -= square[square.length/2][square.length/2];
//		
//		System.out.println("SUM = "+ sum);
		
		
//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		
//		for(int num : arr)
//			System.out.print(num+ " ");
//		
//		
//		for(int i=0; i < arr.length/2; i++) {
//			int tmp = arr[i];
//			arr[i] = arr[arr.length-1-i];
//			
//			arr[arr.length-1-i] = tmp;
//		}
//		
//		System.out.println();
//		for(int num : arr)
//			System.out.print(num+ " ");

	}

}
