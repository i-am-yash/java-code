package CodeForces;
import java.util.*;

public class Graphs {
	private LinkedList<Integer> adj[];
	public Graphs(int v) {
		adj= new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]= new LinkedList<Integer>();
		}
		
		
	}
	public void addEdge(int source,int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
		
	}
	public int BFS(int source,int destination) {
		int distance=0;
		boolean vis[]= new boolean[adj.length];
		int parent[]= new int[adj.length];
		Queue<Integer> q= new LinkedList<>();
		parent[source]=-1;
		vis[source]=true;
		q.add(source);
		while(!q.isEmpty()) {
			int cur=q.poll();
			if(cur==destination) {
				break;
			}
			for(int neighbour:adj[cur]) {
				if(!vis[neighbour]) {
					q.add(neighbour);
					vis[neighbour]=true;
					parent[neighbour]=cur;
				}
			}
		}
		int cur=destination;
		while(parent[cur]!=-1) {
			System.out.print(cur+">>");
			cur=parent[cur];
			distance++;
		}
		System.out.println(source);
		
		return distance;
	}
	public boolean DFS(int source,int destination,boolean vis[]) {
		if(source==destination)return true;
		for(int neighbour:adj[source]) {
			if(!vis[neighbour]) {
				vis[neighbour]=true;
				Boolean isConnected=DFS(source,destination,vis);
				if(isConnected) return true;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of vertices and edges");
		int v=sc.nextInt();
		int e=sc.nextInt();
		Graphs graph= new Graphs(v);
		for(int i=0;i<e;i++) {
			System.out.println("Enter "+e+" edges");
			int source=sc.nextInt();
			int destination=sc.nextInt();
			graph.addEdge(source, destination);
		}
//		for(int i=0;i<v;i++) {
//			System.out.println(graph.adj[i]);
//		}
//		int ans=graph.BFS(0, 3);
//		System.out.println(ans);
		System.out.println("enter source and destination");
		int source=sc.nextInt();
		int destination=sc.nextInt();
		boolean vis[]= new boolean[v];
		System.out.println(graph.DFS(source, destination, vis));
		
		
		
	}

}
