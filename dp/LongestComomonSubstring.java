package dp;

import java.util.Scanner;

public class LongestComomonSubstring {
static int dp[][];
static String dp2[][];
static int ans;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
	
		int m=a.length();
		int n=b.length();
		dp= new int[m+1][n+1];
		dp2= new String[m+1][n+1];
		
		System.out.println(lcs(a,b,m,n));

	}
	static int lcs(String a,String b,int m,int n) {
	for(int i=0;i<=m;i++) {
		for(int j=0;j<=n;j++) {
			if(i==0 || j==0) {
				dp[i][j]=0;
				dp2[i][j]="";
			}
		}
	}
	for(int i=1;i<=m;i++) {
		for(int j=1;j<=n;j++) {
			if(a.charAt(i-1)==b.charAt(j-1)) {
				dp[i][j]=1+dp[i-1][j-1];
				dp2[i][j]=a.charAt(i-1)+dp2[i-1][j-1];
			}else {
				dp[i][j]=0;
				dp2[i][j]="";
			}
		}
	}	
//		for(int i=0;i<=m;i++) {
//			for(int j=0;j<=n;j++) {
//				ans=Math.max(ans, dp[i][j]);
//			}
//		}
	int max=0;
	String ans2="";
	for(int i=0;i<=m;i++) {
		for(int j=0;j<=n;j++) {
			if(dp[i][j]>max) {
				max=dp[i][j];
				ans2=dp2[i][j];
			}
		}
	}
	System.out.println(ans2);
		return max;
//		System.out.println(ans2);
	}
	

}
