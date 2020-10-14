package leetCode;

public class HouseRobber2 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }

    private int rob(int[] nums, int start, int end) {
        int max = 0;
        int previousOne = 0;
        int previousTwo = 0;
        for (int i = start; i < end; i++) {
            max = Math.max(previousOne, previousTwo + nums[i]);
            previousTwo = previousOne;
            previousOne = max;
        }
        return max;
    }
}
