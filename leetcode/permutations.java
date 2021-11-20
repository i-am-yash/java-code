package leetcode;

import java.util.*;


public class permutations {
	// if dp[i][j]==-1; means its not visited 
//	if dp[i][j]==0; means it store false
//	else it store true;
static int ct=0;
static int len=0;
static  List<List<Integer>>ans;	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ans=new ArrayList<List<Integer>>();
		int a[]= {1,2,3};
		boolean vis[]= {false,false,false};
		List<Integer>cur=new ArrayList<Integer>();
//		a.add(4);
		solve(a,vis,cur);
		System.out.println(ans);
		
		

	}

	static void solve(int[]a,boolean vis[],List<Integer>cur) {
		
		if(cur.size()==a.length) {
			ans.add(new ArrayList<Integer>(cur));
			return;
		}
		for(int i=0;i<a.length;i++) {
			if(!vis[i]) {
				vis[i]=true;
				cur.add(a[i]);
				solve(a,vis,cur);
				vis[i]=false;
				cur.remove(cur.size()-1);
			}
		}
		
		
		return;
		
		
	}

	
	


	
	

	
	
}
