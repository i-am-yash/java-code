package graph;
import java.util.*;
 

public class DirectedCyclicCheck {
	private static LinkedList<Integer> adj[];
	static class Graph{
		Graph(int v){
			
			adj= new LinkedList[v];
			for(int i=0;i<v;i++) {
				adj[i]= new LinkedList<Integer>();
			}
		}
		public void addEdges(int source,int destination) {
			adj[source].add(destination);
		}
		private boolean isCyclic() {
			boolean vis[]= new boolean[adj.length];
			boolean recStack[]= new boolean[adj.length];
			for(int i=0;i<adj.length;i++) {
				if(isCyclicUtil(i,vis,recStack)) {
					return true;
				}
				
			}
			return false;
		}
		public boolean isCyclicUtil(int i,boolean[]vis,boolean[]recStack) {
			if(recStack[i]) {
				return true;
			}
			//if(vis[i])return false; i didnot  use this condition but its written in GFG, why?
			recStack[i]=true;
			vis[i]=true;
			for(int neighbour:adj[i]) {
					if(isCyclicUtil(neighbour,vis,recStack)) {
						return true;
					}
			}
			recStack[i]=false;
			return false;
		}
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter vertices and edges");
		int v=sc.nextInt();
		int e=sc.nextInt();
		Graph graph= new Graph(v);
		
		for(int i=0;i<e;i++) {
			System.out.println("Enter edges");
			int sources=sc.nextInt();
			int destination=sc.nextInt();
			graph.addEdges(sources, destination);
			
		}
		
		System.out.println(graph.isCyclic());
		
	}

}
