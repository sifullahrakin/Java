package array_2d;

public class Array2D {

	public static void main(String[] args) {
		
		int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
		
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
//		we can find a value of 2d array by it's row and col number 
//		System.out.println(arr[0][2]);

	}

}
