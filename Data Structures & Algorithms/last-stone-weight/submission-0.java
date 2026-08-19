class Solution {
    public int lastStoneWeight(int[] stones) {

            PriorityQueue<Integer> maxHeap =
                        new PriorityQueue<>(Collections.reverseOrder());

                                // Add all stones
                                        for (int stone : stones) {
                                                    maxHeap.offer(stone);
                                                            }

                                                                    // Smash two heaviest stones
                                                                            while (maxHeap.size() > 1) {

                                                                                        int y = maxHeap.poll(); // heaviest
                                                                                                    int x = maxHeap.poll(); // second heaviest

                                                                                                                if (x != y) {
                                                                                                                                maxHeap.offer(y - x);
                                                                                                                                            }
                                                                                                                                                    }

                                                                                                                                                            // If heap is empty → 0
                                                                                                                                                                    // Otherwise → remaining stone
                                                                                                                                                                            return maxHeap.isEmpty() ? 0 : maxHeap.peek();
                                                                                                                                                                                }
                                                                                                                                                                                }
