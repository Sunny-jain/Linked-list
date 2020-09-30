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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<Integer>();
        Queue<ListNode> queue=new LinkedList();
        if(head==null)
        {
            return true;
        }
        while(head!=null)
        {
            stack.push(head.val);
            queue.add(head);
            head=head.next;
        }
        while(!queue.isEmpty())
        {
            if(stack.pop()==queue.poll().val)
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
