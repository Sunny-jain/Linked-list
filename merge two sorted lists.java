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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode tail=null;
        while(l1!=null || l2!=null)
        {
            if(l1==null)
            {
                if(head==null)
                {
                    head=new ListNode(l2.val);
                    tail=head;
                }
                else
                {
                head.next=l2;
                head=head.next;
                }
                l2=l2.next;
            }
            else if(l2==null)
            {
                if(head==null)
                {
                    head=new ListNode(l1.val);
                    tail=head;
                }
                else
                {
                head.next=l1;
                head=head.next;
                }
                l1=l1.next;
            }
            else if(l1.val<=l2.val)
            {
                if(head==null)
                {
                    head=new ListNode(l1.val);
                    tail=head;
                }
                else
                {
                    head.next=l1;
                    head=head.next;
                }
                l1=l1.next;
            }
            else
            {
                if(head==null)
                {
                    head=new ListNode(l2.val);
                    tail=head;
                }
                else
                {
                    head.next=l2;
                    head=head.next;
                }
                l2=l2.next;
            }
        }
        return tail;
    }
}
