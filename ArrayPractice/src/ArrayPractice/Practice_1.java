//Take 10 integer inputs from user and store them in an array and print them on screen.
package ArrayPractice;
import java.util.*;

public class Practice_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Print the value of arr["+i+"]");
			arr[i] = s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("The value of arr["+i+"] is " +arr[i]);
		}

	}

}
