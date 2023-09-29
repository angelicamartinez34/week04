package week04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DifferentCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a list is a type of collection
		// we can't instantiate a collection itself
		
		//  List
		// - allows duplicates
		// - keeps elements ordered by index
		// - allows for null values meaning no value
		// - common implementations : ArrayList, LinkedList, Vector
		// USE A LIST WHEN YOU HAVE DUPLICATES AND WANT EVERYTHING IN THE ORDER YOU ENTER IT
		
		List<String> students = new ArrayList<String>();
		students.add("Liz");
		students.add("Rob");
		students.add("Daniel");
		students.add("Stacy");
		students.add("Rob");
		students.add(null);
		
		for ( String student : students) {
			System.out.println(student);
		}
		System.out.println("-----");
		
		System.out.println(students.get(3));
		
		System.out.println("-----");
		
		
		//  Set
		// - does not allow duplicates
		// - unordered - meaning does not print out the same order put in
		// - allows null value , but can only have one because does not allow duplicates
		// - common implementations : HashSet, LinkedHashSet, TreeSet
		// USE A SET WHEN YOU DON'T HAVE DUPLICATES AND DON'T CARE ABOUT ORDER
		
		Set<String> states = new HashSet<String>();
		states.add("New Mexico");
		states.add("California");
		states.add("Arizona");
		states.add("New Mexico");
		states.add("Idaho");
		states.add(null);
		
		System.out.println(states.size());
		System.out.println("-----");
		System.out.println(states.contains("Idaho"));
		System.out.println(states.contains("Alaska"));
		System.out.println("-----");
		
		if (states.contains("Arizona")) {
			states.remove("Arizona");
		}
		
		//states.remove("Arizona");
		
		for ( String state : states) {
			System.out.println(state);
		}
		
		
		//  Map
		// Map<K, V>   K is the key and V is the value
		// - key value pairs (dictionary) 
		// example from dictionary we have a word(key) and the definition(value)
		// - uses .put allows us to add key and value - does not use .add
		// - values can be duplicate, but not keys
		// - common implementations : HashMap, LinkedHaspMap, TreeMap, Hashtable
		// USE A MAP WHEN YOU HAVE VALUES ASSOCIATED WITH A SPECIFIC KEY (KEY VALUE PAIRS)
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Billy");
		racerPlacements.put(2, "Sara");
		racerPlacements.put(3, "Rob");
		
		racerPlacements.remove(2);
		
		System.out.println("------");
		System.out.println(racerPlacements.get(1));
		System.out.println("------");
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key : racerKeys) {
		//	System.out.println(key);
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		System.out.println("-----");
		Collection<String> racers = racerPlacements.values();
		for ( String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Cat", "a small domesticated carnivorous mammal with soft fur, a short snout, and retractable claws");
		dictionary.put("Basketball", "a game played between two teams of five players in which goals are scored by throwing a ball through a netted hoop fixed above each end of the court.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
