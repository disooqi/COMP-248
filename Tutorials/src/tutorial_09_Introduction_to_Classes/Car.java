package tutorial_09_Introduction_to_Classes;

public class Car {
	int year;
	String model;
	String man;
	double weight;
	
	Car(String model, int year, double weight){
		this.model = model;
		this.year = year;
		this.weight = weight;
	}
	
	void drive() {}
	void stop() {}
	
	
	void openFrontRightDoor() {}
	void openFrontLeftDoor( ) {}
	void openDoor(String pos) {}

}
