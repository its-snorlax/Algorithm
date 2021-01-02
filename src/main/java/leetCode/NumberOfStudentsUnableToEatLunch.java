//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
package leetCode;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] a = {0, 0};
        for (int student : students) a[student] += 1;
        int k = 0;
        while (k < sandwiches.length) {
            if (a[sandwiches[k]] > 0) {
                a[sandwiches[k++]]--;
            } else {
                break;
            }
        }
        return sandwiches.length - k;
    }
}
