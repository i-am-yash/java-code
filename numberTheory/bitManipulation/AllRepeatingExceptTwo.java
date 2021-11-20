package numberTheory.bitManipulation;

import java.util.*;

public class AllRepeatingExceptTwo {
// all numbers are repeating except two numbers print those number..
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int  n=sc.nextInt();
		n=2*n+2;
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int ans[]=solve(a);
		for(int i:ans) {
			System.out.print(i+" ");
		}
		//System.out.println(3^29);
	}
	static int [] solve(int a[]) {
		int n=a.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			temp=(temp^a[i]);
			//System.out.println(a[i]+" "+temp);
		}
		//System.out.println(temp);
		int msk=temp &(-temp);
	//	System.out.println(msk);
		int ans[]=new int[2];
		int ans1=0,ans2=0;
		for(int i=0;i<n;i++) {
			if( ((msk) & a[i])!=0) {
				ans1=ans1^a[i];
				
			}else {
				ans2=ans2^a[i];
				
				
			}
		}
		ans[0]=ans1;
		ans[1]=ans2;
		Arrays.sort(ans);
		return ans;
	}

}
