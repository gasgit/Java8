package ie.gasgit.d;

public interface IDef {
	
	// abstract method signature
	// implementation required 
	int add(int x, int y);
	// default method 
	default int multiply(int x, int y){
		return x * y;
		
	}

}
