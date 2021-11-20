package introduction;
import java.util.*;
// grouping Anagrams.
public class ImpQ6 {

	public static void main(String[] args) {
		String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		Map<String,List<String>>  map= new HashMap<>();
		for(String s:strs) {
			char charArray[] =s.toCharArray();
			Arrays.sort(charArray);
			String sorted = new String(charArray);
			if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
			}
			map.get(sorted).add(s);
			
		}
		System.out.println( new LinkedList<>(map.values()));
		
		
		

	}

}
