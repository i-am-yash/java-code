package leetcode;

import java.util.*;


public class WildcardMatching {
	// if dp[i][j]==-1; means its not visited 
//	if dp[i][j]==0; means it store false
//	else it store true;

static 	int dp[][];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s="acdcbb";
		String p="a*c?b";
		dp=new int[s.length()+1][p.length()+1];
		for(int i=0;i<=s.length();i++) {
			for(int j=0;j<=p.length();j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(solve(s,p,0,0));
		
		
		
		
		

	}

	static boolean solve(String s,String p,int i,int j) {
		if(dp[i][j]!=-1) {
			if(dp[i][j]==0)return false;
			else return true;
		}
//		System.out.println(i+" "+j);
		if(i>=s.length() && j>=p.length())return true;
		if(j>=p.length())return false;
		if(i>=s.length() && j<p.length()) {
			if(p.charAt(j)=='*') {
				 if(solve(s,p,i,j+1))
					dp[i][j]=1;
				else dp[i][j]=0;
				if(dp[i][j]==0)return false;
				else return true;
			}
			dp[i][j]=0;
			return false;
		}
		if(p.charAt(j)=='*') {
			if(j==p.length()-1) {
				dp[i][j]=1;
				return true;
			}
			if(p.charAt(j+1)=='*'){
				if(solve(s,p,i,j+1)) {
					dp[i][j]=1;
				}else {
					dp[i][j]=0;
				}
				if(dp[i][j]==0)return false;
				else return true;
				
			}
			for(;i<s.length();i++) {
				if(solve(s,p,i,j+1)) {
					dp[i][j]=1;
					return true;
				}
			}
			dp[i][j]=0;
			return false;
			
		}else {
			if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?') {
				{
					if(solve(s,p,i+1,j+1))dp[i][j]=1;
					else dp[i][j]=0;
					if(dp[i][j]==0)return false;
					else return true;
					
				}
			}else {
				dp[i][j]=0;
				return false;
			}
		}
//	return true;
		
	}

	
	


	
	

	
	
}
