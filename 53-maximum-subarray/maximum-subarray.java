class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int maxsum=nums[0];
        int currentsum =0; 
        for (int i=0;i<n;i++){
            
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            
            maxsum=Math.max(currentsum,maxsum);
            
        }
        
        return maxsum;
    }
}