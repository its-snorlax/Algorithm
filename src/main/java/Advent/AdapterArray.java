package Advent;

import java.util.Arrays;
import java.util.HashMap;

public class AdapterArray {
    public static void main(String[] args) {
        String in = "48\n" +
                "171\n" +
                "156\n" +
                "51\n" +
                "26\n" +
                "6\n" +
                "80\n" +
                "62\n" +
                "65\n" +
                "82\n" +
                "130\n" +
                "97\n" +
                "49\n" +
                "31\n" +
                "142\n" +
                "83\n" +
                "75\n" +
                "20\n" +
                "154\n" +
                "119\n" +
                "56\n" +
                "114\n" +
                "92\n" +
                "33\n" +
                "140\n" +
                "74\n" +
                "118\n" +
                "1\n" +
                "96\n" +
                "44\n" +
                "128\n" +
                "134\n" +
                "121\n" +
                "64\n" +
                "158\n" +
                "27\n" +
                "17\n" +
                "101\n" +
                "59\n" +
                "12\n" +
                "89\n" +
                "88\n" +
                "145\n" +
                "167\n" +
                "11\n" +
                "3\n" +
                "39\n" +
                "43\n" +
                "105\n" +
                "16\n" +
                "170\n" +
                "63\n" +
                "111\n" +
                "2\n" +
                "108\n" +
                "21\n" +
                "146\n" +
                "77\n" +
                "45\n" +
                "52\n" +
                "32\n" +
                "127\n" +
                "147\n" +
                "76\n" +
                "58\n" +
                "37\n" +
                "86\n" +
                "129\n" +
                "57\n" +
                "133\n" +
                "120\n" +
                "163\n" +
                "138\n" +
                "161\n" +
                "139\n" +
                "71\n" +
                "9\n" +
                "141\n" +
                "168\n" +
                "164\n" +
                "124\n" +
                "157\n" +
                "95\n" +
                "25\n" +
                "38\n" +
                "69\n" +
                "87\n" +
                "155\n" +
                "135\n" +
                "15\n" +
                "102\n" +
                "70\n" +
                "34\n" +
                "42\n" +
                "24\n" +
                "50\n" +
                "68\n" +
                "169\n" +
                "10\n" +
                "55\n" +
                "117\n" +
                "30\n" +
                "81\n" +
                "151\n" +
                "100\n" +
                "162\n" +
                "148";
        int[] inputs = Arrays.stream(in.split("\n"))
                .map(Integer::parseInt)
                .mapToInt(value -> value).toArray();
        Arrays.sort(inputs);
        System.out.println(partOne(inputs));
    }

    private static int partOne(int[] inputs) {
        int oneDiff = 0;
        int threeDiff = 1;
        int lastJolt = 0;
        for (int input : inputs) {
            if (input - lastJolt == 1) oneDiff++;
            if (input - lastJolt == 3) threeDiff++;
            lastJolt = input;
        }
        return oneDiff * threeDiff;
    }
}
