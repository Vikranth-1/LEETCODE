/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                ListNode ptr1=head;
                while(ptr1!=slow){
                    ptr1=ptr1.next;
                    slow=slow.next;
                }
                return ptr1;
            }
        }

        return null;
    }
}
