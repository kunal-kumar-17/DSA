class Solution {
    public int countDigits(int num) {
        int num2=num;
        int count=0;
        while(num2!=0){
         int div=num2%10;
         if(num%div==0){
            count++;
         }
         num2/=10;
        }
        return count;
    }
}