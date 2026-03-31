class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        // int st=0;
        // int e=n-1;
        for(int i=0;i<n;i++){
            // int mid=st + (e-st)/2;
            if(nums[i]==target){
                return i;
            }
            
            
        }
        return -1;
    }
}