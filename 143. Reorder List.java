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
    public void reorderList(ListNode head) {
        if(head==null) return;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode sec=slow.next,prev=null;
        slow.next=null;
        while(sec!=null){
            ListNode node=sec.next;
            sec.next=prev;
            prev=sec;
            sec=node;
        }
        fast=head;sec=prev;
        while(sec!=null){
            ListNode temp1=fast.next,temp2=sec.next;
            fast.next=sec;
            sec.next=temp1;
            fast=temp1;
            sec=temp2;
        }
    }
}
