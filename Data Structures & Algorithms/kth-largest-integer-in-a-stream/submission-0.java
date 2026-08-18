class KthLargest {
    private final PriorityQueue<Integer> minHeap;
    private final int k;

    // Step 1: Initialize the Min-Heap
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        
        // Add all elements from the initial array
        for (int num : nums) {
            add(num);
        }
    }
    
    // Step 2: Add incoming stream values and maintain size k
    public int add(int val) {
        minHeap.offer(val);
        
        // If heap size exceeds k, pop the smallest element
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        
        // The root of the min-heap is the kth largest element
        return minHeap.peek();
    }
}
