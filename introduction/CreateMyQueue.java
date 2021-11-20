package introduction;

public class CreateMyQueue {

	public static void main(String[] args) {
		MyQueue<Integer> mq= new MyQueue<>();
		mq.enqueue(4);
		mq.enqueue(6);
		mq.enqueue(8);
		mq.enqueue(9);
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		mq.enqueue(9);
		System.out.println(mq.dequeue());
		
	}

}
