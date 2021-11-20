package leetcode;

import java.util.*;



public class FindAllAnagrams {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
		int phash[]=new int[26];
		int shash[]=new int[26];		
		ArrayList<Integer>ans=new ArrayList<Integer>();
		 if(s.length()<p.length()) {
				System.out.println( ans); //retrun ans here
			 }
		for(int i=0;i<p.length();i++) {
			phash[p.charAt(i)-'a']++;
			shash[s.charAt(i)-'a']++;
		}
		//System.out.println(Arrays.toString(count_arr));
		int left=0;
		int right=p.length()-1;
		
		while(right<s.length()) {
//			if(phash.equals(shash)) {
//				ans.add(left);
//			}
			if(Arrays.compare(phash, shash)==0)ans.add(left);
			right++;
			if(right!=s.length()) {
				shash[s.charAt(right)-'a']++;
			}
			shash[s.charAt(left)-'a']--;
			left++;
		}
		
		System.out.println(ans);
		
		

	}
	


	
	
}
