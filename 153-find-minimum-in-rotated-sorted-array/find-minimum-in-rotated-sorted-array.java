class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int st=0;
        int e=n-1;
        int low=Integer.MAX_VALUE;

        while(st<=e){
            int mid=st +(e-st)/2;

            

            if(nums[st]<=nums[mid]){
                low=Math.min(nums[st],low);
                st=mid+1;
            }
            else{
                low =Math.min(low,nums[mid]);
                e=mid-1;
            }

           
        }       
        return low;
    }
}