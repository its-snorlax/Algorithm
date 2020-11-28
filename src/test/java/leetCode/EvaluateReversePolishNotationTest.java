package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvaluateReversePolishNotationTest {
    @Test
    public void sample1() {
        String[] input = {"2", "1", "+", "3", "*"};
        assertEquals(9, new EvaluateReversePolishNotation().evalRPN(input));
    }

    @Test
    public void sample2() {
        String[] input = {"4", "13", "5", "/", "+"};
        assertEquals(6, new EvaluateReversePolishNotation().evalRPN(input));
    }

    @Test
    public void sample3() {
        String[] input = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(22, new EvaluateReversePolishNotation().evalRPN(input));
    }

    @Test
    public void sample4() {
        String[] input = {"-78", "-33", "196", "+", "-19", "-", "115", "+", "-", "-99", "/", "-18", "8", "*", "-86", "-", "-", "16", "/", "26", "-14", "-", "-", "47", "-", "101", "-", "163", "*", "143", "-", "0", "-", "171", "+", "120", "*", "-60", "+", "156", "/", "173", "/", "-24", "11", "+", "21", "/", "*", "44", "*", "180", "70", "-40", "-", "*", "86", "132", "-84", "+", "*", "-", "38", "/", "/", "21", "28", "/", "+", "83", "/", "-31", "156", "-", "+", "28", "/", "95", "-", "120", "+", "8", "*", "90", "-", "-94", "*", "-73", "/", "-62", "/", "93", "*", "196", "-", "-59", "+", "187", "-", "143", "/", "-79", "-89", "+", "-"};
        assertEquals(165, new EvaluateReversePolishNotation().evalRPN(input));
    }
}