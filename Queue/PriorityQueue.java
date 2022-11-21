import java.util.*;
public class PriorityQueue {
    public static void main(String args[]) {
     Queue<String> queue = new PriorityQueue<>();
     
     queue.add("Bangladesh");
     queue.add("India");
     queue.add("Pakistan");

     System.out.println("Original Queue: "+queue);
     
     queue.remove();
     System.out.println("Queue after removing the head element: "+queue);
     
     String head = queue.peek();
     System.out.println("Head of the queue: "+head);
     
     head = queue.poll();
     System.out.println("Removed head: "+head);
     
     System.out.println("Queue now looks like this: "+queue);
    }
}