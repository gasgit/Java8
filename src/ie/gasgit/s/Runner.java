package ie.gasgit.s;

public class Runner {

	public static void main(String[] args) {
	
		System.out.println("Call static add method using interface : " + IStaticMethods.add(12, 13));
		System.out.println("Call static multiply method using interface : " + IStaticMethods.multiply(12, 13));

	}

}
