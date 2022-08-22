class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] a=new int[2];
        HashMap<Integer,Integer> sum= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(sum.containsKey(target -nums[i])){
                a[0]=i;
                a[1]=sum.get(target-nums[i]);
                break;
            }
            sum.put(nums[i],i);
        }
        return a;
    }
}