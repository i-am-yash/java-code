package introduction;


import java.util.*;

public class ImpQ5 {// find if sub array contains sum =k.
	// use of set decrease the time complexity.

	public static void main(String[] args) {
		int a[]= {1,2,1,3};
		Set<Integer> set = new HashSet<>();
		int sum=0;
		int k=5;
		boolean found = false;
		for(int item:a) {
			set.add(sum);
			sum+=item;
			if(set.contains(sum-k)) {
				found=true;
				break;
			}
		}
		System.out.println("found "+ found);
		
	
		

	}

}
