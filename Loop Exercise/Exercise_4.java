//find sum of natural numbers from 1 to n

package for_loop_exercise;
import java.util.*;

public class Exercise_4 {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter limit: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum+= i;
		}
		System.out.print("Sum : "+sum);
		}

	}


