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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1)
        {
            return null;
        }
        ListNode sp=head;
        ListNode fp=head;
        int c=0;
        while(c<n)
        {
            fp=fp.next;
            c++;
        }
       if(fp==null)
       {
           head=head.next;
           return head;
       }
        while(fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next;
        }
        sp.next=sp.next.next;
        return head;

    }
}
