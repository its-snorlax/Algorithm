package coursera.week2;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void shouldPushElementsIntoTheStack() {
        Stack stack = new Stack();
        stack.push("prayas");
        stack.push("is");
        stack.push("this");
        stack.push("hello");
        Assert.assertEquals("hello this is prayas ", stack.iteration());
    }

    @Test
    public void shouldPopElementCorrectly() {
        Stack stack = new Stack();
        stack.push("prayas");
        stack.push("is");
        stack.pop();
        stack.push("this");
        stack.push("hello");
        stack.pop();
        Assert.assertEquals("this prayas ", stack.iteration());
    }

    @Test
    public void shouldReturnTrueIfStackIsNotEmpty() {
        Stack stack = new Stack();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void shouldReturnFalseIfStackIsEmpty() {
        Stack stack = new Stack();
        stack.push("hello");
        Assert.assertFalse(stack.isEmpty());
    }
}