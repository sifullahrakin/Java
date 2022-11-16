//find first and last digit of a number

package for_loop_exercise;
import java.util.*;

public class Exercise_8 {
	public static void main(String[] args) {
		int firstDigit, lastDigit, digits;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		lastDigit = num % 10;     

	    /* Total number of digits - 1 */
	    digits = (int)Math.log10(num); 

	    /* Find first digit */
	    firstDigit = (int)(num / Math.pow(10, digits));
	    
	    int sum = firstDigit + lastDigit;

	    System.out.print("First digit = "+ firstDigit);
	    System.out.println("");
	    System.out.print("Last digit = "+ lastDigit);
	    System.out.println("");
	    System.out.println("Sum of First and Last digit = "+sum);

	}

}
