package day17.hw;
import java.util.*;
public class StackDemo {
	public static void main(String[] args)
    {
 
        // Default initialization of Stack
        Stack stack1 = new Stack();
 
        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<String>();
 
        // pushing the elements
        stack1.push("4");
        stack1.push("All");
        stack1.push("Anuj");
 
        stack2.push("Anuj");
        stack2.push("For");
        stack2.push("Movie");
 
          // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
    }
}