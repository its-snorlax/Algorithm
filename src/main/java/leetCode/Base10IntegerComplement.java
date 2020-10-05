//https://leetcode.com/problems/complement-of-base-10-integer/
package leetCode;

public class Base10IntegerComplement {
    public int bitwiseComplement(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '0') stringBuilder.append('1');
            if (c == '1') stringBuilder.append('0');
        }
        int decimalOnesComplement = 0;
        for (char c : stringBuilder.toString().toCharArray()) {
            int bit = Integer.parseInt(c + "");
            decimalOnesComplement = 2 * decimalOnesComplement;
            decimalOnesComplement += bit;
        }
        return decimalOnesComplement;
    }
}
