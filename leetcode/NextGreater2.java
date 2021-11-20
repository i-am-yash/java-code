package leetcode;
//monotonic stack algo
import java.util.*;

public class NextGreater2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] nextGreaterElements(int[] a) {
        int ans[]= new int [a.length];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<a.length;i++){
            if(st.isEmpty()){
                st.push(i);
            }
            else{
                while(!st.isEmpty() && a[st.peek()]<a[i]){
                    int index=st.pop();
                    ans[index]=a[i];
                    
                }
                st.push(i);
            }
        }
       
        for(int i=0;i<a.length;i++){
            if(st.isEmpty())break;
           while(!st.isEmpty() && a[st.peek()]<a[i]){
               int index=st.pop();
               if(ans[index]!=-1){
                   ans[index]=a[i];
               }
           }
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
      
     return ans;
    }

}
