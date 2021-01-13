//https://leetcode.com/problems/boats-to-save-people/
package leetCode;

import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        if (people.length == 0) return 0;
        int quantity = people.length;
        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;

        while (i < j) {
            if (people[i]+people[j] <= limit) {
                i++;
                quantity--;
            }
            j--;
        }

        return quantity;
    }
}
