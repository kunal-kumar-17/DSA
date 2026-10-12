class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length+1;i++){
            if(nums.length%i==0){
             int num=nums[i-1]*nums[i-1];
             ans+=num;
             num=0; 
            }
        }
        return ans;
    }
}