package leetcode;

import java.util.*;





public class multiplyStrings {
	static List<List<Integer>>ans;
	static 	HashSet<List<Integer>>set;
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String b=sc.next();
		System.out.println(solve(s,b));

		   
		
		// 11
		 //123
	
		
		
		

	}
	static String solve(String a,String b) {
		int m=a.length();
		int n=b.length();
		int arr[]= new int [m+n];
	//	Arrays.fill(arr,-1);
		
		for(int j=n-1;j>=0;j--) {
			int carry=0;
			for(int i=m-1;i>=0;i--) {
				int val=((a.charAt(i)-'0') * (b.charAt(j)-'0'));
				int temp=(arr[i+j+1]+val %10 +carry);
				arr[i+j+1]=(arr[i+j+1]+val %10 +carry)%10;
				carry=val/10;
				carry+=temp/10;
				//System.out.println(j+"-"+i+" "+arr[i+j+1]+" "+carry+" "+val);
				
			}
			
			arr[j]+=carry;
		}
		System.out.println(Arrays.toString(arr));
		boolean check=false;
		String ans="";
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i]!=0)check=true;
			
			if(check)	ans=ans.concat((char) (arr[i]+'0')+"");
			
		}
		
		
		
		return ans;
		
	}
	
}
