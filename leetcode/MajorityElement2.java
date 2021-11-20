package leetcode;
import java.util.*;

public class MajorityElement2 {
	//Moore's Voting Algorithm 


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static List<Integer> majorityElement(int[] arr) {
        int n=arr.length;
     List<Integer> ans= new ArrayList<>();
        int a=-1,b=-1,ca=0,cb=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a)ca++;
            else if(arr[i]==b)cb++;
            else if(ca==0){
                a=arr[i];
                ca=1;}
            else if(cb==0){b=arr[i];
                           cb=1;}
            else{
                ca--;
                cb--;
            }
             System.out.println(a+" "+ca+" "+b+" "+cb);
       // System.out.println(b+" "+ca);
        }
        //  System.out.println(a+" "+ca);
        // System.out.println(b+" "+ca);
            int ct1=0, ct2=0;
            for(int i=0;i<arr.length;i++){
                if(ca>0){
                   if(arr[i]==a)ct1++; 
                }
                if(cb>0){
                  if(arr[i]==b)ct2++;  
                }
            }
       
            if(ct1>(n/3))ans.add(a);
            if(ct2>(n/3))ans.add(b);
        return ans;
        }

}
