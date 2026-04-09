class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int n=piles.length;
       int low=1;
       int high=piles[0];
       for(int i=0;i<n;i++){
        high=Math.max(high,piles[i]);
       } 

       while(low<=high){
            int mid=low +(high-low)/2;
            long  time=0;
            for(int j=0;j<n;j++){
                time +=(piles[j]+mid-1 )/mid;

            }
            if(time<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
       }
       return low;
    }
}