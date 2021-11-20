package numberTheory.bitManipulation;

public class RSBmask {//right most set bit mask
	
	//for eg binary of x is A's( 0 ,1) 1 B's 0 eg 010001110101 1 000.  ->x
	// x'=A's(1,0)0 b's of 1                      101110001010 0 111.
	//2's complement of x A's(1,0)1 B's of 0      101110001010 1 000    -> x'' 
	// x&x''                                      000000000000 1 000  this is rsb mask

	public static void main(String[] args) {
		int n=10;
		int rsbMask=(n&(-n));
		System.out.println(Integer.toBinaryString(n)+"   "+Integer.toBinaryString(rsbMask));
	}

}
