package leetcode;

import java.util.Scanner;


public class EditDistance {

	static int dp[][];
	static int min;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String w=sc.next();
		int m=s.length();
		int n=w.length();
		dp= new int[m+1][n+1];
		for(int i=0;i<=m;i++ )
			for(int j=0;j<=n;j++)dp[i][j]=-1;
//		min=Integer.MAX_VALUE;
		
		System.out.println(solve(s,w,0,0));


	}
	
	static int solve(String s,String w,int i,int j) {
		if(dp[i][j]!=-1)return dp[i][j];
		if(i==s.length()) {
			return dp[i][j]= w.length()-j;
		}
		if(j==w.length()) {
			return dp[i][j]=s.length()-i;
		}
		if(s.charAt(i)==w.charAt(j)) {
			return dp[i][j]=solve(s,w,i+1,j+1);
		}
		else {
			min=Math.min(solve(s,w,i+1,j+1), solve(s,w,i,j+1));
			min=1+Math.min(min, solve(s,w,i+1,j));
		}
		return dp[i][j]=min;
	}
	
	

	
	
}
