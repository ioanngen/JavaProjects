import java.io.FileWriter;  
import java.io.IOException; 

/**
* This class demonstrates the methods of the Factorial class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class Factorial {  
  /**
  * This is the main method.
  * @param args Unused.
  */
  public static void main(String args[]) {  
	// Repeat for every argument
    for (String s: args) {
	   if (Long.parseLong(s)<0){
			// if negative argument
			System.out.println("Error: Negative Value: " + s);
	   }else{
			System.out.println(s + "!: " + factor(Long.parseLong(s)));
	   }
    }
    
    try {
	  // Write to file named "results.txt"
      FileWriter results = new FileWriter("results.txt");
      for (String s: args) {
	   if (Long.parseLong(s)>=0){
			results.write(s + "!: " + factor(Long.parseLong(s)) + "\n");
	   }
	  }
      results.close();
    } catch (IOException e) {
      System.out.println("An error occurred while creating the file.");
      e.printStackTrace();
    }
  }
  /**
  * This method returns the factor repeatedly.
  * @param n The number to find factor
  * @return 1
  * @return n * factor(n - 1);
  */
  public static long factor (long n){
	  if (n <= 1)
         return 1;
      else
	     return n * factor(n - 1);
  }
  
}
