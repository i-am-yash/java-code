package dp;

import java.util.Scanner;

public class LongestPalindromicSubsequence {
static int dp[][];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
	//	System.out.println(a.length()+"lenggth");
		String b="";
		int m=a.length();
		
		dp= new int[m+1][m+1];
		
		for(int i=0;i<=m;i++)
			for(int j=0;j<=m;j++) {
				dp[i][j]=-1;
			}
		//string b is reverse of a.
		for(int i=m-1;i>=0;i--) {
			b+=a.charAt(i);
		}
		System.out.println(m-lcs(a,b,m,m));

	}
	static int lcs(String a,String b,int m,int n) {
		if(m==0 || n==0)return 0;
		if(dp[m][n]!=-1)return dp[m][n];
		if(a.charAt(m-1)==b.charAt(n-1)) {
			return dp[m][n]=1+lcs(a,b,m-1,n-1);
		}
		else {
			return dp[m][n]= Math.max(lcs(a,b,m-1,n), lcs(a,b,m,n-1));
		}
		
	}

}
