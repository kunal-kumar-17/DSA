class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int small = nums[0];
        int big = nums[0];
        int posl = 0;
        int posr = 0;
        for (int i=1;i<n;i++) {
            if(nums[i]<small) {
                small= nums[i];
                posl= i;
            }
            if(nums[i]>big) {
                big = nums[i];
                posr = i;
            }
        }
        int left= Math.max(posl, posr)+1;
        int right= n-Math.min(posl, posr);
        int both= Math.min(posl, posr)+ 1+ n- Math.max(posl, posr);
        return Math.min(left, Math.min(right,both));
    }
}