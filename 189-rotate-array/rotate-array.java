class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;

        k=k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int []arr,int st,int ei){
        while(st<ei){
            int temp=arr[st];
            arr[st]=arr[ei];
            arr[ei]=temp;

            st++;ei--;
        }
    }
}