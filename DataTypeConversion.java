public class DataTypeConversion {
    public static void main(String args[]) {
      int a = 100;
      System.out.println("Int represents: "+a);
      
      long b = a;
      System.out.println("Long represents: "+b);
      
      float c = b;
      System.out.println("Float represents: "+c);
      
    //   incompatible types: possible lossy conversion from float to byte
    //   byte d = c;
    //   System.out.println("Byte represents: "+d);
    }
}