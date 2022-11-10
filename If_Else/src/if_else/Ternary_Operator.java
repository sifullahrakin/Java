package if_else;

public class Ternary_Operator {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result;
		
//		in ternary operator condition ? if part : else part
//		in ternary we can write only one statement
		
		result = a < b ? a : b;
		
//		if (a<b) {
//			result = a;
//		}
//		else {
//			result = b;
//		}
		
		System.out.println(result);

	}

}
