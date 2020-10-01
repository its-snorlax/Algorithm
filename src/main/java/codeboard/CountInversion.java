package codeboard;

public class CountInversion {
    int getInvCount(int[] arr) {
        int totalInversions = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (max > arr[j]) {
                    totalInversions++;
                }
            }
        }
        return totalInversions;
    }
}
