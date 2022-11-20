import java.util.*;
public class HashSet {
    public static void main(String args[]) {
     HashSet<String>hashSet = new HashSet<String>();
     
     hashSet.add("A");
     hashSet.add("B");
     boolean r1 = hashSet.add("C");
     System.out.println(r1);
     boolean r2 = hashSet.add("C");
     System.out.println(r2);
     
     System.out.println(hashSet);
     
     System.out.println("Set contains C or not?"+ hashSet.contains("C"));
     
     hashSet.remove("A");
     System.out.println("Set after removing A: "+hashSet);
     
     for(String item: hashSet){
         System.out.println(item);
     }
    }
}