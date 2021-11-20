package dp;

import java.util.Scanner;
import java.util.Stack;

public class PrintShortestCommonSpersequence {
static int dp[][];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int m=a.length();
		int n=b.length();
		
		dp= new int[m+1][n+1];
		
		
	//	System.out.println(lcs(a,b,m,n));
		System.out.println(print(a,b));
//		for(int i=0;i<=m;i++) {
//			for(int j=0;j<=n;j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}

	}
	static int lcs(String a,String b,int m,int n) {
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0) {
					dp[i][j]=0;
				}
			}
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) {
					 dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					 dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
		
		
	}
	static String print(String a,String b) {
		int temp=lcs(a,b,a.length(),b.length());
		int i=a.length();
		int j=b.length();
		Stack<Character>st= new Stack<>();
		while(i>0 && j>0) {
			if(a.charAt(i-1)==b.charAt(j-1)) {
				st.push(a.charAt(i-1));
				i--;
				j--;
			}
			else {  
				if(dp[i][j-1]>dp[i-1][j]) {
					st.push(b.charAt(j-1));
					j--;
				}
				else  {
					st.push(a.charAt(i-1));
					i--;
				}
			}
		}
		while(i>0) {
			st.push(a.charAt(i-1));
			i--;
				
			
		}
		while(j>0) {
			st.push(b.charAt(j-1));
			j--;
		}
		String ans="";
		while(!st.isEmpty()) {
			ans+=st.pop();
		}
		return ans;
		
	}
	

}
