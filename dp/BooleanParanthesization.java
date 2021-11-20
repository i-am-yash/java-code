package dp;
import java.util.*;
public class BooleanParanthesization {
static HashMap<String,Integer>mp;	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		mp=new HashMap<>();
		System.out.println(solve(s,0,n-1,'T'));

	}
	static int solve(String s,int i,int j,char isTrue) {
//		if(mp.get(i+""+j+""+isTrue)!=null) {
//			return mp.get(i+""+j+""+isTrue);
//		}
		if(i>j) {
			
			return 0;}
		if(i==j) {
			if(s.charAt(i)==isTrue) {
				return 1;
			}else {
				return 0;
			}
		}
		int ans=0;
		for(int k=i+1;k<=j-1;k+=2) {
//			int LT=mp.get(i+""+(k-1)+""+'T')==null?solve(s,i,k-1,'T'):mp.get(i+""+(k-1)+""+'T');
//			int LF=mp.get(i+""+(k-1)+""+'F')==null?solve(s,i,k-1,'F'):mp.get(i+""+(k-1)+""+'F');
//			int RT=mp.get((k+1)+""+j+""+'T')==null?solve(s,k+1,j,'T'):mp.get((k+1)+""+j+""+'T');
//			int RF=mp.get((k+1)+""+j+""+'F')==null?solve(s,k+1,j,'F'):mp.get((k+1)+""+j+""+'F');
			int LT=solve(s,i,k-1,'T');
			int LF=solve(s,i,k-1,'F');
			int RT=solve(s,k+1,j,'T');
			int RF=solve(s,k+1,j,'F');
			if(s.charAt(k)=='|') {
				if(isTrue=='T')
				ans+=LT*RT +LT*RF+ LF*RT;
				else {
					ans+=LF*RF;
				}
			}else if(s.charAt(k)=='&') {
				if(isTrue=='T') {
					ans+=LT*RT;
				}
				else {
					ans+= LF*RF+LT*RF+ LF*RT;
				}
			
			}else if(s.charAt(k)=='^') {
				if(isTrue=='T') {
					ans+=LT*RF+LF*RT;
				}
				else {
					ans+=LT*RT+LF*RF;
				}
				
			}
			//System.out.println(ans);
		}
		//mp.put(i+""+j+""+isTrue,ans);
		return ans;
	}

}
