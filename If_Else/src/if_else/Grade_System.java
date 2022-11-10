package if_else;
import java.util.*;

public class Grade_System {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Test Score: ");
		int test_score = sc.nextInt();
		
//		int test_score = 81;
		char grade;
		
		if(test_score>=90) {
			grade = 'A';
		}
		else if(test_score>=80) {
			grade = 'B';
		}
		else if(test_score>=70) {
			grade = 'C';
		}
		else if(test_score>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("Grade : " + grade);

	}

}
