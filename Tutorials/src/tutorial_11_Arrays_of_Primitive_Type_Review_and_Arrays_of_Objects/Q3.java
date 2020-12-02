package tutorial_11_Arrays_of_Primitive_Type_Review_and_Arrays_of_Objects;

public class Q3 {
	
	static double getAverageWeight(Airplane[] airplanes) {
		double sum = 0;
		for(int i=0; i<airplanes.length; i++)
			sum += airplanes[i].getWeight();
		
		return sum/airplanes.length;
	}
	
	static Airplane findFasterAirplane(Airplane[] airplanes) {
		Airplane fastestAirplane = null;
		
		
		return fastestAirplane;
	}
	
	public static void main(String[] args) {
		Airplane ap = new Airplane();
		Airplane myAirplane = new Airplane(77.2, 600);
		Airplane ap3 = new Airplane(124, 3412, 469);

		System.out.println(ap.isEqual(myAirplane));
		
		ap.isEqual(myAirplane);
		
		System.out.println(myAirplane);
		
		Airplane[] apArray = {ap, myAirplane, ap3};
		double avg = getAverageWeight(apArray);
		System.out.println(avg);
		
//		ap.isEqual(myAirplane.getNbOfPassengers(), 
//				myAirplane.getWeight(), 
//				myAirplane.getMaxSpeed());
	}
}

class Airplane {
	private int nbOfPassengers;
	private double weight;
	private int maxSpeed;
	
	public Airplane() {
		nbOfPassengers = 0;
		weight = 0;
		maxSpeed = 0;
	}
	
	public Airplane(double weight, int maxSpeed) {
		this.weight = weight;
		this.maxSpeed = maxSpeed;
	}
	
	public Airplane(int nbOfPassengers, double weight, int maxSpeed) {
		this.nbOfPassengers = nbOfPassengers;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
	}
	
	public void setNbOfPassengers(int nbOfPassengers) {
		this.nbOfPassengers = nbOfPassengers;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setMaxSpeed(int mx) {
		maxSpeed = mx;
	}
	
	public int getNbOfPassengers() {
		return nbOfPassengers;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public boolean isEqual(Airplane airplane) {
		return nbOfPassengers == airplane.nbOfPassengers &&
				weight == airplane.weight &&
				maxSpeed == airplane.maxSpeed;
	}
	
	public String toString() {
		return "Plane with capacity of "+nbOfPassengers+" passengers, weighing "+weight+"kg can "
				+ "travel at a maximum speed of "+maxSpeed+"km/hr.";
	}
}
