package lists;
import java.util.ArrayList;

public class Arraylists {

	public static void main(String[] args) {
		ArrayList<String> fruits=new ArrayList();
		fruits.add("mango");
		fruits.add("Apple");
		fruits.add("Banana");
		
		String temp[]=new String[fruits.size()];
		fruits.toArray(temp);             //arrayList is placed into array of stirng.
		for(String e:temp) {
			System.out.println(e);
		}
	//	for(String e:fruits) {
		//System.out.println(e);}
		
		
		
		
	}

}
