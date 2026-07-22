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
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        ListNode listHead = null;
        int sum = 0;
        while (head != null) {
            if (head.val == 0) {
                ListNode newNode = new ListNode(sum);
                if (listHead == null) {
                    listHead = newNode;
                } else {
                    ListNode temp = listHead;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                }
                sum = 0;
            } else {
                sum += head.val;
            }
            head = head.next;
        }
        return listHead;
    }
}
