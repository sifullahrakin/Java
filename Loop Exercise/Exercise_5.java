//find sum of odd numbers from 1 to n

package for_loop_exercise;
import java.util.*;

public class Exercise_5 {

	public static void main(String[] args) {
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Limit: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) {
				sum += i;
			}
		}
		System.out.print("Sum = "+sum);

	}

}
