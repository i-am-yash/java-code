package graph;
import java.util.*;
public class TopologicalSort {
	  static class Graph{
		private LinkedList<Integer>adj [];
		Graph(int v){
			adj= new LinkedList[v];
			for(int i=0;i<v;i++) {
				adj[i]= new LinkedList<>();
			}
		}
		void addEdges(int s,int d) {
			adj[s].add(d);
		}
		void topologicalSort() {
			Stack<Integer>stck = new Stack<>();
			boolean vis[]= new boolean[adj.length];
			for(int i=0;i<adj.length;i++) {
				if(!vis[i]) {
			topologicalSortUtil(i,stck,vis);}}
		//	System.out.println(stck);
			while(!stck.isEmpty()) {
				System.out.print(stck.pop()" ");
			}
			
		}
		void topologicalSortUtil(int i,Stack<Integer> s,boolean[]vis) {
			vis[i]=true;
			if(adj[i]!=null) {
			
			for(int neighbour:adj[i]) {
				if(!vis[neighbour]) {
					vis[neighbour]=true;
					topologicalSortUtil(neighbour,s,vis);
				}
			}
		}
			s.push(i);
			return;
			
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter vertices and edges");
		Scanner sc= new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		Graph graph= new Graph(v);
		for(int i=0;i<e;i++) {
			System.out.println("Enter edges");
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			graph.addEdges(v1, v2);
		}
		graph.topologicalSort();
		
		
	}

}
