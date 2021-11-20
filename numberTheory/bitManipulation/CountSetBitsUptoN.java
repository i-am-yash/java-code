package numberTheory.bitManipulation;

import java.util.*;

public class CountSetBitsUptoN {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println(solve(n));

	}
	static int solve(int n) {
		if(n==0)return 0;
		int x=PowerOf2(n);
		int before2powerX=(1<<(x-1))*x;
		int msbCount= n-(1<<x)+1;
		int left=msbCount-1;
		int ans=before2powerX+msbCount+solve(left);
		return ans;
	}
	static int  PowerOf2(int n) {
		int x=0;
		while((1<<x)<=n) {
			x++;
		}
		return x-1;
	}

}
