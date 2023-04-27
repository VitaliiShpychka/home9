package linkedList;

import java.util.LinkedList;

public class NodeTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addLast("B");
        linkedList.addLast("C");
        linkedList.addLast("D");
        linkedList.addLast("E");
        System.out.println("MyLL: " + linkedList);

        linkedList.addFirst("A");
        System.out.println("MyLL: " + linkedList);

        System.out.println("Element 2 of MyLL: " + linkedList.get(2));

        linkedList.remove("B");
        System.out.println("MyLL: " + linkedList);

        System.out.println("The size of MyLL is: " + linkedList.size());

        linkedList.clear();
        System.out.println("The size of MyLL is: " + linkedList.size());
    }
}
