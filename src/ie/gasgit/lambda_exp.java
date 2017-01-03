package ie.gasgit;

public class lambda_exp {
	
	
	interface HelloWorld{
		void sayHello(String message);
	}
	
	
	public static void main(String[] args) {
		
		HelloWorld hw = message -> System.out.println("Hello " + message);
		hw.sayHello("world");
			
	}

}
