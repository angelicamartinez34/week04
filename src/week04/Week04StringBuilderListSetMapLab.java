//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		
		//we would use a StringBuilder instead of a String when we want to change a string
		
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder

		StringBuilder numbers = new StringBuilder();
	
		for ( int i = 0; i < 10; i++) {
			if ( i != 9) {
			numbers.append(i + "-");
		
			} else {
			numbers.append(i);
			
			} 
		
		}
		System.out.println(numbers.toString());
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length

		List<String> str = new ArrayList<String>();
		str.add("Angelica");
		str.add("Miguel");
		str.add("Max");
		str.add("Pumpkin");
		
		for (String string : str) {
			System.out.println(string);
		}
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		
		System.out.println("----");

System.out.println(returnShortestString(str));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
System.out.println("----");
System.out.println(switchesElements(str));
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
System.out.println("----");
System.out.println(concatenatedString(str));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
System.out.println("----");
List<String> searchResult = originalListWithParameter(str, "a");
		System.out.println(searchResult);
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
System.out.println("----");
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<List<Integer>> sortedNumbers = numbersDivisibleBy(numbers1);
		
		for (List<Integer> list : sortedNumbers ) {
			for ( Integer number : list ) {
				System.out.println(number);
				
			}
			System.out.println("Next list ----");
		}
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
System.out.println("----");
List<Integer> lengthsList = lengthOfEachString(str);
System.out.println(lengthsList);
		
		// 9. Create a set of strings and add 5 values

Set<String> holidays = new HashSet<String>();
holidays.add("Halloween");
holidays.add("Thanksgiving");
holidays.add("Christmas");
holidays.add("New Years");
holidays.add("Valentine's Day");


		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
System.out.println("----");

Set<String> startsWith = stringsAndCharacter(holidays, 'H' );
System.out.println(startsWith);

		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
	System.out.println("----");
		
	List<String> stringList = returnsAsList(holidays);
		for ( String string : holidays) {
			System.out.println(string);
		}
		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
System.out.println("----");

Set<Integer> nums = new HashSet<>();
nums.add(1);
nums.add(13);
nums.add(24);
nums.add(37);
nums.add(66);
nums.add(82);
nums.add(144);


Set<Integer> evenSet = setOfOnlyEvenNumbers(nums);
System.out.println(evenSet);

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

Map<String, String> wordDefinition = new HashMap<String, String>();
wordDefinition.put("Summer", "the warmest season of the year, in the northern hemisphere from June to August and in the southern hemisphere from December to February");
wordDefinition.put("Winter", "the coldest season of the year, in the northern hemisphere from December to February and in the southern hemisphere from June to August");
wordDefinition.put("Spring", "the season after winter and before summer, in which vegetation begins to appear, in the northern hemisphere from March to May and in the southern hemisphere from September to November");

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
System.out.println("----");
		
String value = lookUpValue(wordDefinition, "Spring");
System.out.println(value);
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		
System.out.println("----");

Map<Character, Integer> counts = stringsThatStartWithGivenCharacter(str);

System.out.println(counts);

	}
	
	
	// Method 15:
	
	public static Map<Character, Integer> stringsThatStartWithGivenCharacter(List<String> str) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		for ( String string : str ) {
			char m = string.charAt(0);
			if (results.get(m) == null) {
				results.put(m, 1);
			} else {
				results.put(m, results.get(m) + 1);
				
			}
		}
		return results;
	}
	
	
	// Method 14:
	
	public static String lookUpValue(Map<String, String> map, String string) {
		for ( String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
				
			}
		}
		return "";
			
	}

	
	// Method 12:
	
public static Set<Integer> setOfOnlyEvenNumbers(Set<Integer> nums ) {
	Set<Integer> evenNums = new HashSet<>();
	for ( int num : nums) {
		if ( num % 2 == 0) {
			evenNums.add(num);
			
		}
	}
	return evenNums;
}
	
	
	// Method 11:
	
public static List<String> returnsAsList(Set<String> holidays) {
	List<String> stringList = new ArrayList<>(holidays);
	return stringList;
}
	

	// Method 10:
	
	public static Set<String> stringsAndCharacter(Set<String> holidays, char H) {
		Set<String> result = new HashSet<>();
		for (String string : holidays) {
			if ( string.charAt(0) == H ) {
				result.add(string);
			}
		}
		return result;
		
	}

	
	// Method 8:
	
	public static List<Integer> lengthOfEachString(List<String> str) {
		List<Integer> lengths = new ArrayList<>();
		
		for ( String string : str) {
			int length = string.length();
			lengths.add(length);
			
		}
		return lengths;
	}
	

	
	// Method 7:
	
	public static List<List<Integer>> numbersDivisibleBy(List<Integer> list) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add( new ArrayList<Integer>());
		results.add( new ArrayList<Integer>());
		results.add( new ArrayList<Integer>());
		results.add( new ArrayList<Integer>());
		
		for ( Integer number : list) {
			if ( number % 2 == 0) {
				results.get(0).add(number);
				
			}
			if ( number % 3 == 0) {
				results.get(1).add(number);
				
			}
			if ( number % 5 == 0) {
				results.get(2).add(number);
				
			}
			if ( number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
				
			}
		}
	return results;
	
	}

	

	
	// Method 6:
	
	public static List<String> originalListWithParameter(List<String> str, String october) {
		List<String> result = new ArrayList<String>();
		for ( String string : str) {
			if (string.contains(october)) {
				result.add(string);
			}
		}
		return result;
		
	}

	
	// Method 5:
	
	public static String concatenatedString(List<String> str) {
		StringBuilder result = new StringBuilder();
		for ( String string : str) {
			result.append(string + ", ");
		}
		return result.toString();
		
	}
	
	
	// Method 4:

	public static List<String> switchesElements(List<String> list) {
	String temp = list.get(0);
	list.set(0, list.get(list.size() - 1));
	list.set(list.size() - 1, temp);
	return list;
		
		
	}
	

	// Method 3:
	
	public static String returnShortestString( List<String> str) {
		String shortest = str.get(0);
		for ( String string : str) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
		}
		 return shortest;
		
	}

}
