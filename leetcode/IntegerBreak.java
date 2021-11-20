package leetcode;

import java.util.*;





public class IntegerBreak {
	static int dp[];
	
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		dp=new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(solve(n));
		
	
		
		
		

	}
	static int solve(int n) {
		if(n==1 ||n==2 ||n==3)
		 return n;
		if(dp[n]!=-1)return dp[n];
		int max=0;
		for(int i=1;i<=n/2;i++) {
			max=Math.max(max, solve(i)*solve(n-i));
		}
	        return dp[n]= max;
	
		
	}
	
}
