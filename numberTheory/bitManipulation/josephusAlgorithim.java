package numberTheory.bitManipulation;

import java.util.*;

public class josephusAlgorithim { 
	//kill every next soldier..
	//soldier are lined from 1 to N in circle.

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int hp=highestPowerOf2(n);
		System.out.println(hp);
		int l=n-hp;
		System.out.println(2*l+1);
	}
	static int highestPowerOf2(int n) {
		int i=1;
		while(2*i<=n) {
			i=i*2;
		}
		return i;
	}
	

}
