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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode node=head;
        int i=m;
        if(head==null || head.next==null || m==n)
        {
            return head;
        }
        while(m>2)
        {
            node=node.next;
            m--;
        }
        ListNode t=null;
        if(m!=1)
        {
            t=node;
            node=node.next;
        }
        ListNode prev=null;
        ListNode curr=node;
        ListNode next=node.next;
        ListNode temp=curr;
        for(i=i;i<n;i++)
        {
            curr.next=prev;
            prev=curr;
            curr=next;
            next=next.next;
        }
        temp.next=curr.next;
        curr.next=prev;
        if(m!=1)
        {
            t.next=curr;
        }
        if(m!=1)
        {
        return head;
        }
        else
        {
            return curr;
        }
    }
}
