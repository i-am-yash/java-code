package leetcode;

import java.util.*;



public class MinimumWindowSubstring {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
		//int k=sc.nextInt();
		System.out.println(solve(s,p));

	}
	static String solve(String s,String p) {
		HashMap<Character,Integer>map=new HashMap<Character, Integer>();

		for(char c:p.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int l=0;
		int r=0;
			int li=0;
			int ri=0;
		int min=Integer.MAX_VALUE;
		int need =map.size();
		while(r<s.length()) {
			char c=s.charAt(r);
			if(map.get(c)!=null) {
				map.put(c,map.get(c)-1);
				if(map.get(c)==0)need--;
			}
			r++;
			while(need==0) {
				if(r-l<min) {
					min=r-l;
					li=l;
					ri=r;
				}
				//rremove the extra character by incrementing l.
				
				//min=Math.min(min, r-l);
				if(map.get(s.charAt(l))==null) {
					l++;
				}else {
					map.put(s.charAt(l), map.get(s.charAt(l))+1);
					if(map.get(s.charAt(l))>0) {
						need++;
					}
					l++;
				}
			}
		}
		
		return s.substring(li,ri);
	}
	


	
	
}
