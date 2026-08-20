class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length; 
        int minDistance = Integer.MAX_VALUE;
        int startIndex = -1;
        for(int i = 0; i<=n-k; i++){

            int sum = 0;

            for(int j = i; j<i+k; j++){
                sum += Math.abs(arr[j] - x);
            }

            if(sum < minDistance){
                minDistance = sum;
                startIndex = i;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = startIndex; i<startIndex+k; i++){
            ans.add(arr[i]);
        }
    return ans;
    }
}