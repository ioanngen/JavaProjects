import java.io.*;
import java.util.*;
import java.io.IOException;

public class Stats {
	public static void main(String[] args) throws IOException {
		// Check if the user provide the program the right number of arguments
		if (args.length != 2) {
			System.err.println("Please provide two file names. ");
			System.exit(1);
		}
		FileReader file = new FileReader(args[0]);
		// declare output stream
		PrintWriter outs = null;
		// file name
		String fileOut = args[1];
		// Using BufferedReader to count the lines of the input file
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		
		int[] integers = new int [lines]; 
		// Creating an array with the number of lines of the first file
		int i=0;
		int s=0;
		try {
			Scanner input = new Scanner(file);
			while(input.hasNext())
			{
				integers[i] = input.nextInt();
				s = s + integers[i];
				i++;
			}
			input.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		java.util.Arrays.sort(integers);
		try {
			// associate output stream with the actual file -
			// file open (truncate an existing file)
			outs = new PrintWriter(fileOut);
			// append data to an existing file  
			// outs = new PrintWriter(new FileOutputStream(file, true));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file: " + file );
			System.exit(0);
		}	
		for (int count = 0; count < i; count++) {
			// write line to file
			outs.println(integers[count]);
		}
		// close file
		outs.close();
		int min = integers[0];
		int max = integers[i-1];
		float mo = s/(i+1);
		System.err.println("The minimum number of the " + args[0] + ", is " + min + ", and the maximum is " + max + ". There was " + (i+1) + " numbers and the average of them is " + mo);
		int middle = 0;
		if (i%2==0) { // if the number of 
			middle = integers[(i+1)/2];
		}else {
			middle = integers[i/2];
		}
		System.err.println("The median or 50th percentile of the file " + args[0] + ", is " + middle + ". ");
    }	
}
