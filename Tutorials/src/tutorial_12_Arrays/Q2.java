package tutorial_12_Arrays;

public class Q2 {

	public static void main(String[] args) {
		char ch = 'A';
		char[][] ary = new char[5][];
		
		for (int k = 0; k < ary.length; k++) {
			ary[k] = new char[k + 1];
			for (int j = 0; j < ary[k].length; j++) {
				System.out.print("["+ch+"] ");
				ary[k][j] = ch++;
			}
			System.out.println();
		}

	}

}

// 