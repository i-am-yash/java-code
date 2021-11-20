package graph;
import java.util.*;

public class UndirectedCycleCheck {
 	private static LinkedList<Integer> adj[];
	public static class Graph{
		Graph(int v){
			adj= new LinkedList[v];
			for(int i=0;i<v;i++) {
				adj[i]= new LinkedList<Integer>();
			}	
		}
		static void addEdges(int source,int destination) {
			adj[source].add(destination);
			adj[destination].add(source);
		}
		boolean isCyclic() {
			boolean vis[]= new boolean[adj.length];
			for(int i=0;i<adj.length;i++) {
				if(!vis[i]) {
					if(isCyclicUtil(i,vis,-1)) {
						return true;
					}
				}
			}
			return false;
		}
		boolean isCyclicUtil(int i,boolean vis[],int parent) {
			
			vis[i]=true;
			for(int neighbour:adj[i]) {
				if(!vis[neighbour]) {
					if(isCyclicUtil(neighbour,vis,i)) {
						return true;
					}
				}
				else if(neighbour!=parent) {
					return true;
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int v=sc.nextInt();
		int e=sc.nextInt();
		Graph graph= new Graph(v);
		for(int i=0;i<e;i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			graph.addEdges(source, destination);
			
		}
		System.out.println(graph.isCyclic());
		

	}

}
