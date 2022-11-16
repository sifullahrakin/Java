//print alphabets from a to z

package for_loop_exercise;

public class Exercise_2 {

	public static void main(String[] args) {
//		A-Z
		System.out.println("Alphabet from A to Z : ");
		for(char i = 'A'; i<='Z'; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
//		a-z
		System.out.println("Alphabet from a to z : ");
		for(char i = 'a'; i<='z'; i++) {
			System.out.print(i+" ");
		}
	}

}
