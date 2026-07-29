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
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode temp=head;
        List<ListNode> list=new ArrayList<>();
        while(temp.next!=null){
            for(ListNode ref:list){
                if(ref==temp) return true;
            }
            list.add(temp);
            temp=temp.next;
        }
        return false;
    }
}
