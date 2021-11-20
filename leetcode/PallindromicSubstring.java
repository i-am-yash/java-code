package leetcode;

import java.util.*;





public class PallindromicSubstring {
	
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n =sc.nextInt();
//		int a[]= new int [n];
//		for(int i=0;i<n;i++)a[i]=sc.nextInt();
//		int target=sc.nextInt();
		String s=sc.next();
		System.out.println(solve(s));
		
		
		
		

	}
	static int solve(String s) {
		int n=s.length();
		boolean dp[][]=new boolean[n][n];
		for(int g=0;g<n;g++) {
			for(int i=0, j=g;j<n;j++,i++) {
				if(g==0)dp[i][j]=true;
				else if(g==1) {
					if(s.charAt(i)==s.charAt(j))dp[i][j]=true;
					else dp[i][j]=false;
				}
				else {
					System.out.println(i+" "+j);
					if(s.charAt(i)==s.charAt(j))dp[i][j]=true;
					dp[i][j]=dp[i][j] && dp[i+1][j-1];
				}
			}
		}
		int ct=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
			
				if(dp[i][j]) {
					ct++;
				}
			}
			
		}
		
		
		return ct;
	}
	
}
