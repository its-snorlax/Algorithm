package coursera.week2;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
    @Test
    public void insertElementInQueueCorrectly() {
        Queue queue = new Queue();
        queue.enqueue("hello");
        queue.enqueue("this");
        queue.enqueue("is");
        queue.enqueue("prayas");
        Assert.assertEquals("hello this is prayas ", queue.iteration());
    }

    @Test
    public void deleteElementFromQueueCorrectly() {
        Queue queue = new Queue();
        queue.enqueue("hello");
        queue.enqueue("this");
        queue.dequeue();
        queue.enqueue("is");
        queue.enqueue("prayas");
        queue.dequeue();
        Assert.assertEquals("is prayas ", queue.iteration());
    }

    @Test
    public void shouldReturnTrueWhenQueueIsEmpty() {
        Queue queue = new Queue();
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void shouldReturnFalseWhenQueueIsNotEmpty() {
        Queue queue = new Queue();
        queue.enqueue("hello");
        Assert.assertFalse(queue.isEmpty());
    }
}