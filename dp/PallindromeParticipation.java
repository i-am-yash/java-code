package dp;

import java.util.*;

public class PallindromeParticipation {
	static int dp[][];
	static boolean check [][];

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
	int n=s.length();
		dp= new int[n+1][n+1];
		check=new boolean[n+1][n+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				dp[i][j]=-1;
			}
		}
		//System.out.println(isPallindrome(s,0,s.length()-1));
		System.out.println(solve(s,0,s.length()-1));

	}
	static int solve(String s,int i,int j) {
		if(dp[i][j]!=-1)return dp[i][j];
		int ans=Integer.MAX_VALUE;
		if(i>=j)return dp[i][j]= 0;
		if(isPallindrome(s,i,j)) return dp[i][j]= 0;
		for(int k=i;k<j;k++) {
			int left=dp[i][k]==-1?solve(s,i,k):dp[i][k];
			int right=dp[k+1][j]==-1?solve(s,k+1,j):dp[k+1][j];
			int temp=left+right+1;
			ans=Math.min(ans, temp);
		}
		return dp[i][j]=ans;
	}
	static boolean isPallindrome(String s,int i,int j) {
		if(dp[i][j]!=-1) {
			return check[i][j];
		}
		int x=i;
		int y=j;
		while(x<=y) {
			if(s.charAt(x)==s.charAt(y)) {
				x++;
				y--;
			}else {
				return check[i][j]=false;
			}
		}
		return check[i][j]= true;
	}

}
