package coursera.week2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StackTest {

    @Test
    public void shouldPushElementsIntoTheStack() {
        Stack<String> stack = new Stack<>();
        stack.push("prayas");
        stack.push("is");
        stack.push("this");
        stack.push("hello");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("hello");
        expected.add("this");
        expected.add("is");
        expected.add("prayas");

        Assert.assertEquals(expected, stack.iteration());
    }

    @Test
    public void shouldPopElementCorrectly() {
        Stack<String> stack = new Stack<>();
        stack.push("prayas");
        stack.push("is");
        stack.pop();
        stack.push("this");
        stack.push("hello");
        stack.pop();

        ArrayList<String> expected = new ArrayList<>();
        expected.add("this");
        expected.add("prayas");

        Assert.assertEquals(expected, stack.iteration());
    }

    @Test
    public void shouldReturnTrueIfStackIsNotEmpty() {
        Stack<String> stack = new Stack<>();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void shouldReturnFalseIfStackIsEmpty() {
        Stack<String> stack = new Stack<>();
        stack.push("hello");
        Assert.assertFalse(stack.isEmpty());
    }
}