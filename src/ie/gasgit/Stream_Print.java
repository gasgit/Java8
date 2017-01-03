package ie.gasgit;


import java.util.stream.Collectors;

import java.util.*;


public class  Stream_Print{

  public static void main(String args [] ){

    List<String> bands = Arrays.asList("Metallica", "Megadeth", "Muse", "Gojira", "Slayer", "Anthrax", "", "");
    
    
    List<String> notEmpty = bands.stream().filter(str -> !str.isEmpty() ).collect(Collectors.toList());
    
    System.out.println("Not Empty: " + notEmpty);


    List<String> filtered = bands.stream().filter(str -> str.startsWith("G")).collect(Collectors.toList());
    

    System.out.println("Starts With: " + filtered);

  }
}
