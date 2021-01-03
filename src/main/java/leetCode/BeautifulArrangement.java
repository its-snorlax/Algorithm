package leetCode;

public class BeautifulArrangement {
    int result = 0;

    public int countArrangement(int n) {
        int[] nums = new int[n + 1];
        for (int i=1; i<=n; i++) nums[i] = i;
        helper(nums,n);
        return result;
    }

    private void helper(int[] nums, int val) {
        if (val == 0) {
            result++;
            return;
        }
        for (int i=val; i>0; i--) {
            swap(nums,i,val);
            if (nums[val]%val == 0 || val%nums[val] == 0) {
                helper(nums,val-1);
            }
            swap(nums,i,val);
        }
    }

    private void swap(int[] nums, int i, int val) {
        int temp = nums[i];
        nums[i] = nums[val];
        nums[val] = temp;
    }
}
