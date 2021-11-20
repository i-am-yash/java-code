package leetcode;

import java.util.*;



public class wordBreak {
	static List<String>set;

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		
		set=new ArrayList<String>();
		set.add("leet");
		set.add("code");
		
		System.out.println(solve(s));
		
//		
// 10,5,2,6 k= 100
	}
	static boolean solve(String s) {
		 int n=s.length();
	        
	        boolean dp[]=new boolean[n+1];
	        dp[n]=true;
	       // Arrays.fill(dp,false);
	        for(int i=n-1;i>=0;i--){
	        	System.out.println(i);
	            for(String w:set){
	            		
	                if(i+w.length()<=n) {
	                	if(s.substring(i,i+w.length()).equals(w)) {
	                		dp[i]=dp[i+w.length()];
	                	}
	                	if(dp[i])break;
	                	System.out.println(i+" "+w);
	                }
	                
	            }
	        }
	        //System.out.print(Arrays.toString(dp));
	        return dp[0];
	
	}
}
