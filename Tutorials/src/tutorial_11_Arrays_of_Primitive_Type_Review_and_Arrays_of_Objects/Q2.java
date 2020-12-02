package tutorial_11_Arrays_of_Primitive_Type_Review_and_Arrays_of_Objects;

public class Q2 {
	
	static double sum2(double[] row, int n) {
		if(n > row.length)
			n = row.length;
		
		double sum = 0;
		
		for(int i=0; i<n; i++)
			sum += row[i];
		
		return sum;
	}

	public static void main(String[] args) {
		double[] mydoubles = {1,2,3,4,5};
		
		System.out.println(sum2(mydoubles, 40));
	}

}
