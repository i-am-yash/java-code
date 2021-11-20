package leetcode;

import java.util.*;



public class UniqueBinarySearchTree {
	static int dp[];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		dp=new int [n+1];
		System.out.println(solve(n));
		
		

	}
	static int solve(int n) {
		if(n==1 ||n==0)return  dp[n]=1;
		if(dp[n]!=0)return dp[n];
		int total=0;
		for(int i=1;i<=n;i++) {
			int left =i-1;
			int right=n-1-left;
			 total+=solve(left)*solve(right);
		}
		return dp[n]=total;
		
		
		
	}
	


	
	
}
