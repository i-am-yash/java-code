package leetcode;

import java.util.*;


public class mergeIntervals {
	static HashSet<String>set;
	static List<List<String>>ans;
	static class interval implements Comparable<interval>{
		int strt=0;
		int end=0;
		@Override
		public int compareTo(interval o) {
			// TODO Auto-generated method stub
			if(this.strt==o.strt)return this.end-o.end;
			return this.strt-o.strt;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++)
			a[i][j]=sc.nextInt();
		}
		int ans[][]=solve(a);
//		for(int i=0;i<ans.length;i++) {
//			for(int j =0;j<2;j++) {
//				System.out.print(ans[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		

	}
	static int[][] solve(int a[][]) {
		int  n=a.length;
		interval interv[]=new interval[n];
		for(int i=0;i<n;i++) {
			interv[i]=new interval();
			interv[i].strt=a[i][0];
			interv[i].end=a[i][1];
		}
		Arrays.sort(interv);
		Stack<interval>st=new Stack<>();
		st.push(interv[0]);
		for(int i=1;i<n;i++) {
			interval cur=st.peek();
			if(interv[i].strt>cur.end || interv[i].end<cur.strt) {
				st.push(interv[i]);
			}else {
				
				int start=Math.min(cur.strt, interv[i].strt);
				int end=Math.max(cur.end, interv[i].end);
				
					st.pop();
				
				//System.out.println(start+"-"+end+"inside");
				interval new_interv=new interval();
				new_interv.strt=start;
				new_interv.end=end;
				st.push(new_interv);
			}
			
		}
		int m =st.size();
		int ans[][]=new int [m][2];
		for(int i=m-1;i>=0;i--) {
			ans[i][0]=st.peek().strt;
			ans[i][1]=st.peek().end;
			System.out.println(ans[i][0]+"-"+ans[i][1]);
			
			st.pop();
					
		}
		

		
		return ans;
		
	}

	
	

	
	
}
