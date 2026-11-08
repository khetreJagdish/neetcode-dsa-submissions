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
        if(head == null) return null;
        List<Integer> list = new ArrayList<>();
        ListNode current = head; 
        while(current != null){
            list.add(current.val);
            current = current.next;
        }

        List<Integer> reversedList = list.reversed();

        ListNode newHead = new ListNode(reversedList.get(0));

        ListNode newCurrent = newHead;

        for(int val  = 1; val <reversedList.size(); val++){
            newCurrent.next = new ListNode(reversedList.get(val));
            newCurrent = newCurrent.next;
        }
    return newHead;
        
    }
}
