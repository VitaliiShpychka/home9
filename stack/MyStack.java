package stack;
import java.util.NoSuchElementException;

public class MyStack {
    private Node top;
    private int size;

    public void push(Object value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
        size++;
    }

    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Object value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.value;
    }

    public int size() {
        return size;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            pop();
        } else {
            Node prev = null;
            Node curr = top;
            for (int i = 0; i < index; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            size--;
        }
    }

    private static class Node {
        private final Object value;
        private Node next;

        public Node(Object value) {
            this.value = value;
        }
    }
}
