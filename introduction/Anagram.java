package introduction;

public class Anagram {

	public static void main(String[] args) {
		String a="cac";
		String b="acc";
		boolean visited[]= new boolean[a.length()];
		boolean isAnagram=false;
		for(int i=0;i<a.length();i++) {
		char c=a.charAt(i); 
		isAnagram=false;
			for(int j=0;j<b.length();j++) {
				if(b.charAt(j)==c && !visited[j]) {
					visited[j]=true;
					isAnagram=true;
					
					break;
				}
				
			}
		if(!isAnagram)
			break;
		}
		if(isAnagram)
			System.out.println("anagram");
		else
			System.out.println(" not anagram");
	

	}

}
