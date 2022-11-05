public class NonPrimitiveDataTypes {
    public static void main(String args[]) {
      
      String str = "test";
      System.out.println("String is: "+str);
      
      String str1 = new String("test-1");
      System.out.println("Another String is: "+str1);
      
      int arr[];
      arr = new int[2];
      arr[0] = 2;
      arr[1] = 3;

      System.out.println(arr); //print the footprint of memory address
      System.out.println(arr[0]);
    }
}