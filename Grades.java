import java.util.Scanner;
import java.util.Arrays;

public class Grades {    
  public static void main(String args[])   {
	int count = 0;
	float[] sum = new float [100]; 
	String[] am = new String [100]; 
	System.out.println("Insert ID and then name of course followed by garde. When done type end. If you wish to stop inserting students type ID 000000.");
	String line; 		
	String endOfInput = "000000";
	Scanner input = new Scanner(System.in);
	while(input.hasNext()) {                      			
		line = input.nextLine();
		if (line.equals(endOfInput)){ 
			return;
		}
		else {
			while (input.hasNext()){
				if (!(input.equals("end") || input.equals("End") || input.equals("END"))){
					am[count] = input.next();
					sum[count] = sum[count] + input.nextFloat();
					count++;
				}
			}
		}
	}
	for(int i=0; i<=count ; i++){
		Float mo = sum[i]/count;
		System.out.println( "The average grade of student with ID: " + am[i] + ", is: " + mo );
	}
  }
}
