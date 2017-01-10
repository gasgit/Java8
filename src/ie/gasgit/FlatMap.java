package ie.gasgit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * stream couple of string arrays 
 * convert to flatMap, upperCase, forEach to print
 */

public class FlatMap {

	public static void main(String[] args) {

		
		Stream<List<String>> myStream = Stream.of(Arrays.asList("one", "two","Three"), Arrays.asList("four", "five", "Six"));
		
		myStream.flatMap(str -> str.stream()).map(String::toUpperCase).forEach(System.out::println);
	}

}
