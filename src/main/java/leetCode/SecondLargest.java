package leetCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

public class SecondLargest {
    public int secondLargest(int[] inputs) {
        HashSet<Integer> set = new HashSet<>();
        int pos = 0;
        int[] noDuplicates = new int[inputs.length];
        for (int input : inputs) {
            if (!set.contains(input)) {
                set.add(input);
                noDuplicates[pos++] = input;
            }
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < pos; i++) {
            queue.add(noDuplicates[i]);
        }
        queue.poll();
        return queue.peek();
    }
}
