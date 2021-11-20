package trie;

import java.util.*;

public class MaxXorPair {
 static class trieNode{
	trieNode left ;
	trieNode right;

	static void insert(int n,trieNode head) {
		trieNode cur=head;
		for(int i=31;i>=0;i--) {
			if(( (n>>i)&1) !=0) {
				//ith bit is 1
				if(cur.right==null) {
					cur.right=new trieNode();
				}
				cur=cur.right;
			}
			else {
				if(cur.left==null) {
					cur.left=new trieNode();
				}
				cur=cur.left;
			}
		}
	}
	static long maxPair(trieNode head,int a[]) {
		long res=Integer.MIN_VALUE;
		int n=a.length;
		
		
		for(int i=0;i<n;i++) {
			trieNode cur=head;
			long val=a[i];
			long cur_max=0;
			for(int j=31;j>=0;j--) {
				if(((val>>j)&1)==0) {
					//jth bit is 0.
					if(cur.right!=null) {
						cur=cur.right;
						cur_max+=1L<<j;
					}else {
						cur=cur.left;
					}
				}else {
					if(cur.left!=null) {
						cur=cur.left;
						cur_max+=(1L<<j);
					}else {
						cur=cur.right;
					}
				}
			}
			//System.out.println(cur_max);
			res=Math.max(res, cur_max);
		}
		return res;
	}
	
	
}
	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int a[]= new int[n];
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
}
trieNode head= new trieNode();

for(int i=0;i<n;i++) {
head.insert(a[i],head);
}
System.out.println(head.maxPair(head, a));



	}

}
