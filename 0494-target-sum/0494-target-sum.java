
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, 0, target);
    }

    private int solve(int[] nums, int index, int target) {
        // Base case: all numbers processed
        if (index == nums.length) {
            return target == 0 ? 1 : 0;
        }

        // Choice 1: Add the current number
        int add = solve(
            nums, index + 1, target - nums[index]
        );

        // Choice 2: Subtract the current number
        int subtract = solve(
            nums, index + 1, target + nums[index]
        );

        return add + subtract;
    }
}
