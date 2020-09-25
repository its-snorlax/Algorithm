package codeboard;

import java.util.PriorityQueue;

public class NthLargest {
    static int findNthLargest(int[] array, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : array) {
            queue.add(i);
            if (queue.size() > n) {
                queue.remove();
            }
        }
        return queue.peek();
    }
}
