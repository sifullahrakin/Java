//swap first and last digit of a number

package for_loop_exercise;
import java.util.*;

public class Exercise_9 {

	public static void main(String[] args) {
		int swappedNum, firstDigit, lastDigit, digits;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		
		lastDigit  = num % 10;

	    /* Find total number of digit - 1 */
	    digits     = (int)Math.log10(num); 

	    /* Find first digit */
	    firstDigit = (int)(num / Math.pow(10, digits)); 

	    swappedNum  = lastDigit;
	    swappedNum *= (int) Math.pow(10, digits);
	    swappedNum += num % ((int) Math.pow(10, digits));
	    swappedNum -= lastDigit;
	    swappedNum += firstDigit;
	    
	    System.out.print("Original number = "+num);
	    System.out.println("");
	    System.out.print("Number after swapping first and last digit: "+swappedNum);

	}

}
