import java.util.Scanner;

public class Calculator {    
  static void menu(){
	// This is a function that prints the menu
	System.out.println("----------- Calculator Menu -----------");
	System.out.println("------- For addition type add ---------");
	System.out.println("------- For division type div ---------");
	System.out.println("------- For instructions type help ----");
	System.out.println("------- To terminate type exit --------");
	System.out.print("Your selection: ");
  }
  
  public static void main(String args[])   {
	menu();// Print Menu
	Scanner choice = new Scanner(System.in);
	int i = 0; // count numbers for add
	double sum = 0; // all numbers together for add
	String anw;
	while(choice.hasNext()){
		anw = choice.next();
		if ( anw.matches("help") || anw.matches("Help") || anw.matches("HELP") ) {
			System.out.print("In addition(add), you must enter inline with space or separated as many values you wish. When finished inserting values type end, so the program will be notified and procced to the result. ");
			System.out.print("In division(div), you must enter two(2) values inline with space or separated. When you're done inserting values press Enter on your keyboard, so the program will be notified and procced to the result. ");
		}else if ( anw.matches("add") || anw.matches("Add") || anw.matches("ADD") ) {
			System.out.println("Type the numbers that you want to sum in row splitted with space, when you're done typing type end.");
			Scanner add = new Scanner(System.in);
			while(add.hasNext()) {
				if(add.hasNextDouble()) {
					sum = sum + add.nextDouble(); // add to sum the nuw number
					i++;
				}
				else {
					String num = add.next();
					if(num.equals("end") || num.equals("End") || num.equals("END")) break;
					else {
						System.out.println("Data format error. Try again by inserting only numbers: ");
					}
				}
			}
			System.out.println("You have entered " + i + " numbers and the final result is " + sum);
		}else if ( anw.matches("div") || anw.matches("Div") || anw.matches("DIV") ) {
			System.out.println("Enter the two values: ");
			Scanner div = new Scanner(System.in);
			double div1=0; // first number for division
			double div2=0; // second number for division
				if (div.hasNextDouble()){ // check if next input in double
					div1 = div.nextDouble();
				}else{
					do{
						System.out.println("You have entered a wrong value number. Please try again: ");
						if (div.hasNextDouble()){
							div1 = div.nextDouble(); // input from keyboard until is double
						}
					}while(div.hasNextDouble());
				}
			
			if (div.hasNextDouble()){
					div2 = div.nextDouble();
				}else{
					do{
						System.out.println("You have entered a wrong value number. Please try again: ");
						if (div.hasNextDouble()){
							div2 = div.nextDouble(); // input from keyboard until is double
						}
					}while(div.hasNextDouble());
				}
			System.out.println("You have entered " + div1 + ", and " + div2 + ". The quotient is: " + div1/div2 + ", and the remainder is: " + div1%div2);
		}else if ( anw.matches("exit") || anw.matches("EXIT") || anw.matches("Exit") ) {
			System.out.println("Now exiting...");
			break;
		}else {
			System.out.println("You have entered wrong input. Please read the menu or type help and try again. ");
		}
		menu();
	}
	choice.close();
  }
}
