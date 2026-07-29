class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i<n; i++){

            for(int j = i+1; j<n; j++){

                int left = j+1;
                int right = n-1;

                while(left < right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target){
                        List<Integer> groups = Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        ans.add(groups);
                        left++;
                        right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }

                }
            }
        }
    return new ArrayList<>(ans);
    }
}