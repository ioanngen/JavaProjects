import java.util.Scanner;

/**
* This class demonstrates the methods of the Palindrome class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class Palindrome {  
	
	/**
	* This is the main method.
	* @param args Unused.
	*/
	public static void main(String args[]) {
		
		System.out.print("Enter any string:");
		
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		
		SC stack = new SC(inputString.length());

		for (int i = 0; i < inputString.length(); i++) {
			stack.push(inputString.charAt(i));
		}

		String reverseString; // Initialize String

		while (!stack.empty()) {
			reverseString = reverseString+stack.pop();
		}

		if (inputString.equals(reverseString))
			System.out.println("The input String is a palindrome.");
		else 
			System.out.println("The input String is not a palindrome.");
	}
}
