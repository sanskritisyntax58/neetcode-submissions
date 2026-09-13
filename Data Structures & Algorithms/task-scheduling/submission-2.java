class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        // Count frequency of each task
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        int maxFreq = 0;

        // Find maximum frequency
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        int countMax = 0;

        // Count how many tasks have maximum frequency
        for (int f : freq) {
            if (f == maxFreq) {
                countMax++;
            }
        }

        int result = (maxFreq - 1) * (n + 1) + countMax;

        return Math.max(tasks.length, result);
    }
}