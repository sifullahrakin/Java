package stream_package;
import java.util.*;
import java.util.stream.Collectors;

public class Stream_Part_2 {

	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
		//Hashset in regular way
//		Set<Integer> squareSet = new HashSet<>();
//		for(Integer i: numbersList) {
//			squareSet.add(i*i);
//		}
		
		//Stream way
		Set<Integer> squareSet = numbersList.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println("Set of squared numbers: "+squareSet);

	}

}
