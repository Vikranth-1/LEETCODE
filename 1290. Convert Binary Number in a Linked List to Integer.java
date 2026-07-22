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
    public int getDecimalValue(ListNode head) {
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
        int s=0,v=1;
        while(new_head!=null){
            if(new_head.val==1) s+=v;
            v*=2;
            new_head=new_head.next;
        }
        return s;
    }
}
