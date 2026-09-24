class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            int ans=0;
            while(number!=0){
             int sum=number%10;
              ans+=sum;
              number/=10;
            }
            if(ans==i){
                return ans;
            }
        }
        return -1;
    }
}