package leetcode;

import java.util.*;

public class IntegerToRoman {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int  n=sc.nextInt();
		String a[]= new String[13];
		a[0]="I";
		a[1]="IV";
		a[2]="V";
		a[3]="IX";
		a[4]="X";
		a[5]="XL";
		a[6]="L";
		a[7]="XC";
		a[8]="C";
		a[9]="CD";
		a[10]="D";
		a[11]="CM";
		a[12]="M";
		
		String ans="";
		
			for(int i=12;i>=0;i--) {
				if(n==0)break;
			
				if(n/ getvalue(a[i])!=0) {
					int quotient=n/getvalue(a[i]);
					if(quotient>3) {
					System.out.println("propblem");
					
						
					}else {
						while(quotient-->0) 
							ans+=a[i];	
					}
					n=n%getvalue(a[i]);
//					break;
				//	System.out.println(ans+" "+n +" "+a[i]+" "+quotient);
				}else {
					if (n==getvalue(a[i])) {
						ans+=a[i];
						break;
					}
				}
				
			}
//			System.out.println(ans);
		
		System.out.println(ans);
		

	}
	static int getvalue (String ch) {
	if(ch=="I")return 1;
	if(ch=="IV")return 4;
	if(ch=="V")return 5;
	if(ch=="IX")return 9;
	if(ch=="X")return 10;
	if(ch=="XL")return 40;
	if(ch=="L")return 50;
	if(ch=="XC")return 90;
	if(ch=="C") return 100;
	if(ch=="CD")return 400;
	if(ch=="D")return 500;
	if(ch=="CM")return 900;
	return 1000;
	}
	
	
}
