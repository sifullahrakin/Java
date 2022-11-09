package operators;

public class Operators_Unary {

	public static void main(String[] args) {
		
		int result = +1;
		System.out.println(result); //result=1
		
		result--;
		System.out.println(result); //result=0
		
		result++;
		System.out.println(result); //result=1
		
		result = -result;
		System.out.println(result); //result=-1
		
		boolean success = false;
		System.out.println(success); //false
		System.out.println(!success); //true
		
	}

}
