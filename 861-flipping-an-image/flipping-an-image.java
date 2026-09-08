class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      for(int i=0;i<image.length;i++){
        for(int j=0;j<image[0].length;j++){
            if(image[i][j]==0){
                image[i][j]=1;
            }else{
                image[i][j]=0;
            }
        }
        int k=0;
        int l=image[0].length-1;
        while(k<=l){
            int temp=image[i][k];
            image[i][k]=image[i][l];
            image[i][l]=temp;
            k++;
            l--;
        }
      }  
      return image;
    }
}