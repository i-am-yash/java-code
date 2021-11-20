package introduction;

public class CreateLinkedList {

	public static void main(String[] args) {
		MyLinkedList<Integer> mll= new MyLinkedList();
		
		for(int i=1;i<10;i++) {
		mll.add(i);}
		mll.print();
		

	}

}
