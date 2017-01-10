package ie.gasgit.s;

/*
 * static methods declared in interface 
 * can be called from any class using interface name
 */

public interface IStaticMethods {
	
	static int add(int x, int y){
		return x + y;
	}
	
	static int multiply(int x, int y){
		return x * y;
	}

}
