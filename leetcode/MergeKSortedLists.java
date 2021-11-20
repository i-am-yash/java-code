package leetcode;
import java.util.*;

public class MergeKSortedLists {
	static class ListNode{
		 int val;
		      ListNode next;
		      ListNode(int val) { this.val = val; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static   ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        PriorityQueue<Integer> minHeap= new PriorityQueue<Integer>();
        for(ListNode head:lists){
            while(head!=null){
                minHeap.add(head.val);
                head=head.next;
            }
        }
        if(minHeap.isEmpty())return null;
        ListNode head=new ListNode(minHeap.remove());
        ListNode temp=head;
        while(!minHeap.isEmpty()){
            ListNode new_node= new ListNode(minHeap.remove());
            temp.next=new_node;
            temp=temp.next;
        }
        return head;
       
        }

}
