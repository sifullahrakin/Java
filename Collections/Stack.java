import java.util.*;

public class Stack {
    public static void main(String args[]) {
      Stack<String> stack = new Stack<>();
      
      stack.push("America");
      stack.push("Germany");
      stack.push("Bangladesh");

      System.out.println("Original Stack: "+stack);
      
      String poppedElement = stack.pop();
      System.out.println("Popped element: "+poppedElement);
      
      System.out.println("Now the stack looks like: "+stack);
      
      String peekedElement = stack.peek();
      System.out.println("Top element: "+peekedElement);
      
      System.out.println("Now the stack looks like: "+stack);
    }
}