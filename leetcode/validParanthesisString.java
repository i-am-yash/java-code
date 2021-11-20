package leetcode;

import java.util.*;





public class validParanthesisString {
static HashMap<String,Boolean>dp;

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character>st= new Stack<Character>();
		
		//System.out.println(st.toString());
		
//			int n=sc.nextInt();
//			int  a[]= new int[n];
//			for(int i=0;i<n;i++) {
//				a[i]=sc.nextInt();
//				
//			}
		dp= new HashMap<String, Boolean>();
			System.out.println(valid(s.toCharArray(),st,0));
	//		System.out.println(binarySearch(a,0,n-1,6));
			System.out.println(dp);
	
		
		
		

	}
	 static boolean valid(char a[],Stack<Character>st,int i) {
		 //char a[]=s.toCharArray();
		if(dp.get(st.toString()+i)!=null)return dp.get(st.toString()+i);
		 for( ;i<a.length;i++) {
			 if(a[i]=='(')st.push(a[i]);
			 else if(a[i]==')') {
				 if(st.isEmpty())return false;
				 st.pop();
			 }
			 else {
				 boolean x=false,y=false,z=false;
				Stack<Character>st1=(Stack<Character>) st.clone();
				Stack<Character>st2=(Stack<Character>) st.clone();
				Stack<Character>st3=(Stack<Character>) st.clone();
				x=valid(a,st1,i+1);
				st2.push('(');
				y=valid(a,st2,i+1);
				if(!st3.isEmpty()) {
					st3.pop();
					z=valid(a,st3,i+1);
				}
				
				String s=st.toString();
				System.out.println(s);
				dp.put(s+i, x||(y||z));
				return x ||(y||z);
			 }
		 }
		 if(st.isEmpty())return true;
		 
		 return false;
	        
	    }
	
	
	 
	
}
