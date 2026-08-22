class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0, product=1;
        int m=n;
        while(n>0){
          int total=n%10;
          n=n/10;
          sum=sum+total;
          product=product*total;
        }
        if(m%(sum+product)==0) return true;
        else return false;
    }
}