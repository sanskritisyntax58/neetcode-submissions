class Solution {
        public int[][] kClosest(int[][] points, int k) {

                // Max heap based on distance
                        PriorityQueue<int[]> pq = new PriorityQueue<>(
                                    (a, b) -> distance(b) - distance(a)
                                            );

                                                    for (int[] point : points) {

                                                                pq.offer(point);

                                                                            // Keep only k closest points
                                                                                        if (pq.size() > k) {
                                                                                                        pq.poll();
                                                                                                                    }
                                                                                                                            }

                                                                                                                                    int[][] ans = new int[k][2];

                                                                                                                                            for (int i = 0; i < k; i++) {
                                                                                                                                                        ans[i] = pq.poll();
                                                                                                                                                                }

                                                                                                                                                                        return ans;
                                                                                                                                                                            }

                                                                                                                                                                                private int distance(int[] point) {
                                                                                                                                                                                        int x = point[0];
                                                                                                                                                                                                int y = point[1];

                                                                                                                                                                                                        return x * x + y * y;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            }
