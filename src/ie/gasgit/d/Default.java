package ie.gasgit.d;

public class Default {

	public static void main(String[] args) {

		// create new instance of Test class
		IDef inf = new Test();
		// call add implementation
		System.out.println("Total Addition: " + inf.add(20, 30));
		// use default method 
		System.out.println("Total Multiplication: " + inf.multiply(10, 20));
			
	}

}
