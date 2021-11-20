package introduction;

public class CreateMyDeque<E> {

	public static void main(String[] args) {
		MyDeque<Integer>mdq= new MyDeque<Integer>();
		mdq.addToFirst(5);
		mdq.addToFirst(85);
		mdq.addToFirst(59);
		System.out.println(mdq.toRemoveFirst());
		
	}

}
