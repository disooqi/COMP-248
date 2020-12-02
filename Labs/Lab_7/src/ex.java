import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		String breed, name;
		double age;
		// Create 2 objects and display
		MyPet_1 cat1 = new MyPet_1();
		System.out.print("What type of cat do you have? ");
		breed = keyIn.nextLine();
		System.out.print("What is its name? ");
		name = keyIn.next();
		System.out.print("How old? ");
		age = keyIn.nextDouble();

		MyPet_1 cat2 = new MyPet_1(breed, name , age);
		System.out.println("The two cats are:");
		System.out.print(cat1 +  " (" + cat1.inHumanYears() + " human years old)"+ "\n" 
				+ cat2 +  " (" + cat2.inHumanYears() + " human years old)");

		//Change dog2 and display new dog2
		System.out.print("\n\nLet's set up the 1st cat ...\n\tWhat breed is it? ");
		breed = keyIn.nextLine();
		breed = keyIn.nextLine();

		System.out.print("\tWhat is the cat's name? ");
		name = keyIn.next();
		System.out.print("\tHow old is the cat in cat years (a double number)? ");
		age = keyIn.nextDouble();
		cat1.setBreed(breed);
		cat1.setName(name);
		cat1.setAge(age);
		System.out.print("Cat1 is now a(n) ");
		System.out.println(cat1.getBreed() + " whose name is " + cat1.getName() + " and " 
				+ cat1.getAge() +  " cat years (" + cat1.inHumanYears() + " human years old)");

		// Same dogs?
		System.out.println("\nAre the 2 cats the same breed and age?");
		if( cat1.equals(cat2))
			System.out.print("Yes, they are the same breed and age");
		else
			System.out.print("No, they are not the same breed and/or age");

		keyIn.close();
	}

}

class MyPet_1 {
	private String breed;
	private String name;
	private double age;
	
	public MyPet_1() {
		breed = null;
		name = null;
		age = 0;
	}
	
	public MyPet_1(String b, String n, double a) {
		breed = b;
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public double getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setBreed(String b) {
		breed = b;
	}
	
	public void setAge(double a) {
		age = a;
	}
	
	public String toString() {
		return breed +" whose name is "+name+" and "+age+" cat years";
	}
	
	public boolean equals(MyPet_1 mp) {
		return (age == mp.age && breed.equals(mp.breed));
	}
	
	public double inHumanYears() {
		if(age>=0 && age<=1)
			return 18*age;
		else if (age>1 && age<=2)
			return 18 + (age-1)*9;
		else
			return 18 + 9 + (age-2)*5;
			
	}
}