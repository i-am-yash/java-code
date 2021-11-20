package dp;

import java.util.*;



public class MaximalSquare {
	static int dp[];
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n =sc.nextInt();
		
		
	
		int a[][]=new int[m][n];
		dp=new int[n+1];
		Arrays.fill(dp, -1);
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
		
		System.out.println("snd"+solve(a));
		
		
		
		
//		
// -3 0 -2 k= 100
	}
	static int solve(int a[][]) {
		
		int m=a.length;
		int n=a[0].length;
		int dp[][]=new int[m][n];
		int max_row=0;
		for(int rows=0;rows<m;rows++) {
			for(int cols=0;cols<n;cols++) {
				if(a[rows][cols]==1) {
					dp[rows][cols]=1;
					if(rows>0 && cols>0) {
						int temp=Math.max( dp[rows][cols-1],dp[rows-1][cols-1]);
						dp[rows][cols]+=Math.max(dp[rows-1][cols],temp);
					}
					max_row=Math.max(max_row,dp[rows][cols]);
				}
			}
		}
		return max_row*max_row;
		
		
	}
	
}
