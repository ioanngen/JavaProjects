/**
* This class demonstrates the methods of the SCTest class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class SCTest {  
  /**
  * This is the main method.
  * @param args Unused.
  */
  public static void main(String args[]) {  
	  SC test = new SC(3);
 
        test.push('5');      // inserting in the stack
        test.push('1');      // inserting in the stack
        test.push('3');      // inserting in the stack
 
        System.out.println("The top element is " + test.peek());
        System.out.println("The stack size is " + test.size());
        
        test.pop();        // removing the top element
        test.pop();        // removing the top element
        
        System.out.println("The top element is " + test.peek());
        System.out.println("The stack size is " + test.size());
 
        test.pop();        // removing the top element
 
        // check if the stack is empty
        if (test.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
	}
}
