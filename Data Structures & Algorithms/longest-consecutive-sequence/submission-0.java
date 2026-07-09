class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        int longest = 0;
        for(int num : nums) {
            if(!set.contains(num-1)) {
                int streak = 1;
                while(set.contains(num+streak))
                    streak++;
                longest = Math.max(longest, streak);
            }
        }
        return longest;
    }
}
