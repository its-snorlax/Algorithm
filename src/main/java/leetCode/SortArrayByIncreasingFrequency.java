package leetCode;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        int[] output = new int[nums.length];
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int num : nums) {
            if (!hashmap.containsKey(num)) {
                hashmap.put(num, 1);
            } else {
                hashmap.put(num, hashmap.get(num) + 1);
            }
        }
        ArrayList<List<Integer>> valueWithFreq = new ArrayList<>();

        for (Map.Entry<Integer, Integer> integerIntegerEntry : hashmap.entrySet()) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(integerIntegerEntry.getKey());
            list.add(integerIntegerEntry.getValue());
            valueWithFreq.add(list);
        }

        valueWithFreq.sort((List<Integer> o1, List<Integer> o2) -> {
            if (o1.get(1) < o2.get(1)) return -1;
            if (o1.get(1).equals(o2.get(1))) {
                if (o1.get(0) > o2.get(0)) return -1;
                else return 1;
            }
            return 1;
        });
        int i = 0;
        for (List<Integer> integers : valueWithFreq) {
            Integer value = integers.get(0);
            Integer freq = integers.get(1);
            for (int j = 0; j < freq; j++) {
                output[i] = value;
                i++;
            }
        }
        return output;
    }
}
