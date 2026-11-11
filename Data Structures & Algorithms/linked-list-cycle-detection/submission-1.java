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
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        HashSet<ListNode> hashSet = new HashSet<>();

        ListNode current = head;

        while(current != null){

            if(hashSet.contains(current)){
                return true;
            }
            hashSet.add(current);
            current = current.next;
        }
        return false;

    }
}
