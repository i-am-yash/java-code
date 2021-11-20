package leetcode;

import java.util.*;


public class CombinationSum {
static List<List<Integer>>ans;


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]={2,3,6,7};
		Stack<Integer>al= new Stack<>();
//		System.out.println(solve(5));
		ans=new ArrayList<List<Integer>>();

		solve(a,0,0,7,al);
		System.out.println(ans); 
	
		

	}
	static void solve(int a[],int i,int sum,int target,Stack<Integer>al) {
//		
		if(sum==target) {
			Stack<Integer>	temp=(Stack<Integer>) al.clone();
			ans.add(temp);
//			System.out.println("in target"+ans);
			return;
		}
		if(i>=a.length || sum>target) {
			return;
		}
//		al.add(a[i]);
		al.push(a[i]);
	//	System.out.println(al+" "+a[i]+" "+sum+"first");
		solve(a,i,sum+a[i],target,al);
		al.pop();
//		al.remove(a[i]);
		//System.out.println(al+" "+a[i]+" "+sum+"second");
		solve(a,i+1,sum,target,al);
		
	
	}

	
	


	
	

	
	
}
