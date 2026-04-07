class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int st=0;
        int e=n-1;
        while(st<e){
            int mid= st + (e-st)/2;

            if(nums[mid]>nums[mid+1]){
                e=mid;
            }
            else{
                st=mid+1;
            }
           
           
        }
        return st;
    }
}