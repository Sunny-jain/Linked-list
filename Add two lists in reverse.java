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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=null;
        ListNode last=temp;
        int carry=0;
        while(l1!=null || l2!=null)
        {
            if(l1==null)
            {
                if(temp==null)
                {
                    if(carry==1)
                        temp=new ListNode(l2.val+1);
                    else
                        temp=new ListNode(l2.val);
                    last=temp;
                }
                else
                {
                    if(carry==0)
                    {
                        temp.next=new ListNode(l2.val);
                        temp=temp.next;
                    }
                    else
                    {
                        temp.next=new ListNode(l2.val+1);
                        temp=temp.next;
                    }
                }
                if(temp.val>9)
                {
                    temp.val=temp.val%10;
                    carry=1;
                }
                else
                {
                    carry=0;
                }
                l2=l2.next;
            }
            else if(l2==null)
            {
                if(temp==null)
                {
                    if(carry==1)
                        temp=new ListNode(l1.val+1);
                    else
                        temp=new ListNode(l1.val);
                    last=temp;
                }
                else
                {
                    if(carry==0)
                    {
                        temp.next=new ListNode(l1.val);
                        temp=temp.next;
                    }
                    else
                    {
                        temp.next=new ListNode(l1.val+1);
                        temp=temp.next;
                    }
                }
                if(temp.val>9)
                {
                    temp.val=temp.val%10;
                    carry=1;
                }
                else
                {
                    carry=0;
                }
                l1=l1.next;
            }
            else
            {
                if(temp==null)
                {
                    if(carry==1)
                        temp=new ListNode(l2.val+l1.val+1);
                    else
                        temp=new ListNode(l2.val+l1.val);
                    last=temp;
                }
                else
                {
                    if(carry==0)
                    {
                        temp.next=new ListNode(l2.val+l1.val);
                        temp=temp.next;
                    }
                    else
                    {
                        temp.next=new ListNode(l2.val+l1.val+1);
                        temp=temp.next;
                    }
                }
                if(temp.val>9)
                {
                    temp.val=temp.val%10;
                    carry=1;
                }
                else
                {
                    carry=0;
                }
                l2=l2.next;
                l1=l1.next;
            }
        }
        if(carry==1)
        {
            temp.next=new ListNode(1);
            temp=temp.next;
        }
        return last;
    }
}
