package coursera.week2;


public class Queue {

    private QueueNode front;
    private QueueNode last;

    public Queue() {
        front = null;
        last = null;
    }

    public boolean isEmpty() {
        return front == null && last == null;
    }

    public String iteration() {
        StringBuilder stringBuilder = new StringBuilder();
        QueueNode front = this.front;
        while (front != null) {
            stringBuilder.append(front.getData()).append(" ");
            front = front.next;
        }
        return stringBuilder.toString();
    }

    public void enqueue(String item) {
        if (isEmpty()) {
            QueueNode newNode = new QueueNode(item, null);
            front = newNode;
            last = newNode;
        } else {
            QueueNode newNode = new QueueNode(item, null);
            last.next = newNode; // this is previous last
            last = newNode;  // now we are updating last
        }
    }

    public void dequeue() {
        front = front.next;
    }

    private static class QueueNode {
        private String data;
        private QueueNode next;

        public QueueNode(String data, QueueNode next) {
            this.data = data;
            this.next = next;
        }

        public String getData() {
            return data;
        }
    }
}
