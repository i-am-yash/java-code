package leetcode;
import java.util.*;

public class LetterCombination {
	static HashMap<Character,List<Character>>map;
	static List<String> ans;

	public static void main(String[] args) {
		
		ans= new ArrayList<String>();
		map= new HashMap<>();
		List<Character> list= new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		map.put('2', list);
		//list.clear();
		List<Character> list3= new ArrayList<Character>();
		list3.add('d');list3.add('e');list3.add('f');
		//System.out.println(list);
		map.put('3', list3);
		List<Character> list4= new ArrayList<Character>();
		list4.add('g');list4.add('h');list4.add('i');
		map.put('4', list4);
		//list.clear();
		List<Character> list5= new ArrayList<Character>();
		list5.add('j');list5.add('k');list5.add('l');
		map.put('5', list5);
		//list.clear();
		List<Character> list6= new ArrayList<Character>();
		list6.add('m');list6.add('n');list6.add('o');
		map.put('6', list6);
		//list.clear();
		List<Character> list7= new ArrayList<Character>();
		list7.add('p');list7.add('q');list7.add('r'); list7.add('s');
		map.put('7', list7);
		//list.clear();
		List<Character> list8= new ArrayList<Character>();
		list8.add('t');list8.add('u');list8.add('v');
		map.put('8', list8);
	//	list.clear();
		List<Character> list9= new ArrayList<Character>();
		list9.add('w');list9.add('x');list9.add('y');list9.add('z');
		map.put('9', list9);
		//System.out.println(map);
		
		solve("23",0,"");
		
		System.out.println(ans);
	}
	static void solve(String s,int i,String cur) {
	//	System.out.println(i);
		if(cur.length()==s.length()) {
			ans.add(cur);
			return ;
		}
	
		for(char ch:map.get(s.charAt(i))) {
			solve(s,i+1,cur+ch);
		}
		//solve(s,i+1,cur);
	}

}
