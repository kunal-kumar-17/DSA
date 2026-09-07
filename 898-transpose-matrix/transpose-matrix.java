class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        int [][]temp=new int[column][row];
        for(int r=0;r<row;r++){
            for(int c=0;c<column;c++){
                temp[c][r]=matrix[r][c];
            }
        }
        return temp;
    }
}