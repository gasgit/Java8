package ie.gasgit;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	
	public static void main(String[] args) {
		
		
		List<String> legends = Arrays.asList("Bowie","Prince", "Cohen");
		
		// for each
		System.out.println("ForEach...");
		for(String legend : legends){
			System.out.println(legend);
			
		}
		System.out.println("Stream...");		
		// stream
		legends.stream().forEach(legend-> System.out.println(legend));
	}

}
