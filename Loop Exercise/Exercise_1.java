//print all natural numbers from 1 to n

package for_loop_exercise;
import java.util.*;

public class Exercise_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter any number: ");
	      int n = sc.nextInt();
	      
	      System.out.println("Natural numbers from 1 to "+n+" : ");
	      
	      for(int i=1; i<=n; i++){
	          System.out.print(i+" ");
	      }

	}

}
