package leetcode;

import java.util.*;

public class GenrealParanthesis {
static List<String>ans;
static String dp[][];

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
//		int a[]= new int[n];
//		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		
		
		
		ans=new ArrayList<String>();
		dp= new String[n+1][n+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				dp[i][j]=" ";
			}
		}
		solve("",n,n);
		System.out.println(ans);

	}
	static void solve(String cur,int open,int close) {
		if(open<0 || close<0)return;
		if(close<open)return;
		if(open==0 && close==0) {
			ans.add(cur);
			return;
		}
		
//		if(dp[open][close]!=" ") {
//			ans.add(dp[open][close]);
//			return;
//		}
		
//		 dp[open][close]=cur;
			
		
		solve(cur+'(',open-1,close);
		solve(cur+')',open,close-1);
		
	}
	

	
	
}
