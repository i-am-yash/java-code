package introduction;

import java.util.*;

public class testing {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         int h[]= new int[n];
         for(int i=0;i<n;i++){
             h[i]=sc.nextInt();
         }
         long res=largestRectangle(h);
         System.out.println(res);
 
	
		
	
		
	
	}
	 static long largestRectangle(int[] h) {
	        int n=h.length;
	        long ans=0;
	        for(int i=0;i<n;i++){
	            int min=h[i];
	            int left=i,right=i;
	            while(left>=0&& h[left]>=min ){
	                left--;
	            }
	            left++;
	            while(right<n && h[right]>=min ){
	                right++;
	            }
	            right--;
	            ans=Math.max(ans,(right-left+1)*min);

	        }
	        return ans;
	        


	    }

	
		

	
		
		
		

	

}
