package slidingWindow;

import java.util.*;



public class LongestSubstringWithkUniqueCharacters {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		System.out.println(solve(s,k));

	}
	static int solve(String s,int k) {
		HashMap<Character,Integer>map= new HashMap<>();
		int j=0;
		int i=0;
		int max=0;
		while(j<s.length()) {
			
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
			System.out.println(map+" "+i+" " +j);
			int unique=map.size();
			if(unique<k) {
				j++;
			}else if(unique==k) {
				max=Math.max(max, j-i+1);
//				map.remove(s.charAt(i));
//				i++;
				j++;
			}else {
				
				if(map.get(s.charAt(i))!=null) {
				map.put(s.charAt(i), map.get(s.charAt(i))-1);
				if(map.get(s.charAt(i))==0)
				map.remove(s.charAt(i));
				// becoz in this case j does not increase and in above code we are adding freq at j again without getting a new character
				map.put(s.charAt(j), map.get(s.charAt(j))-1);
				}
				i++;
			}
		}
		return max;
	}
	


	
	
}
