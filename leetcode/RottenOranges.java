package leetcode;
import java.util.*;

public class RottenOranges {
		public static void main(String args[]) {
			
		}
		 static  int orangesRotting(int[][] grid) {
		        HashSet<String>rotten= new HashSet<>();
		        Set<String>fresh= new HashSet<>();
		        for(int i=0;i<grid.length;i++){
		            for(int j=0;j<grid[0].length;j++){
		                if(grid[i][j]==1){
		                    fresh.add(""+i+j);
		                }
		                else if(grid[i][j]==2){
		                    rotten.add(""+i+j);
		                }
		            }
		        }
		        int direction[][]={{-1,0},{0,1},{1,0},{0,-1}};
		        int minutes=0;
		        while(fresh.size()>0){
		           HashSet<String>infected=new HashSet<>();
		            for(String s:rotten){
		             int i=s.charAt(0)-'0';
		             int j=s.charAt(1)-'0';
		                for(int directions[]:direction){
		                    int nextI=i+directions[0];
		                    int nextJ=j+directions[1];
		                    if(fresh.contains(""+nextI+nextJ)){
		                        infected.add(""+nextI+ nextJ);
		                        fresh.remove(""+nextI+nextJ);
		                    }
		                }
		            }
		            if(infected.size()==0)return -1;
		            rotten=infected;
		            minutes++;
		        }
		        
		        return minutes;
		    }
}
