package queue;

public class QueueTest {

        public static void main(String[] args) {
            MyQueue<String> queue = new MyQueue<>();
            queue.add("Java");
            queue.add("Python");
            queue.add("JavaScript");

            System.out.println("Queue size: " + queue.size());
            System.out.println("First element: " + queue.peek());

            System.out.println("Removing first element: " + queue.poll());
            System.out.println("Queue size: " + queue.size());

            System.out.println("Removing all elements...");
            queue.clear();
            System.out.println("Queue size: " + queue.size());
        }

}
