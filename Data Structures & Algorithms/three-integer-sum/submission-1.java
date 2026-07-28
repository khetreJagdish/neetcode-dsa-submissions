class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // use Sorting + Two pointer , keeping first element as constant
        Arrays.sort(nums);
        int size = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i<size; i++){

            int left = i+1;
            int right = size-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if( sum == 0){
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[left]);
                    triplets.add(nums[right]);
                    //Collections.sort(triplets);
                    ans.add(triplets);
                    left++;
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
    return new ArrayList<>(ans);
    }
}
