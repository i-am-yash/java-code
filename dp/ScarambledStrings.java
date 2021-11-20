package dp;

import java.util.*;

public class ScarambledStrings {
	static Hashtable<String,Boolean> dp;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		dp= new Hashtable<String, Boolean>();
		System.out.println(isScrambled(a,b));
		
	}
	static boolean isScrambled(String a,String b) {
		if(a.equals(b)) {
			return true;
		}
		if(a.length()!=b.length())return false;
		if(a.length()==0 && b.length()==0)return true;
		if(a.length()==0)return false;
		int n=a.length();
		String temp=a+b;
		if(dp.get(temp)!=null) {
			return dp.get(temp);
		}
		for(int i=1;i<=n-1;i++) {
			if (isScrambled(a.substring(0,i),b.substring(0, i)) && isScrambled(a.substring(i,n),b.substring(i, n)) ) return true;
					if (  isScrambled(a.substring(0, i),b.substring(n-i,n)) &&isScrambled(a.substring(i, n),b.substring(0, n-i)) )  {
						
						dp.put(temp, true);
				return true;
			}
		}
		dp.put(temp, false);
		return false;
	}

}
