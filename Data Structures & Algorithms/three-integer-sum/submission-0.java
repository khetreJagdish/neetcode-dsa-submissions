class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Brute force
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i<n; i++){

            for(int j = i+1; j<n; j++){

                for(int k = j+1; k<n; k++){

                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplets = new ArrayList<>();
                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(nums[k]);
                        Collections.sort(triplets);
                        ans.add(triplets);
                    }
                    
                }
            }
        }
    return new ArrayList<>(ans);  
    }
}
