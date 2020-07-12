package coursera.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stack<T> {

    private StackNode<T> top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T item) {
        top = new StackNode<T>(item, top);
    }

    public T pop() {
        T poppedData = top.getData();
        top = top.next;
        return poppedData;
    }

    public List<T> iteration() {
        if (isEmpty()) {
            return Collections.emptyList();
        }
        StackNode<T> top = this.top;
        List<T> list = new ArrayList<>();
        while (top != null) {
            list.add(top.getData());
            top = top.next;
        }
        return list;
    }

    public T peek() {
        return top.getData();
    }

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data, StackNode<T> oldFirst) {
            this.data = data;
            this.next = oldFirst;
        }

        public T getData() {
            return data;
        }
    }
}
