package leetcode;

import java.util.*;


public class jumpGame2 {
	// if dp[i][j]==-1; means its not visited 
//	if dp[i][j]==0; means it store false
//	else it store true;

static 	int dp[][];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		

	}

	static int solve(int a[]) {
		
	int n=a.length;
	int l=0;
	int res=0;
	int r=0;
	while(r<n-1) {
		int farthest=0;
		for(int i=l;i<=r;i++) {
			farthest=Math.max(farthest,i+a[i]);	
		}
		l=r+1;
		r=farthest;
		res++;
	}
	return res;
		
	}

	
	


	
	

	
	
}
