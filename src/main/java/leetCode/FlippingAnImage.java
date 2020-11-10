//https://leetcode.com/problems/flipping-an-image/
package leetCode;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] input) {
        for (int[] ints : input) {
            int start = 0;
            int end = ints.length - 1;
            while (start < end) {
                int temp = ints[start];
                ints[start] = ints[end];
                ints[end] = temp;
                convert(ints, start);
                convert(ints, end);
                start++;
                end--;
            }
            if (start == end) convert(ints, start);
        }
        return input;
    }

    private void convert(int[] ints, int start) {
        if (ints[start] == 1) ints[start] = 0;
        else ints[start] = 1;
    }
}
