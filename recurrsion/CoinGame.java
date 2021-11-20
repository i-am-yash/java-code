package recurrsion;

public class CoinGame {
// one can choose left most or right most coin only.try to get the highest coin namner sum.
	public static void main(String[] args) {
		int a[]= {3,4,400,99};
		System.out.println(coinMax(a,0,a.length-1));

	}
	 static int coinMax(int a[],int l,int r) {
		if(l+1==r) {
			return Math.max(a[l], a[r]);
		}
		
		return Math.max(a[l]+ Math.min(coinMax(a,l+1,r-1), coinMax(a,l+2,r)),
				a[r]+ Math.min(coinMax(a,l,r-2), coinMax(a,l+1,r-1)) );
	}

}
