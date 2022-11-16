//find sum of odd numbers from 1 to n

package for_loop_exercise;
import java.util.*;

public class Exercise_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}

	}

}
