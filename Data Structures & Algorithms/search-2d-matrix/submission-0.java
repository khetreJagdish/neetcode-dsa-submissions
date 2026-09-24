class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int numberOfRows = matrix.length;
        int numberOfColumns = matrix[0].length;

        for(int i = 0; i<numberOfRows; i++){

            for(int j = 0; j<numberOfColumns;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
