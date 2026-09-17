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
        ListNode temp=head,prev=head;
        int i=0;
        while(temp!=null){
            if(i>n){
                prev=prev.next;
            }
            temp=temp.next;
            i++;
        }
        if(i==n) return head.next;
        prev.next=prev.next.next;
        return head;
    }
}
