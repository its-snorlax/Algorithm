package leetCode;

import java.util.Collections;
import java.util.PriorityQueue;

public class SellDiminishingValuedColoredBalls {
    public int maxProfit(int[] inventory, int orders) {
        if (inventory.length == 0) return 0;

        long maxProfit = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : inventory) queue.add(i);

        while (orders > 0) {
            Integer peekItem = queue.remove();
            maxProfit = (maxProfit + peekItem) % 1000000007;
            queue.add(peekItem - 1);
            orders--;
        }
        return (int) maxProfit;
    }
}