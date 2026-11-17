class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for(int i = 0; i<=n-3; i++){

            for(int j = i+1; j<=n-2; j++){

                List<Integer> group = new ArrayList<>();

                for(int k = j+1; k<n; k++){

                    if(nums[i]+ nums[j]+nums[k] == 0){
                        group.add(nums[i]);
                        group.add(nums[j]);
                        group.add(nums[k]);
                        Collections.sort(group);
                        ans.add(group);
                        break;
                    }
                }
                
                
            }
        }
        return new ArrayList<>(ans);
    }
}
