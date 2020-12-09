package tutorial_12_Arrays;

public class Driver3A {
	public static void main(String[] args) {
		new Q3_Array_3A();
	}
}

class Q3_Array_3A {
	public Q3_Array_3A() {
		char[] a = { 'a', 'b', 'c', 'd', 'e' };
		change(a);
		System.out.println(new String(a));
	}

	private void change(char[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			char c = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = c;
		}
	}
}
