class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int longest = 1;
        HashSet<Integer> hashSet  = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }

        for(int num : hashSet){

            if(!hashSet.contains(num-1)){
                int current = num;
                int max = 1;

                while(hashSet.contains(current+1)){
                    current++;
                    max++;
                }
            longest = Math.max(max,longest);
            }
        }
        return longest;
    }
}
