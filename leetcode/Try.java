package leetcode;

import java.util.*;





public class Try {


	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		

	}
	static int solve(int a[][]) {
		Arrays.sort(a, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]-o2[1];
				
			}
		
		});
		int ct=0;
		int x=a[0][0];
		int y=a[0][1];
		for(int i=1;i<a.length;i++) {
			if(a[i][0]<y) {
				ct++;
			}else {
				x=a[i][0];
				y=a[i][1];
			}
		}

		
		return ct;
		
	}
	
		
	
	

	 
	
	 
	
}
