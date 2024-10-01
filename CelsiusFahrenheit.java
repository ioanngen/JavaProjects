import java.util.Scanner;

public class CelsiusFahrenheit {    
  public static void main(String args[]) { 
		double c, f; // temporature variables
		int anw; // argument variable
		Scanner temp = new Scanner(System.in);
		anw = Integer.parseInt(args[0]);
		if (anw == 0) {	
			System.out.println("Insert the Fahrenheit temperature to convert it to Celsius:");
			f = temp.nextDouble(); // Fahrenheit input
			c = (f-32)*(5/9); // transformation to Celsius
			System.out.println(f + " Fahrenheit is " + c + " Celsius.");
		}
		else if (anw == 1) {
			System.out.println("Insert the Celsius temperature to convert it to Fahrenheit:");
			c = temp.nextDouble(); // celsius input
			f = c * (9/5) + 32; // transformation to Fahrenheit
			System.out.println(c + " Celsius is " + f + " Fahrenheit.");
		}
		else { 
			// wrong argument case
			System.out.println("Wrong insert, please enter 0 or 1 to convert to Celsius or Fahrenheit, and try again!"); 
		}
	} 
}
