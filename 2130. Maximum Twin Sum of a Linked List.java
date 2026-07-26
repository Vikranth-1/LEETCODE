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
    public int pairSum(ListNode head) {
        ListNode slow= head, fast =head;
        while (fast !=null && fast.next!=null) {
            slow= slow.next;
            fast =fast.next.next;
        }
        ListNode prev=null,curr =slow;
        while (curr!=null) {
            ListNode next=curr.next;
            curr.next= prev;
            prev =curr;
            curr= next;
        }
        int max=Integer.MIN_VALUE;
        ListNode first=head,second= prev;
        while (second!=null) {
            if(max<first.val+second.val) max=first.val+second.val;
            first=first.next;
            second=second.next;
        }
        return max;
    }
}
