class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashSet <Integer> hie=new HashSet<>();
    for(int n:nums){
        if(hie.contains(n))
            return true;
        hie.add(n);
    }
    return false;
}
}