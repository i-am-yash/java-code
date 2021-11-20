package graph;
import java.util.*;

public class KruskalAlgorithim {
	static class Edge implements Comparable<Edge>  {
		int source,destination,weight;

		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return this.weight-o.weight;
		}
		

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		Edge arr[]= new Edge[e];
		for(int i=0;i<e;i++) {
			arr[i]= new Edge();
			arr[i].source=sc.nextInt();
			arr[i].destination=sc.nextInt();
			arr[i].weight=sc.nextInt();
		
		}
		Arrays.sort(arr);
		krushkal(arr,e,v);
//		for(int i=0;i<e;i++) {
//			System.out.println(arr[i].source+"-"+arr[i].destination+" "+arr[i].weight);
//		}
		
		
		
		
		
	}
	static void krushkal(Edge a[],int e,int v) {
		
		Edge output[]= new Edge[v-1];
		for(int i=0;i<v-1;i++) {
			output[i]=new Edge();
		}
		int parent[]= new int[v];
		for(int i=0;i<v;i++) {
			parent[i]=-1;
		}
		int count=0;
		int j=0;
		while(count!=v-1) {
			Edge current=a[j];
			int srcParent=findParent(current.source,parent);
			int desParent=findParent(current.destination,parent);
			if(srcParent!=desParent) {
				output[count]=current;
				parent[srcParent]=desParent;
				count++;
			}
			j++;
		}
		for(int i=0;i<v-1;i++) {
			
			System.out.println(output[i].source+"-"+output[i].destination+" "+output[i].weight);
		}
		
	}
	static int findParent(int v,int[]parent) {
		if(parent[v]==-1) {
			return v;
		}
		return findParent(parent[v],parent);
	}
	

}
