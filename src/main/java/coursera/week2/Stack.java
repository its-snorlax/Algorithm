package coursera.week2;

public class Stack {

    private StackNode top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(String item) {
        top = new StackNode(item, top);
    }

    public String pop() {
        String poppedData = top.getData();
        top = top.next;
        return poppedData;
    }

    public String iteration() {
        StackNode top = this.top;
        StringBuilder stringBuilder = new StringBuilder();
        while (top != null) {
            stringBuilder.append(top.getData()).append(" ");
            top = top.next;
        }
        return stringBuilder.toString();
    }

    private static class StackNode {
        private String data;
        private StackNode next;

        public StackNode(String data, StackNode oldFirst) {
            this.data = data;
            this.next = oldFirst;
        }

        public String getData() {
            return data;
        }
    }
}
