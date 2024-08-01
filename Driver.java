/**
   A driver that demonstrates the class LinkedStack.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class Driver 
{
	public static void main(String[] args) 
	{
		System.out.println("Create a stack: ");
      //myStack is a reference variable with type StackInterface, this means that we can only call the methods in the 
      //StackInterface on myStack variable
		StackInterface<String> myStack = new LinkedStack<>();//creates an object of type Linkedstack 
		System.out.println("isEmpty() returns " + myStack.isEmpty()); //if isEmpty works => T
		
		System.out.println("\nAdd to stack to get\nJoe Jane Jill Jess Jim");
		myStack.push("Jim");//Jim
		myStack.push("Jess");// Jess Jim
		myStack.push("Jill");// Jill Jess Jim
		myStack.push("Jane");//Jane Jill Jess Jim
		myStack.push("Joe");//Joe Jane Jill Jess Jim

		System.out.println("\nisEmpty() returns " + myStack.isEmpty());//F

		System.out.println("\nTesting peek and pop:");
		while (!myStack.isEmpty())
		{
			String top = myStack.peek();//call peek to return the data in the topNode to top variable
			System.out.println("\n" + top + " is at the top of the stack.");//print the value of top
			
			top = myStack.pop();//delete the first node
			System.out.println(top + " is removed from the stack."); //see that the node that has been removed is 
         //the same as was peeked
		} // end while

		System.out.print("\nThe stack should be empty: ");
		System.out.println("isEmpty() returns " + myStack.isEmpty());//T

		System.out.println("\nAdd to stack to get\n" +
		                   "Jim Jess Joe\n");
		myStack.push("Joe");
		myStack.push("Jess");
		myStack.push("Jim");//Jim Jess Joe
		
		System.out.println("\nTesting clear:");
		myStack.clear();//makes the topNode = null
			
		System.out.println("The stack should be empty: ");
		System.out.println("\nisEmpty() returns " + myStack.isEmpty());//T

		System.out.println("\n myStack.peek() returns ");
      System.out.println(myStack.peek()); //Exception because stack is empty
		System.out.println("\n myStack.pop()  returns "); //Exception because stack is empty
      System.out.println(myStack.pop());
	} // end testStackOperations
}  // end Driver

/*
 Create a stack:
 isEmpty() returns true
 
 Add to stack to get
 Joe Jane Jill Jess Jim
 
 isEmpty() returns false
 
 Testing peek and pop:
 
 Joe is at the top of the stack.
 Joe is removed from the stack.
 
 Jane is at the top of the stack.
 Jane is removed from the stack.
 
 Jill is at the top of the stack.
 Jill is removed from the stack.
 
 Jess is at the top of the stack.
 Jess is removed from the stack.
 
 Jim is at the top of the stack.
 Jim is removed from the stack.
 
 The stack should be empty: isEmpty() returns true
 
 Add to stack to get
 Jim Jess Joe
 
 
 Testing clear:
 The stack should be empty:
 
 isEmpty() returns true
 
 myStack.peek() returns
 Exception in thread "main" java.util.EmptyStackException
	at LinkedStack.peek(LinkedStack.java:28)
	at Driver.testStackOperations(Driver.java:58)
	at Driver.main(Driver.java:12)
   
     */
