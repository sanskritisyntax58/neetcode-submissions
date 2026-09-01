class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        dfs(0, nums, subset, res);
        return res;
    }

    private void dfs(int i, int[] nums, List<Integer> subset, List<List<Integer>> res) {
        // Base case: if we have made a choice for every element
        if (i >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        // Decision to include nums[i]
        subset.add(nums[i]);
        dfs(i + 1, nums, subset, res);

        // Decision NOT to include nums[i] (Backtrack)
        subset.remove(subset.size() - 1);
        dfs(i + 1, nums, subset, res);
    }
}
