
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        // FIXED: Start from 1 instead of 0, because the problem asks for combinations from 1 to n
        solve(1, n, k, temp);
        return res;
    }

    public void solve(int start, int n, int k, List<Integer> temp) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (start > n) {
            return;
        }

        // Option 1: Pick the current element
        temp.add(start);
        solve(start + 1, n, k, temp); // FIXED: Keep k constant

        // Backtrack
        temp.remove(temp.size() - 1);

        // Option 2: Don't pick the current element
        solve(start + 1, n, k, temp); // FIXED: Replaced semicolon with comma, kept k constant
    }
}
