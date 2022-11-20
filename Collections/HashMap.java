import java.util.*;
public class HashMap {
    public static void main(String args[]) {
     HashMap<String>hashMap = new HashMapProgram<String>();
     
     hashMap.add("C");
     hashMap.add("B");
     hashMap.add("A");
     
     System.out.println("Size of map is: "+hashMap.size());
     System.out.println(hashMap);
     
     if (hashMap.containsKey("a")){
         Integer a = hashMap.get("a");
         System.out.println("Value for key"+"\"a\" is: "+a);
     }
     
     for(String key:hashMap.keySet()){
         System.out.println("Key: "+key+", Value: "+hashMap.get(key));

     }
     
     for(Entry<String, Integer>entry: hashMap.entrySet()){
         Ssytem.out.println("Key: "+ entry.getKey()+", Value: "+entry.getValue());
     }
    }
}