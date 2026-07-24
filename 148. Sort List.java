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
    public ListNode sortList(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        Collections.sort(arr);
        ListNode new_head=null,tail=null;
        for(int element:arr){
            ListNode new_node=new ListNode(element);
            if(new_head!=null){
                tail.next=new_node;
                tail=tail.next;
            }else{
                new_head=new_node;
                tail=new_node;
            }
        }
        return new_head;
    }
}
