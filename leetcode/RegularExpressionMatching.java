package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class RegularExpressionMatching{

	static HashMap<String,Boolean> map;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	//n steps
		//he can climp 1 or 2 steps at a timr
		
		//how many ways to climb at top.
		String s=sc.next();
		String p=sc.next();
		map= new HashMap<String, Boolean>();
		System.out.println(check(s,p,0,0));
		

	}
	static boolean check(String s,String p,int i,int j) {
		String key=Integer.toString(i)+Integer.toString(j);
		if(map.get(key)!=null)return map.get(key);
		
		if(i>=s.length() && j>=p.length())return true;
		if(j>=p.length())return false;
		boolean match= ( ( i<s.length() ) && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.') );
		if(j+1<p.length() && p.charAt(j+1)=='*') {
			 map.put(key,   (check(s,p,i,j+2) || (match && check(s,p,i+1,j)) ) );
			 return map.get(key);
		}
		if(match) {
			map.put(key,check(s,p,i+1,j+1) ) ;
			return map.get(key);
		}
		else {
			  map.put(key, false) ;
			  return map.get(key);
		}
		
	//return false;
	
	
	
	}
	
}

