package dp;

import java.util.*;

public class LongestCommonSubsequence {
	static int dp[][];
	static String dp2[][];

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int m=a.length();
		int n=b.length();
		dp= new int[m+1][n+1];
		dp2= new String[m+1][n+1];
		for(int i=0;i<=m;i++)
			for(int j=0;j<=n;j++) {
				dp[i][j]=-1;
			}
		String ans=lcs2(a,b,m,n);
		String temp="";
		for(int i=ans.length()-1;i>=0;i--) {
			temp+=ans.charAt(i);
		}
		System.out.println(temp);
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
	static String lcs2(String a,String b,int m,int n) {
		if(dp[m][n]!=-1) {
			return dp2[m][n];
		}
		if(m==0 || n==0)return "";
		if(a.charAt(m-1)==b.charAt(n-1)) {
			dp[m][n]=0;
			return dp2[m][n]= a.charAt(m-1)+ lcs2(a,b,m-1,n-1);
		}
		else {
			String left=lcs2(a,b,m,n-1);
			String right=lcs2(a,b,m-1,n);
			if(left.length()>right.length()) {
				return dp2[m][n]=left;
			}else {
				return dp2[m][n]= right;
			}
		}
		
	}

}
