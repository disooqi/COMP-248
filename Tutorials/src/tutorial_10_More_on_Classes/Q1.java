package tutorial_10_More_on_Classes;

public class Q1 {

	public static void main(String[] args) {
		/*
		 * H. Declare 2 points: p1 with coordinates (0,0) and p2 with coordinates (2,3).
		 */
		Point p1 = new Point(0, 0);
		Point p2 = new Point(2, 3);
		
		/*
		 * I. Write the necessary statement(s) to display the coordinates of p1 and p2.
		 */
		System.out.println(p1);
		System.out.println(p2);

		
		/*
		 * J. Write a statement to reverse the coordinates of p2.
		 */
		p2 = p2.reverse();
		
		/*
		 * K. Write the necessary statement(s) to set the coordinates of p1 to be the
		 * reverse of p2. For example, if p1 is (1,2) and p2 is (2,3) then the
		 * coordinates of p1 will be changed to (3,2).
		 */
		p1 = p2.reverse();
		
		/*
		 * L. Write a statement to add 10 to both coordinates of p1.
		 */
		p1.moveBy(10);

		
		/*
		 * M. Write the necessary statement(s) to display the coordinates of p1 and p2
		 * again.
		 */
		System.out.println();
		System.out.println(p1);
		System.out.println(p2);
		
		/*
		 * N. Write the necessary statements to compare the coordinates of points p1 and
		 * p2 and print “Same” if they have the same coordinates and “Different” if they
		 * don't have the same coordinates.
		 */
		if(p1.isEqual(p2)) {
		System.out.print("Same");
		} else 
			System.out.println("Different");
	}

}

class Point {
	private int x; // x-coordinate
	private int y; // y-coordinate

	/*
	 * A. Write a constructor to set the coordinates of the point to two specific
	 * values x1 and y1 which are passed from the driver.
	 */
	// Point p = new Point(3, 8);
	// Point p1 = new Point ();

	public Point(int x1, int y1) {
		x = x1;
		y = y1;
	}

	/*
	 * B. Write two accessor methods: One to return the content of the x coordinate,
	 * the other to return the content of the y coordinate.
	 */
	public int get_X() {
		return x;
	}

	public int get_Y() {
		return y;
	}

	/*
	 * C. Write two mutator methods: One to set the content of the x coordinate to
	 * some value passed from the driver and one to set the y coordinate to some
	 * value which again is passed from the driver.
	 */
	// Point p = new Point(1, 4);
	// p.set_X(99);
	public void set_X(int x1) {
		x = x1;
	}

	public void set_Y(int y1) {
		y = y1;
	}

	/*
	 * D. Write a method called isEqual which will return true if two points have
	 * the same coordinates and false otherwise.
	 */

	// Point p = new Point(0, 0);
	// Point p99 = new Point(1, 3);
	// p.isEqual(p1);
	// p1.isEqual(p);

	// Point.isEqual(p, p1);

	public boolean isEqual(Point p1) {
		return x == p1.x && y == p1.y;
	}

	static boolean isEqual(Point p1, Point p2) {
		return p1.x == p2.x && p1.y == p2.y;
	}

	/*
	 * E. Write a method called reverse which will return a new point with the
	 * coordinates reversed. That is, if the point which invokes the method has
	 * coordinates (a, b), then the method should return a new point with
	 * coordinates (b, a).
	 */

	// Point myNewPoint = p.reverse();
	public Point reverse() {
//		Point newPoint = new Point(y, x);
//		return newPoint;

		return (new Point(y, x));
	}

	/*
	 * F. Write a method called moveBy which will move a point by an integer value.
	 * The method will add to each coordinate the value passed as an argument. So if
	 * the original point was (x1, y1), after this method is invoked it will have
	 * the coordinates (x1+a, y1+a), where a is the argument (the integer value).
	 */
	public void moveBy(int a) {
		x += a;
		y += a;
	}

	/*
	 * G. Write the toString method such that it displays an object in the following
	 * format: Coordinates of point are (x, y) where x and y are the contents of the
	 * instance variables.
	 */

	public String toString() {
		return "Coordinates of point are (" + x + ", " + y + ").";
	}
}
