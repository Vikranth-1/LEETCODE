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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        else if(list2==null) return list1;
        else if(list1==null) return list2;
        ListNode list3=null;
        while(list1!=null && list2!=null){
            if(list1.val==list2.val){
                ListNode new_node=new ListNode(list1.val);
                if(list3==null){
                    list3=new_node;
                }else{
                    ListNode temp=list3;
                    while(temp.next!=null) temp=temp.next;
                    temp.next=new_node;
                }
                list1=list1.next;
            }else if(list1.val<list2.val){
                ListNode new_node=new ListNode(list1.val);
                if(list3==null){
                    list3=new_node;
                }else{
                    ListNode temp=list3;
                    while(temp.next!=null) temp=temp.next;
                    temp.next=new_node;
                }
                list1=list1.next;
            }else{
                ListNode new_node=new ListNode(list2.val);
                if(list3==null){
                    list3=new_node;
                }else{
                    ListNode temp=list3;
                    while(temp.next!=null) temp=temp.next;
                    temp.next=new_node;
                }
                list2=list2.next;
            }
        }
        while(list1!=null){
            ListNode new_node=new ListNode(list1.val);
            if(list3==null){
                list3=new_node;
            }else{
                ListNode temp=list3;
                while(temp.next!=null) temp=temp.next;
                temp.next=new_node;
            }
            list1=list1.next;
        }
        while(list2!=null){
            ListNode new_node=new ListNode(list2.val);
            if(list3==null){
                list3=new_node;
            }else{
                ListNode temp=list3;
                while(temp.next!=null) temp=temp.next;
                temp.next=new_node;
            }
            list2=list2.next;
        }
        return list3;
    }
}
