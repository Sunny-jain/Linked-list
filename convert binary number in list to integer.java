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
    static int c=0;
    static int sum=0;
    public int getDecimalValue(ListNode head) {
        if(head==null)
        {
            c=0;
            return 0;
        }
        int val=getDecimalValue(head.next);
        val+=(int)Math.pow(2,c)*head.val;
        c+=1;
        return val;
    }
}
