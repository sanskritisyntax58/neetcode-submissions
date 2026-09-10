class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
                List<List<Integer>> result = new ArrayList<>();
                        backtrack(0, target, candidates, new ArrayList<>(), result);
                                return result;
                                    }

                                        private void backtrack(int index, int target, int[] candidates,
                                                                   List<Integer> current,
                                                                                              List<List<Integer>> result) {

                                                                                                      // Target achieved
                                                                                                              if (target == 0) {
                                                                                                                          result.add(new ArrayList<>(current));
                                                                                                                                      return;
                                                                                                                                              }

                                                                                                                                                      // No more elements / target exceeded
                                                                                                                                                              if (index == candidates.length || target < 0) {
                                                                                                                                                                          return;
                                                                                                                                                                                  }

                                                                                                                                                                                          // Take current element
                                                                                                                                                                                                  current.add(candidates[index]);
                                                                                                                                                                                                          backtrack(index, target - candidates[index],
                                                                                                                                                                                                                            candidates, current, result);

                                                                                                                                                                                                                                    // Undo choice
                                                                                                                                                                                                                                            current.remove(current.size() - 1);

                                                                                                                                                                                                                                                    // Don't take current element
                                                                                                                                                                                                                                                            backtrack(index + 1, target,
                                                                                                                                                                                                                                                                              candidates, current, result);
                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                  }

