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
        ListNode current = head;
        List<Integer> list = new ArrayList<>();

        while(current != null){
            list.add(current.val);
            current = current.next;
        }

        Collections.reverse(list);

        ListNode dummy = new ListNode(-1);
        current = dummy;
        for(int num : list){
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }
}
