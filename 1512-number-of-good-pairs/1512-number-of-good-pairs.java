class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
             HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
             if(set.add(nums[i]))
             {
                int n = map.get(nums[i]);
                sum += (n*(n-1))/2;
             }
        }
        
        return sum;
        
    }
}