package operators;
import java.util.*;

public class Operator_Comparison {

	public static void main(String[] args) {
		String str = "How are you"; 
		
		//== equal 
		if (str.length()==9) {
			System.out.println("Good");
		}
		else {
			System.out.println("Wrong");
		}
		
		//not equal
		if (str.length()!=9) {
			System.out.println("Good");
		}
		else {
			System.out.println("Wrong");
		}
		
		//greater than
		if (str.length()>9) {
			System.out.println("Good");
		}
		else {
			System.out.println("Wrong");
		}
		
		//less than
		if (str.length()<9) {
			System.out.println("Good");
		}
		else {
			System.out.println("Wrong");
		}
		
		//greater than or equal to
		if (str.length()>=9) {
			System.out.println("Good");
		}
		else {
			System.out.println("Wrong");
		}
		
		//less than or equal to
		if (str.length()<=9) {
			System.out.println("Good");
		}
		else {
			System.out.println("Wrong");
		}
		

	}

}
