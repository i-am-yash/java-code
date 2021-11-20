package leetcode;

public class RoatedSortedArrayMinIndex {

	public static void main(String[] args) {
		int a[]= {8,9,2,3,4};
		System.out.println(minIndex(a,0,a.length-1));
		
	}
	static int minIndex(int a[],int lo,int hi) {
		int n=a.length;
		while(lo<=hi) {
			if(a[lo]<=a[hi])return lo; //if its sorted
		//	System.out.println(mid);
			int mid=(lo+hi)/2;
			int prev=(mid-1+n)%n; //so if mid=0 prev becoes n-1.
			int next=(mid+1)%n;
//			System.out.println(mid+" "+a[prev]+" "+a[mid]+" "+a[next]);
			if(a[mid]<=a[prev] && a[mid]<=a[next] )return mid;
			if(a[lo]<=a[mid]) {
				lo=mid+1;
			}else {
				hi=mid-1;
			}
		}
		return -1;
	}

}
