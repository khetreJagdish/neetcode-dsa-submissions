class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i <= n - 4; i++) {
            for (int j = i + 1; j <= n - 3; j++) {
                for (int k = j + 1; k <= n - 2; k++) {
                    
                    for (int l = k + 1; l < n; l++) {
                        long sum = (long)nums[i] + nums[j] + nums[k] + nums[l] ;
                        if (sum == target) {
                            List<Integer> group = new ArrayList<>();
                            group.add(nums[i]);
                            group.add(nums[j]);
                            group.add(nums[k]);
                            group.add(nums[l]);
                            Collections.sort(group);
                            ans.add(group);
                            break;
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}