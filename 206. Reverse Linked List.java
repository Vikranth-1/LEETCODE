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
    public ListNode reverseList(ListNode head) {
        ListNode new_head=null;
        while(head!=null){
            ListNode new_node=new ListNode(head.val);
            if(new_head!=null){
                new_node.next=new_head;
                new_head=new_node;
            }else{
                new_head=new_node;
            }
            head=head.next;
        }
        return new_head;
    }
}
