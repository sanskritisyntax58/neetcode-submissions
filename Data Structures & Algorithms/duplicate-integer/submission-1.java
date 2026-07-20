class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashSet <Integer> hi=new HashSet<>();
    int count=0;
    for(int i:nums){
    if(hi.contains(i))
        count++;
    else
        hi.add(i);
    }
    if(count>0)
        return true;
    else
        return false;
}
}