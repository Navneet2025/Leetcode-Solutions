class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        
        rev(nums,nums.length-k,nums.length-1);
        rev(nums,0,nums.length-1-k);
        rev(nums,0,nums.length-1);
        
        
        
    }
    public void rev(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            
            start++;
            end--;
        }
    }
}