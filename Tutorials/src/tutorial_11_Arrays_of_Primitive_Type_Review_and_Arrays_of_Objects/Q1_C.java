package tutorial_11_Arrays_of_Primitive_Type_Review_and_Arrays_of_Objects;

public class Q1_C {
	public static int sumIf(int[] a, boolean[] b) {
		int sum = 0;
		for (int i = 0; i < a.length; ++i)
			if (b[i])
				sum = sum + a[i];
		return sum;
	}

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7 };
		boolean[] filter = { true, false, true, true, false, true, true };
		System.out.println("data:" + sumIf(data, filter));
		for (int i = 0; i < filter.length; ++i)
			filter[i] = !filter[i];
		System.out.println("data:" + sumIf(data, filter));
	}

}
