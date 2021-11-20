package recurrsion;

import java.util.*;

public class ArraysOfEqualSums {

	public static void main(String[] args) {
		ArrayList<Integer>  ans = new ArrayList<>();
		int a[]= {2,2,1,3,4,8};
		int sum=0;
		for(int e:a) {
			sum+=e;
		}
		boolean isPossible=(sum&1)==0 && partition(a,0,sum/2,ans);
			
		if(isPossible) {
			for(int e:ans) {
				System.out.print(e+" ");
			}
		}
		else {
			System.out.println("not possible");
		}
		

	}
	static boolean partition(int a[],int i,int sum,ArrayList<Integer>ans) {
		if(i>=a.length|| sum<0) {
			return false;
		}
		if(sum==0) {
			return true;
		}
		ans.add(a[i]);
		boolean leftPossible=partition(a,i+1,sum-a[i],ans);
		if(leftPossible) {
			return true;
		}// making backtracking works.
		ans.remove(ans.size()-1);
		return partition(a,i+1,sum,ans);
	}

}
