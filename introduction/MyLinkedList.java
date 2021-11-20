package introduction;

public class MyLinkedList<E> {   //E is used for genetics ,to accompolish it,first code from int then replace int from E.
	                             // and add<E> after node and MyLinkedList class.
	Node<E> head;
	public void add(E data)
	
	{
		Node<E> toAdd=new Node<E>(data);  //toAdd node adds all the values from xyz.add(?).
		if(head==null) {
			head=toAdd;
			return;
		}
		Node<E> temp=head;
		while(temp.next !=null) {
			temp=temp.next;
		}
		temp.next=toAdd;}
		
		
		void print() {
			Node<E> temp=head;
			
			while(temp !=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			
		}
		public boolean isEmpty() {
			return head==null;
		}
		public E removeLast() throws Exception {
			Node<E> temp=head;
			if(temp==null) {
				throw new Exception("cannot pop from empty stack");
			}
			if(temp.next==null) {
				Node<E>toRemove=head;
				head=null;
				return toRemove.data;
			}
			while(temp.next.next !=null) {
				temp=temp.next;
			}
			Node<E> toRemove=temp.next;
			temp.next=null;
			return toRemove.data;
		}
		public E getLast() throws Exception {
			Node<E> temp=head;
			if(temp==null) {
				throw new Exception("cannot peek from empty stack");
			}
			
			while(temp.next !=null) {
				temp=temp.next;
			}
			
			
			return temp.data;
			
		}
		
	static class Node<E>{
		E data;
		Node<E> next;
		Node(E data){
			this.data=data;
			next=null;
		}
	}

}
