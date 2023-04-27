package queue;

public class MyQueue <T> {

        private Node<T> head;
        private Node<T> tail;
        private int size;

        public void add(T value) {
            Node<T> newNode = new Node<>(value);
            if (tail != null) {
                tail.next = newNode;
            }
            tail = newNode;
            if (head == null) {
                head = tail;
            }
            size++;
        }

        public void clear() {
            head = null;
            tail = null;
            size = 0;
        }

        public int size() {
            return size;
        }

        public T peek() {
            if (head == null) {
                return null;
            }
            return head.value;
        }

        public T poll() {
            if (head == null) {
                return null;
            }
            T value = head.value;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return value;
        }

        private static class Node<T> {
            private T value;
            private Node<T> next;

            public Node(T value) {
                this.value = value;
            }
        }


}
