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
    public int[] nextLargerNodes(ListNode head) {
        ListNode node=head;
        int size=0;
        while(node!=null)
        {
            node=node.next;
            size++;
        }
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            if(head.val<max)
            {
                head=head.next;
                arr[i]=max;
            }
            else
            {}
            int max=0;
            node=head;
            while(node!=null)
            {
                if(node.val>head.val)
                {
                    max=node.val;
                    break;
                }
                node=node.next;
            }
            head=head.next;
            arr[i]=max;
        }
        return arr;
    }
}
