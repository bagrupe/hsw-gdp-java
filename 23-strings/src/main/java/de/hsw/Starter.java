package de.hsw;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        // Equals
        String test1 = "HalloWelt";
		String test2 = "HalloWelt";
		
		if(test1 == test2) {
			System.out.println("String ist gleich");
		} else {
			System.out.println("String ist nicht gleich");
		}
		
		String test3 = new String("HalloWelt");
		
		if(test1 == test3) {
			System.out.println("String ist gleich");
		} else {
			System.out.println("String ist nicht gleich");
        }
        
        // Diverse Methoden
        String beispiel = "Grundlagen der Programmierung";
		
		System.out.println(beispiel.substring(11));
		System.out.println(beispiel.codePointAt(0));
		System.out.println(beispiel.replace("der", "der Java"));
		System.out.println(beispiel.endsWith("Java"));
		System.out.println(beispiel.toLowerCase());
		System.out.println(Arrays.toString(beispiel.toCharArray()));
    }
}
