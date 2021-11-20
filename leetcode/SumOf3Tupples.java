package leetcode;

import java.util.*;

public class SumOf3Tupples {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		//System.out.println(check(a));
		System.out.println(check(a));
		
		

	}
	static List<List<Integer>> check(int a[]){
		Arrays.sort(a);
		int n=a.length;
		List<List<Integer>>ans= new ArrayList<>();
		if(n<3)
		return ans;
		for(int i=0;i<n-1;i++) {
			if(i>0 && (a[i-1]==a[i]))continue;
			int sum=a[i];
			for(int j=i+1;j<n-1;j++) {
				sum+=a[j];
				int indx=binarySearch(a,j+1,n-1,-sum);
				if(indx!=-1) {
				//	System.out.println(i+" "+j+" "+indx+" "+(-sum) );
					List<Integer>val= new ArrayList<Integer>();
					
					val.add(a[i]);
					val.add(a[j]);
					val.add(a[indx]);
				//	System.out.println(val);
					ans.add(val);
				}
				sum-=a[j];
				
			}
		}
		HashSet<List<Integer>>set=new HashSet<List<Integer>>();
		List<List<Integer>>temp= new ArrayList<>();
		for(int i=0;i<ans.size();i++) {
			if(!set.contains(ans.get(i)))
			temp.add(ans.get(i));
			set.add(ans.get(i));
		}
		
		return temp;
	}
	static int binarySearch(int a[],int i,int j,int key) {
		int lo=i;
		int hi=j;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(a[mid]==key)return mid;
			else if(a[mid]>key) {
				hi=mid-1;
			}else {
				lo=mid+1;
			}
		}
		return -1;
	}

	
	
}
