class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int size = nums.length;
        int[] ans = new int[size - k + 1];
        int left = 0;
        int index = 0;
        Deque<Integer> deque = new ArrayDeque(k);
        for(int right = 0; right<size; right++){

            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]){
                deque.pollLast();
            }

            deque.offerLast(right);

            while(right - left + 1 > k){
                if(deque.peekFirst() == left){
                    deque.pollFirst();
                }
                left++;
            }

            if(right - left + 1 == k){
                ans[index++] = nums[deque.peekFirst()];
            }
            
        }
    return ans;
    }
}
