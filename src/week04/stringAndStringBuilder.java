package week04;

public class stringAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String firstName = "Sally";
		String lastName = "Martinez";
		System.out.println(firstName + " " + lastName);
		
		
		
		String triplehi = multiplyString("hi", 3);
		System.out.println(triplehi);
		
		firstName = firstName.concat(lastName);
		System.out.println(firstName);
		//System.out.println(firstName.concat(lastName));
		
		
		StringBuilder fullName = new StringBuilder("Aliyah");
		fullName.append(" Chavez");
		System.out.println(fullName.toString());
		
		
		// you want to use a String when you have a constant or a value that is not going to change
		// you use  StringBuilder when you want to add to a string or change it
		
		System.out.println(fullName.charAt(5));
	//	System.out.println(fullName.deleteCharAt(6));
	//	System.out.println(fullName.delete(2, 5));
		System.out.println(fullName.indexOf("Cha"));
		System.out.println(fullName.length());
		System.out.println(fullName.replace(7, 13, "Martinez"));
		System.out.println(fullName.reverse());
	}

//	public static String multiplyString(String str, int num) {
	//	String result = "";
	//	for ( int i = 0; i < num; i++) {
	//		result += str;
	//	}
	//	return result;
	//}
	
	// same method above but using StringBuilder
	
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for ( int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}
	
	
	
	
	
	
	
	
	
	
}
