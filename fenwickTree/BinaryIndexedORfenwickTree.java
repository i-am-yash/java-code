package fenwickTree;

import java.io.*;
import java.util.*;

public class BinaryIndexedORfenwickTree  {
	static class FenwickTree{
		int tree[];
	
		void contructFenwickTree(int ar[],int n) {
			tree= new int[n+1];
			for(int i=0;i<ar.length;i++) {
				update(i,ar[i],n);
			}
		}
		
	     void update(int i,int delta,int n) {      //delta means newValue - preValue.
	    	                                         //i is index of array.
	    	i++;
	    	while(i<=n) {
	    		tree[i]+=delta;
	    		i=i+Integer.lowestOneBit(i);
	    	}
	    }
	      int getSum(int i ){
	     	int sum=0;
	     	i++;
	     	while(i>0) {
	     		sum+=tree[i];
	     		i-=Integer.lowestOneBit(i);
	     	}
	     	return sum;
	     }
	      int rangeOfSum(int i,int j) {
	    	  return getSum(j)-getSum(i-1);
	      }
		
	}

	public static void main(String[] args)throws IOException {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
    	int a[]= new int[n];
    	int max=0;
    	for(int i=0;i<n;i++) {
    		a[i]=sc.nextInt();
    		max=Math.max(max, a[i]);
    	}
    	FenwickTree ft= new FenwickTree();
    	ft.contructFenwickTree(a, n);
   // System.out.println(ft.rangeOfSum(1, 1));
    	System.out.println(Arrays.toString(ft.tree));
    	
    
	}
	

}
