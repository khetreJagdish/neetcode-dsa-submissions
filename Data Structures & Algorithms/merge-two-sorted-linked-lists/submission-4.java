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
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode dummyNode = new ListNode(-1); 
        ListNode current = dummyNode;

        while(current1 != null || current2 != null){

            if(current1 != null && current2 != null){
                if(current1.val <= current2.val){
                    current.next = new ListNode(current1.val);
                    current1 = current1.next;
                }else{
                    current.next = new ListNode(current2.val);
                    current2 = current2.next;
                }
            }else if(current2 == null && current1 != null){
                current.next = new ListNode(current1.val);
                current1 = current1.next;
            }else if(current1 == null && current2 != null){
                current.next = new ListNode(current2.val);
                current2 = current2.next;
                
            }
            current = current.next;
        }
    return dummyNode.next;
    }
}