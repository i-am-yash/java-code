package graph;
import java.util.*;
public class BellmanFordAlgorithim {// doesnt work of negatve weight cycle.
	static void BellmanFordAlgorithim(int graph[][],int V,int e,int source) {
		int distance[]= new int[V];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[source]=0;
		for(int i=0;i<V-1;i++) {
			for(int j=0;j<e;j++) {
				int u=distance[graph[j][0]];
				int v=graph[j][2];
				if(u+v<distance[graph[j][1]]) {
					distance[graph[j][1]]=u+v;
				}
			}
			
		}
		for(int i=0;i<V;i++) {
			System.out.println(i+" :"+distance[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		int src=sc.nextInt();
		int graph[][]= new int[e][3];
		for(int i=0;i<e;i++) {
			System.out.println("Enter vertex 1 vertex 2 and weight");
			for(int j=0;j<3;j++) {
				graph[i][j]=sc.nextInt();
			}
		}
		BellmanFordAlgorithim(graph,v,e,src);
	}

}
