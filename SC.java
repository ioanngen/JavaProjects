/**
* This class demonstrates the methods of the SC class.
* @author Ioannis Tzeneralis
* @version 1.0
*/
class SC {  
  private char q[]; // this array holds the queue  
  private int top, capacity; // the put and get indices  
  
  /**
	* Default constructor.
	* @param size The capacity
	*/
  SC(int size) {  
     q = new char[size];
     capacity = size;
     top = -1;
  }  
  /**
  * This method adds x to the q[], if q[] not full.
  * @param x The char q[]
  */
    public void push(char x)
    {
        if (full())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);
        }
 
        q[++top] = x;
    }
 
  /**
  * This method removes and returns the last data from q[], if q[] not empty.
  * @return q[top--];
  */
    public char pop()
    {
        // check for stack underflow
        if (empty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }

 
        // decrease stack size by 1 and (optionally) return the popped element
        return q[top--];
    }
 
    /**
    * This method returns the last data from q[], if q[] not empty.
    * @return 1;
    * @return q[top];
    */
    public char peek()
    {
        if (!empty()) {
            return q[top];
        }
        else {
            System.exit(1);
        }
        return 1;

    }
 
    /**
    * This method returns the size of q[].
    * @return top + 1;
    */
    public int size() {
        return top + 1;
    }
 
    /**
    * This method returns if q[] is empty.
    * @return top == -1; 
    */
    public Boolean empty()
    {
        return top == -1;               // or return size() == 0;
    }
 
    /**
    * This method returns if q[] is full.
    * @return top == capacity - 1;
    */
    public Boolean full() {
        return top == capacity - 1;     // or return size() == capacity;
    }
}
