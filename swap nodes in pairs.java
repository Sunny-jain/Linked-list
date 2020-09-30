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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode swap=new ListNode(0);
        ListNode temp=swap;
        while(head!=null && head.next!=null)
        {
            ListNode first=head;
            ListNode second=first.next;
            ListNode third=second.next;
            second.next=first;
            first.next=third;
            temp.next=second;
            head=third;
            temp=temp.next.next;
        }
        return swap.next;
    }
}
