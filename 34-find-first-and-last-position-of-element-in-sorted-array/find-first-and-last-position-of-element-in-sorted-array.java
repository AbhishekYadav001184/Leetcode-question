class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int st=0;
        int e=n-1;
        int first=-1;
        int last=-1;

        while(st<=e){
            int mid=st+(e-st)/2;
            

            if(target==nums[mid]){
                first=mid;
                e=mid-1;
                
            }
            else if(target>nums[mid]){
                st=mid+1;
            }
            else{
                e=mid-1;
            }
        }

         st=0 ;
         e=n-1;

        while(st<=e){
            int mid=st + (e-st)/2;
            if(target==nums[mid]){
                last=mid;
                st=mid+1;
            }
            else if(target>nums[mid]){
                st=mid+1;

            }
            else{
                e=mid-1;
            }
        }
        
        return new int[]{first,last};
    }
}