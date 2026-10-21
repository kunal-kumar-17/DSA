class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ans=0;
        int num=x;
        while(x!=0){
            ans*=10;
            ans+=x%10;
            x/=10;
        }
        if(num==ans){
            return true;
        }
        return false;
    }
}