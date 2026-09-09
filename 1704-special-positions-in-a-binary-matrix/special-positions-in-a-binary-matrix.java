class Solution {
    public int numSpecial(int[][] mat) {
        int ans=0;
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
              if(mat[i][j]==1){
                int row=0;
                int col=0;
               for(int k=0;k<m;k++){
                if(mat[k][j]==1){
                    row++;
                }
               }
               for(int k=0;k<n;k++){
                if(mat[i][k]==1){
                    col++;
                }
               }
               if(row==1 && col==1){
                ans++;
               }
              } 
            }
        }
        return ans;
    }
}