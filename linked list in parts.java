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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size=0;
        ListNode node=head;
        while(node!=null)
        {
            node=node.next;
            size++;
        }
        
        if(size<k)
        {
            ListNode[] mn=new ListNode[k];
            int i=0;
            while(head!=null)
            {
                mn[i]=new ListNode(head.val);
                i++;
                head=head.next;
            }
            return mn;
        }
        else
        {
            ListNode[] mn=new ListNode[k];
            int i=0;
            int l=size/k;
            int a=size%k;
            while(head!=null)
            {
                if(a!=0)
                {
                    ListNode temp=head;
                    for(int j=0;j<l+1-1;j++)
                    {
                        head=head.next;
                    }
                    ListNode tem=head;
                    head=head.next;
                    tem.next=null;
                    mn[i]=temp;
                    i++;a--;
                }
                else
                {
                    ListNode temp=head;
                    for(int j=0;j<l-1;j++)
                    {
                        head=head.next;
                    }
                    ListNode tem=head;
                    head=head.next;
                    tem.next=null;
                    mn[i]=temp;
                    i++;
                }
            }
            return mn;
        }
    }
}
