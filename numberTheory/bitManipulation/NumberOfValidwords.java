package numberTheory.bitManipulation;
import java.util.*;

public class NumberOfValidwords {
//Leetcode problem..
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
	int m=sc.nextInt();;
		String words[]= new String[n];
		String puzzles[]= new String[m];
		for(int i=0;i<n;i++) {
			words[i]=sc.next();
		}
		for(int i=0;i<m;i++) {
			puzzles[i]=sc.next();
		}
		
		ArrayList<Integer>ans =(solve(puzzles,words));
for(int i:ans) {
	System.out.println(i);
}
		

	}
	static ArrayList<Integer> solve(String [] puzzles,String []words){
		HashMap<Character,ArrayList<Long>> map= new HashMap<>();
		
		for(int i=0;i<26;i++) {
			map.put( (char) (i+'a'),new ArrayList<>());
		}
		for(String word:words) {
			//char ch=word.charAt(0);
			long mask=0;
			for(char ch:word.toCharArray()) {
				int bit=ch-'a'; 
				mask=mask | ((1<<bit));
			}
		//	System.out.println(word+" "+mask);
			HashSet<Character> set= new HashSet<>();
			for(char ch:word.toCharArray()) {
				if(set.contains(ch)) continue;
				map.get(ch).add(mask);
				set.add(ch);
				//System.out.println(word+" ");
			}
		}
		ArrayList<Integer>ans=new ArrayList<Integer>();
		for(String puzzle:puzzles) {
			long pmask=0;
			for(char ch:puzzle.toCharArray()) {
				int bit=ch-'a'; 
				pmask=pmask | ((1<<bit));
			}
			int ct=0;
			char first=puzzle.charAt(0);
			ArrayList<Long>wordsToCheck=map.get(first);
			for(long wmask:wordsToCheck) {
				if( (wmask & pmask)==wmask) {
					ct++;
				}
			}
			ans.add(ct);
			
			
			
		}
		
		
		return ans;
	}

}
