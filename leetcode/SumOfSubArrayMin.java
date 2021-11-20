package leetcode;

import java.util.HashMap;
import java.util.*;

public class SumOfSubArrayMin {

	public static void main(String[] args) {
		int a[]=  {3,4,2,4};
		// 4,2,4,3

		int next[]= new int [a.length];
		solve(a,next);
		int temp[]=new int [a.length];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[a.length-1-i];
		}
		int pre[]= new int [a.length];
		Stack<Integer>st= new Stack<>();
		for(int i=a.length-1;i>=0;i--) {
			if(st.isEmpty()) {
				st.push(i);
			}else {
				while(!st.isEmpty() && a[st.peek()]>a[i]) {
					pre[st.peek()]= i;
					st.pop();
				}
				st.push(i);
			}
		}
		while(!st.isEmpty()) {
			pre[st.pop()]=-1	;
		}
		for(int i=0;i<a.length;i++) {
			if(next[i]==-1) {
				next[i]=a.length;
			}
//			int ind=pre[i];
//			if(ind!=-1)
//			pre[a.length-1-i]=a.length-ind-1;
			
		}
		System.out.println(Arrays.toString(pre));
		System.out.println(Arrays.toString(next));
		long sum=0;
		long mod=1000000000+7;
		for(int i=0;i<a.length;i++) {
			int nextI=next[i];
			int preI=pre[i];
			sum%=mod;
			sum+= ((((nextI-i)%mod) * ((i-preI)%mod) )%mod* (a[i]%mod) )%mod;
		}
		System.out.println(sum);
		
	}
	static void solve(int a[],int map[]) {
		Stack<Integer>st= new Stack<>();
		for(int i=0;i<a.length;i++) {
			if(st.isEmpty()) {
				st.push(i);
			}else {
				while(!st.isEmpty() && a[st.peek()]>a[i]) {
					map[st.peek()]= i;
					st.pop();
				}
				st.push(i);
			}
		}
		while(!st.isEmpty()) {
			map[st.pop()]=-1	;
		}
	}

}
