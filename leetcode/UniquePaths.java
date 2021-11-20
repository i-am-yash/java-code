package leetcode;

import java.util.*;


public class UniquePaths {

	static int dp[][];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int m=23;
		int n=12;
		dp= new int[m+1][n+1];
		for(int i=0;i<=m;i++ )
			for(int j=0;j<=n;j++)dp[i][j]=-1;
		System.out.println(solve(0,0,m,n));


	}
	
	static int solve(int i,int j,int m,int n) {
		if(dp[i][j]!=-1)return dp[i][j];
		if(i==m-1 || j==n-1) {
			dp[i][j]=1;
			return 1;
		}
		dp[i][j]=solve(i+1,j,m,n)+solve(i,j+1,m,n);
		
		
		
		
		return dp[i][j];
		
	}
	
	

	
	
}
