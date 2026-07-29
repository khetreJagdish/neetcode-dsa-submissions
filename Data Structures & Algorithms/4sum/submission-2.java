class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i<n; i++){

            for(int j = i+1; j<n; j++){

                for(int k = j+1; k<n; k++){

                    for(int l = k+1; l<n; l++){

                        long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                        if(sum == target){
                            
                            List<Integer> groups = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(groups);
                            ans.add(groups);
                        }
                    }
                }
            }
        }
    return new ArrayList<>(ans);
    }
}