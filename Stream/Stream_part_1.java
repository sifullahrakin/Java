package stream_package;
import java.util.*;
import java.util.stream.Collectors;

public class Stream_part_1 {

	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
		//in regular way
//		List<Integer> squaresList = new ArrayList<>();
//		for(Integer i: numbersList) {
//			squaresList.add(i*i);
//		}
		
		//Stream way
		List<Integer> squaresList = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println("List of squared numbers: "+squaresList);
		
		

	}

}
