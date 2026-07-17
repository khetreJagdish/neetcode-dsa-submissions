class NumMatrix {

    int prefix[][];
    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        this.prefix = new int[n][m];

        for(int row = 0; row < n; row++){

            for(int col = 0; col < m; col++){

                int top = row > 0 ? prefix[row-1][col] : 0;
                int left = col > 0 ? prefix[row][col-1] : 0;
                int topLeft = (row > 0 && col > 0) ? prefix[row-1][col-1]:0;

                prefix[row][col] = matrix[row][col]+top+left-topLeft;
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        for(int i = row1; i<=row2; i++){

            for(int j = col1; j<= col2; j++){

                int total = prefix[row2][col2];
                int top = row1 > 0 ? prefix[row1-1][col2] : 0;
                int left = col1 > 0 ? prefix[row2][col1-1]: 0;
                int topLeft = (row1 > 0 && col1 > 0) ? prefix[row1-1][col1-1] : 0;

                return total - top - left + topLeft;
            }
        }
    return 0;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */