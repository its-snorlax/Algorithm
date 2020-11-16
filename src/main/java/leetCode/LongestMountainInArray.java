package leetCode;

public class LongestMountainInArray {
    public int longestMountain(int[] input) {
        int longestMountain = 0;
        for (int peakIndex = 1; peakIndex < input.length - 1; peakIndex++)
            if (input[peakIndex] > input[peakIndex - 1] &&
                    input[peakIndex] > input[peakIndex + 1]) {
                int right = peakIndex;
                int left = peakIndex;

                while (left > 0 && input[left-1] < input[left]) left--;
                while (right < input.length - 1 && input[right+1] < input[right]) right++;
                longestMountain = Math.max(longestMountain, (right - left) + 1);
            }
        return longestMountain;
    }
}
