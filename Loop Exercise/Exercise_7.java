//count number of digits in an integer

package for_loop_exercise;
import java.util.*;

public class Exercise_7 {

	public static void main(String[] args) {
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		do {
			count++;
			num /= 10;
		}while(num != 0);
		
		System.out.print(count);

	}

}
