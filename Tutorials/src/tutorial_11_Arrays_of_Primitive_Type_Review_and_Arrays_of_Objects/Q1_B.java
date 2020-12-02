package tutorial_11_Arrays_of_Primitive_Type_Review_and_Arrays_of_Objects;

public class Q1_B {

	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 11, 15 };
		int sum = 0;
		for (int i = 1; i < data.length; ++i) {
			sum = sum + data[i] - data[i - 1];
			System.out.println("sum = " + sum);
		}
	}

}
