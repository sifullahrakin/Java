import java.util.*;

public class TreeMap {
    public static void main(String args[]) {
      TreeMap<String, Integer> treeMap = new TreeMap<>();
      
      treeMap.put("B",2);
      treeMap.put("C",1);
      treeMap.put("A",3);

      System.out.println(treeMap);
    }
}