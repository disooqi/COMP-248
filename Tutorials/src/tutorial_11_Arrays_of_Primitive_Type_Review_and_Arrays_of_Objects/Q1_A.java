package tutorial_11_Arrays_of_Primitive_Type_Review_and_Arrays_of_Objects;

public class Q1_A {

	public static void main(String[] args) {
		int i;
		int a[] = { 5, 2, 3, 1, 1, 0, 2, 1, 0, 1 };
		for (i = 0; (i < 10); i++) {
			if (a[i] == 0)
				break;
			if (i % 3 == 0)
				continue;
			System.out.println("a[" + i + "]:" + a[i]);
		}
	}

}
