package tutorial_09_Introduction_to_Classes;

public class AClass {
	private int a;
	public int b;

	public AClass() {
		a = 10;
		b = 10;
	}

	private void increment() {
		increment(1);
	}

	public void increment(int i) {
		a += i;
		b += i;
	}
	
	public String toString() {
		return "This is the object";
	}
}
