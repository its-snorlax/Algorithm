//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
package leetCode;

public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        if (nums.length == 0) return false;
        if (nums.length == 1) return nums[0] == target;
        int pivot = 0;
        while (pivot < nums.length-1 && nums[pivot] <= nums[pivot + 1]) pivot++;

        if (target >= nums[0] && target <= nums[pivot]) {
            return binarySearch(0, pivot, nums, target);
        }
        else {
            return binarySearch(pivot + 1, nums.length - 1, nums, target);
        }
    }

    public boolean binarySearch(int start, int end, int[] nums, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
