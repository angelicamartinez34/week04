package week04;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// an array we can only use array.length()
		String[] cars = new String[3];
		cars[0] = "Impala";
		cars[1] = "Tesla";
		cars[2] = "Bronco";
	
		
		
		// List<A>  A is where you put the data type you will use
		// List<String> this reads as - list of String
		
		// make sure you import the list , using java.util by clicking on the first (List) in the method
		// must say ArrayList not List again after the =
		// must import ArrayList as well from Java.util
		List<String> sports = new ArrayList<String>();
		sports.add("Boxing");
		sports.add("Soccer");
		sports.add("Baseball");
		sports.add("Basketball");
		sports.add("Volleyball");
		sports.remove(2);
		
		// using lists we can only use list.size() not .length
		for (int i = 0; i < sports.size(); i++) {
			// for a list we use list.get(i) we use this to print out the list to the console
			System.out.println(sports.get(i));
		}
		
		System.out.println("--------");
		// same thing but with an enhanced for loop
		// this means - for each String called sport in our sports list , print out that sport
		for ( String sport : sports) {
			System.out.println(sport);
		}
		
		// List<> on the left hand = ArrayList<> or whatever type of list on the right
		List<Integer> numbers = new ArrayList<Integer>();
		
		// almost always want to use a list instead of an array in collections
		
		
	}

}
