package coursera.week2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class QueueTest {
    @Test
    public void insertElementInQueueCorrectly() {
        Queue<String> queue = new Queue<>();
        queue.enqueue("hello");
        queue.enqueue("this");
        queue.enqueue("is");
        queue.enqueue("prayas");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("hello");
        expected.add("this");
        expected.add("is");
        expected.add("prayas");

        Assert.assertEquals(expected, queue.iteration());
    }

    @Test
    public void deleteElementFromQueueCorrectly() {
        Queue<String> queue = new Queue<>();
        queue.enqueue("hello");
        queue.enqueue("this");
        queue.dequeue();
        queue.enqueue("is");
        queue.enqueue("prayas");
        queue.dequeue();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("is");
        expected.add("prayas");
        Assert.assertEquals(expected, queue.iteration());
    }

    @Test
    public void shouldReturnTrueWhenQueueIsEmpty() {
        Queue<String> queue = new Queue<>();
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void shouldReturnFalseWhenQueueIsNotEmpty() {
        Queue<String> queue = new Queue<>();
        queue.enqueue("hello");
        Assert.assertFalse(queue.isEmpty());
    }
}