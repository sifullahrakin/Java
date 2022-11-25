package stream_package;
import java.util.*;
import java.util.stream.Collectors;

public class Stream_Filtering {

	public static void main(String[] args) {
		List<String>languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("Javascript");
		
		//Regular way
//		List<String> filterResult = new ArrayList<>();
//		for(String s: filterResult) {
//			if(s.startsWith("P")) {
//				filterResult.add(s);
//			}
//		}
		
		//Stream way
		List<String>filterResult = languages.stream().filter(s->s.startsWith("P")).collect(Collectors.toList());
		System.out.println("Languages starting with 'P': "+filterResult);
		

	}

}
