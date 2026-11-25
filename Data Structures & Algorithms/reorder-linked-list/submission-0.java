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
    public void reorderList(ListNode head) {
        
        List<Integer> list = new ArrayList<>();
        ListNode current = head; 

        while(current != null){
            list.add(current.val);
            current = current.next;
        }

        int[] ans = new int[list.size()];
        int left = 0;
        int right = list.size()-1;

        for(int j = 0; j<list.size(); j++){
            if(j % 2 == 0){
                ans[j] = list.get(left);
                left++; 
            }else{
                ans[j] = list.get(right);
                right--; 
            }
        }

        
        current = head;

        for(int k : ans){
            current.val = k;
            current = current.next;
        }
    }
}
