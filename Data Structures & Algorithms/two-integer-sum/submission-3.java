class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap <Integer,Integer> hie= new HashMap<>();
    for(int i=0;i<nums.length;i++){
    int n=target-nums[i];
    if(hie.containsKey(n))
        return new int[] {hie.get(n),i};
    else
        hie.put(nums[i],i);
    }
    return new int[] {};
}
}
