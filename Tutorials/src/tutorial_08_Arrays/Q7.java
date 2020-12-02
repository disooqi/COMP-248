package tutorial_08_Arrays;

public class Q7 {

	public static void main(String[] args) {
		
		int[] theArray = {1, 2, 3, 4, 5, 6};

		for(int i=0; i<(theArray.length/2); i++) {
			int tmp = theArray[i];
			theArray[i] = theArray[theArray.length-1-i];
			theArray[theArray.length-1-i] = tmp;
		}
		
		System.out.println();
		for(int rtrtrrdfxcz : theArray)
			System.out.println(rtrtrrdfxcz);
		

	}

}
