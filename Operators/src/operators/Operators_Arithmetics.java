package operators;

public class Operators_Arithmetics {

	public static void main(String[] args) {
		int result = 5+5;
		System.out.println("5+5 = "+result);
		int original_result = result;
		
		result = result-1;
		System.out.println(original_result+" -1 = "+result);
		original_result = result;
		
		result = result*2;
		System.out.println(original_result+" * 2 = "+result);
		original_result = result;
		
		result = result/2;
		System.out.println(original_result+" / 2 = "+result);
		original_result = result;
		
		result = result+8;
		System.out.println(original_result+" + 8 = "+result);
		original_result = result;
		
		result = result%7;
		System.out.println(original_result+" % 7 = "+result); 


	}

}
