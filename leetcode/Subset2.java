package leetcode;

import java.util.*;





public class Subset2 {
	static List<List<Integer>>ans;
	static 	HashSet<List<Integer>>set;
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer>ll=new LinkedList<Integer>();
		int n =sc.nextInt();
		int a[]=new int[n];
		ans= new LinkedList<List<Integer>>();
		boolean vis[]= new boolean[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		//	ll.add(a[i]);
		}
		Arrays.sort(a);
		
		set= new HashSet<List<Integer>>();
		solve(a,0,vis,new LinkedList<>());
		
		
		System.out.println(set);
	
		
		
		

	}
	static void solve(int a[],int i,boolean vis[],LinkedList<Integer>cur) {
		if(i==a.length) {
			if(!set.contains(cur)) {
			ans.add(new ArrayList<>(cur));
			set.add(new ArrayList<>(cur));
			return;
			}
			return;
		}
//		for(;i<a.length;i++) {
			
				vis[i]=true;

				solve(a,i+1,vis,cur);
				cur.add(a[i]);
				solve(a,i+1,vis,cur);
				vis[i]=false;
				cur.remove(cur.size()-1);
			
//		}
	}
	
}
