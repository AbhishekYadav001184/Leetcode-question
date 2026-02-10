import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current)); // store one subset
            return;
        }

        // choice 1: do NOT take nums[index]
        backtrack(index + 1, nums, current, result);

        // choice 2: take nums[index]
        current.add(nums[index]);
        backtrack(index + 1, nums, current, result);

        // undo choice (backtrack)
        current.remove(current.size() - 1);
    }
}
