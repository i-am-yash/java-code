package leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class LongestCommonSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s="pwewwew";
		HashSet<Character>set= new HashSet<>();
		int i=0,j=0;
		int max=0;
		while(j<s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				max=Math.max(max, set.size());
				j++;
			}else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		System.out.println(max);
	}

}
