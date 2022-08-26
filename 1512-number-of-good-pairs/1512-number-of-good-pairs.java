class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int[] a = new int[100];
        
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]-1]++;
        }
        
        int sum=0;
        
        for(int i=0;i<100;i++)
        {
           int n = a[i];
           
           sum += (n * (n-1))/2; 
            
        }
        
        return sum;
        
        
        
    }
}