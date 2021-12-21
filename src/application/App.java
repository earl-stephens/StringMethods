package application;

public class App {
	public static void main(String[] args) {
		
		String name = "Joe";
		
		//.equals is a method in the name String object
		if(name.equals("Joe")) {
			System.out.println("1. Name is Joe");
		}
		
		// Won't print because .equals is case sensitive
		if(name.equals("JOE")) {
			System.out.println("2. Name is Joe");
		}
		
		// .equalsIgnoreCase is case insensitive
		if(name.equalsIgnoreCase("JOE")) {
			System.out.println("3. Name is Joe");
		}
		
		// .length() is a method in the name String object
		System.out.printf("The length of '%s' is %d\n", name, name.length());
	}
}
