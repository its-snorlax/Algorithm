package coursera.week2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Queue<T> {

    private QueueNode<T> front;
    private QueueNode<T> last;

    public Queue() {
        front = null;
        last = null;
    }

    public boolean isEmpty() {
        return front == null && last == null;
    }

    public List<T> iteration() {
        if (isEmpty()) {
            return Collections.emptyList();
        }
        List<T> list = new ArrayList<>();
        QueueNode<T> front = this.front;
        while (front != null) {
            list.add(front.getData());
            front = front.next;
        }
        return list;
    }

    public void enqueue(T item) {
        if (isEmpty()) {
            QueueNode<T> newNode = new QueueNode<T>(item, null);
            front = newNode;
            last = newNode;
        } else {
            QueueNode<T> newNode = new QueueNode<T>(item, null);
            last.next = newNode; // this is previous last
            last = newNode;  // now we are updating last
        }
    }

    public void dequeue() {
        front = front.next;
    }

    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data, QueueNode<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
    }
}
