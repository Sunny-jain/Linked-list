/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
       int n=0;
		ListNode temp=head;
		 ListNode last=head;
		while(temp!=null){
			last=temp;
			temp=temp.next;
			n++;
		}
		if(n==0 || n==k || n==1 )
			return head;
		k=k%n;
		if(k==0)
			return head;

		int count=n-k;
		temp=head;
		ListNode prev=null;
		while(count>0){
			prev=temp;
			temp=temp.next;
			count--;
		}
		prev.next=null;
		last.next=head;
		return temp;
    }
}
