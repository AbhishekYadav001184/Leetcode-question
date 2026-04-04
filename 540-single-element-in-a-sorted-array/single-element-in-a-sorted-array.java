class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int st=0;
        int e=n-1;
        
        while(st<e){
            int mid= st+(e-st)/2;

            if(mid%2==1){
                mid--;
            }

            if(nums[mid]==nums[mid+1]){
                st=mid+2;
            }
            else{
                e=mid;

            }
        }
        return nums[st];
    }
}