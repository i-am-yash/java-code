package introduction;

public class MyStack<E> {
	
	private MyLinkedList<E> ll =new MyLinkedList<>();
	
	
	void push(E e) {
		ll.add(e);
		 
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("poping of empty stack is not allowed");
		}
		return ll.removeLast();
		
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("peeking of empty stack is not allowed");
		}
		return ll.getLast();
		
	}

}
