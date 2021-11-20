package introduction;

public class Impq7 { // mosteffective method to find frequencies of whole array in O(n).

	public static void main(String[] args) {
		
		int a[]= {1,2,3,0,8,0,6,5,4,3};
		int n=a.length;
		int freqOf[]= new int[n];
		for(int i=0;i<n;i++) {
			freqOf[a[i]]++;
		}
		for(int i=0;i<n;i++) {
			System.out.println("frequency of "+i+" "+freqOf[i]);
		}
	}

}
