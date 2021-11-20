package CodeForces;
import java.util.*;

public class NextSmaller {

	public static void main(String[] args) {
	int a[]= {4,8,3,5,2,25};
	
	
	HashMap<Integer,Integer>map= new HashMap<>();
	solve(a,map);
	System.out.println(map);
	
	}
	static void solve(int a[],HashMap<Integer,Integer>map) {
		Stack<Integer>st= new Stack<>();
		for(int i=0;i<a.length;i++) {
			if(st.isEmpty()) {
				st.push(a[i]);
			}else {
				while(!st.isEmpty() && st.peek()>a[i]) {
					map.put(st.peek(), i);
					st.pop();
				}
				st.push(a[i]);
			}
		}
		while(!st.isEmpty()) {
			map.put(st.pop(),-1	);
		}
	}

}
