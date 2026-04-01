class Solution {
    public int findMin(int[] nums) {
      int n=nums.length;
      int low=Integer.MAX_VALUE;

      for(int i=0;i<n;i++){
        if(nums[i]<low){
            low=nums[i];
        }

      } 
      return low; 
    }
}