package numberTheory.bitManipulation;

import java.util.*;

public class NoOfSetBits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	int n=sc.nextInt();
		String s="11111111111111111111111111111101";
		int n=Integer.parseInt(s, 2);
		System.out.println(n);
		int ct=0;
		while(n>0) {
			int rsbm=n&(-n);
			n=n-rsbm;
			ct++;
			
		}
		System.out.println(ct);
	}

}
