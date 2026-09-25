class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = (rows*col)-1;

        while(left <= right){
            int mid = left + (right - left)/2;
            int row = mid / col;
            int column = mid % col;
            if(matrix[row][column] == target){
                return true;
            }else if(matrix[row][column] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
    return false;
    }
}
