class Solution {
    
    
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int n = heights.length;
        int right = n-1;

        while(left <= right){
            int currArea = (right-left) * Math.min(heights[left],heights[right]);
            maxArea = Math.max(currArea,maxArea);

            if(heights[left]< heights[right]){
                left++;
    
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
