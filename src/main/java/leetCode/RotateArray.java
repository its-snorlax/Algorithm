package leetCode;

public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        if (nums.length == 1) return nums;
        int[] temp = new int[nums.length];
        k = k % nums.length;
        for (int i=0; i<nums.length; i++) {
            int positionAfterRotation = k + i;
            if (positionAfterRotation < nums.length){
                temp[positionAfterRotation] = nums[i];
            } else {
                temp[positionAfterRotation - nums.length] = nums[i];
            }
        }
        return temp;
    }
}

