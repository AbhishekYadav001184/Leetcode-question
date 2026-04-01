class Solution {
    public boolean search(int[] nums, int target) {
        int n =nums.length;
        int st=0;
        int e=n-1;
        while (st<=e){
            int mid=st +(e-st)/2;

            if(target==nums[mid]){
                return true;
            }

            
            if(nums[st]==nums[mid] && nums[mid]==nums[e]){
                st++;
                e--;
            }
            else if(nums[st]<=nums[mid]){
                    if(nums[st]<=target && target<nums[mid]) {
                        e=mid-1;
                    }
                    else{
                        st=mid+1;
                    }
                
            }


            else{
                if(nums[mid]<target && target<=nums[e]){
                    st=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return false;
    }
}