package leetcode;

import java.util.*;





public class superUglyNumber {
static HashMap<String,Boolean>dp;

	
	public static void main(String[] args) {
		
		int a[]= {2,7,13,19};
		int n=3;
		System.out.println(solve(a,n));
		
		
		

	}
	static int solve(int a[],int n) {
		int index[]= new int [a.length];
		int dp[]= new int [n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++) {
			int min=Integer.MAX_VALUE;
			
			for(int j=0;j<a.length;j++) {
				if(a[j]*dp[index[j]]<min) {
					min=a[j]*dp[index[j]];
					
				}
			}
			for(int j=0;j<a.length;j++) {
				if(a[j]*dp[index[j]]==min) {
					index[j]++;
				}
			}
			dp[i]=min;
			
		}
		System.out.println(Arrays.toString(dp));
		return dp[n-1];
	}
	

	 
	
	 
	
}
