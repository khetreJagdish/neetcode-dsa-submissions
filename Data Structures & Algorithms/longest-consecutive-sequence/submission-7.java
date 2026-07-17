class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longest = 0;
        HashSet<Integer> hashSet = new HashSet();
        for(int num : nums){
            hashSet.add(num);
        }

        for(int num : hashSet){

            if(!hashSet.contains(num-1)){
                int current = num;
                int count = 1;

                while(hashSet.contains(current+1)){
                    current++;
                    count++;
                }
            longest = Math.max(longest,count);
            }
            
        }
        return longest;
    }
}
