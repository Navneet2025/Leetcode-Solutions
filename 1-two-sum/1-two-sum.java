class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a= new int[2];
        
        for(int i=0;i<nums.length-1;i++){
            for(int  j=1+i;j<nums.length;j++){
                if(nums[j]==target- nums[i]){
                    a[0]=j;
                    a[1]=i;
                    
                    break;
                }
            }
        }
        
        return a;
    }
}