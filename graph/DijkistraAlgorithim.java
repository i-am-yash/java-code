package graph;
import java.util.*;

public class DijkistraAlgorithim {
	static void dijkistra(int[][]adj,int source) {
		int v=adj.length;
		boolean vis[]= new boolean[v];
		int distance[]= new int[v];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[source]=0;
		for(int i=0;i<v-1;i++) {
			int minVertex=findMinVertex(distance,vis);
			vis[minVertex]=true;
			for(int j=0;j<v;j++) {
				if(adj[minVertex][j]!=0 && !vis[j] && distance[minVertex]!=Integer.MAX_VALUE) {
					int newDis=distance[minVertex]+adj[minVertex][j];
					if(newDis<distance[j]) {
						distance[j]=newDis;
					}
				}
			}
			//System.out.println(minVertex+" "+distance[i]);
		}
		for(int i=0;i<v;i++) {
			System.out.println(i+" "+distance[i]);
		}
		
	}
	static int findMinVertex(int[]distance,boolean[]vis) {
		int v=distance.length;
		 int min = Integer.MAX_VALUE, min_index = -1; 
		  
	        for (int i = 0; i < v; i++) 
	            if (vis[i] == false && distance[i] <= min) { 
	                min = distance[i]; 
	                min_index = i; 
	            } 
	  
	        return min_index; 
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter vertices and edges");
		int v=sc.nextInt();
		int e=sc.nextInt();
		System.out.println("Enter sources");
		int source=sc.nextInt();
		int adjacentMatrix[][]= new int[v][v];
		for(int i=0;i<e;i++) {
			System.out.println("Enter "+e+" vertices and weight");
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			int w=sc.nextInt();
			adjacentMatrix[v1][v2]=w;
			adjacentMatrix[v2][v1]=w;
		}
		dijkistra(adjacentMatrix,source);

	}

}
