class Solution {
    public int maxProduct(int n) {
        int max1=-1, max2=-1;
        int max;
        while(n>0){
            int d=n%10;

            if (d>max1){
                max2=max1;
                max1=d;
            }
            else if (d>max2){
                max2=d;
            }
            n/=10;
        }
        max= max1*max2;
        return max;
    }
}