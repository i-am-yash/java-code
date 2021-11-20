package leetcode;

import java.util.*;



public class InterleavingString {
	static int dp[];
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String c=sc.next();
		System.out.println(solve(a,b,c));
		
		
		
		
//		
// -3 0 -2 k= 100
	}
	static boolean solve(String a,String b,String c	) {
		boolean dp[][]=new boolean[a.length()+1][b.length()+1];
		if(c.length()!=a.length()+b.length())return false;
		
		//initialization
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				int k=i+j-1;
				if(i==0 && j==0)dp[i][j]=true;
				else {
					if(i==0) {
						if(c.charAt(k)==b.charAt(j-1)) {
							dp[i][j]=dp[i][j-1];
						}else {
							dp[i][j]=false;
						}
						
					}else if(j==0) {
						if(a.charAt(i-1)==c.charAt(k))
						dp[i][j]=dp[i-1][j];
						else {
							dp[i][j]=false;
						}
					}
					
				}
			}
		}
		
		
		for(int i=1;i<=a.length();i++) {
			for(int j=1;j<=b.length();j++) {
				int k=i+j-1;
				if(a.charAt(i-1)==c.charAt(k) && b.charAt(j-1)==c.charAt(k)) {
					dp[i][j]=dp[i-1][j] || dp[i][j-1];
				}else {
					if(a.charAt(i-1)==c.charAt(k)) {
						dp[i][j]=dp[i-1][j];
					}
					else if( b.charAt(j-1)==c.charAt(k)) {
						dp[i][j]=dp[i][j-1];
					}
					
				}
				//System.out.println(dp[i][j]+" "+i+" "+j);
			}
		}
//		for(int i=0;i<=a.length();i++) {
//			for(int j=0;j<=b.length();j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		
		return dp[a.length()][b.length()];
		
	}
	
}
