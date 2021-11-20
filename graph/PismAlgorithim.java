package graph;
import java.util.*;
public class PismAlgorithim {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		int graph[][]= new int[v][v];
		for(int i=0;i<e;i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			int w=sc.nextInt();
			graph[v1][v2]=w;
			graph[v2][v1]=w;
		}
		int weight[]= new int[v];
		Arrays.fill(weight, Integer.MAX_VALUE);
		weight[0]=0;
		int parent[]= new int[v];
		parent[0]=-1;
		boolean vis[]= new boolean[v];
		for(int i=0;i<v-1;i++) {
			int u=minVertex(weight,vis);
			vis[u]=true;
			for(int j=0;j<v;j++) {
				if(graph[u][j]!=0 && !vis[j] && graph[u][j] < weight[j]) {
					weight[j]=graph[u][j];
					parent[j]=u;
				}
			}
			
				
			
		}
		for(int i=1;i<v;i++) {
			System.out.println(parent[i]+"-"+i+" "+weight[i]);
		}
		
	

}
	static int minVertex(int weight[],boolean[]vis) {
		int max=Integer.MAX_VALUE;
		int v=weight.length;
		int minIndex=-1;
		for(int i=0;i<v;i++) {
			if( !vis[i]&& weight[i]<max) {
				max=weight[i];
				minIndex=i;
			
			}
			
		}
		return minIndex;
	}
}
