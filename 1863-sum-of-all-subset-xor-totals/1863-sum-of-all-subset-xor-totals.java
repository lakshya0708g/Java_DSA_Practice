class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums, 0, 0);
    }

    private int solve(int[] nums, int index, int xor) {
        if (index == nums.length) {
            return xor;
        }

        return solve(nums, index + 1, xor ^ nums[index])
             + solve(nums, index + 1, xor);
    }
}