//print all even numbers from 1 to n

package for_loop_exercise;
import java.util.*;

public class Exercise_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Limit: ");
		int n = sc.nextInt();
		
		System.out.print("Even numbers from 1 to "+n+" : ");
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}

	}

}
