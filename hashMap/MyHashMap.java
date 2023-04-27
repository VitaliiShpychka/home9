package hashMap;
public class MyHashMap {
    private Node[] nodes;
    private int size;

    private static class Node {
        private Object key;
        private Object value;
        private Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        nodes = new Node[16];
    }

    public void put(Object key, Object value) {
        int hash = key.hashCode() % nodes.length;
        Node node = nodes[hash];

        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = nodes[hash];
        nodes[hash] = newNode;
        size++;

        if (size == nodes.length) {
            resize();
        }
    }

    public Object get(Object key) {
        int hash = key.hashCode() % nodes.length;
        Node node = nodes[hash];

        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }

        return null;
    }

    public void remove(Object key) {
        int hash = key.hashCode() % nodes.length;
        Node node = nodes[hash];
        Node prevNode = null;

        while (node != null) {
            if (node.key.equals(key)) {
                if (prevNode == null) {
                    nodes[hash] = node.next;
                } else {
                    prevNode.next = node.next;
                }
                size--;
                return;
            }
            prevNode = node;
            node = node.next;
        }
    }

    public void clear() {
        nodes = new Node[16];
        size = 0;
    }

    public int size() {
        return size;
    }

    private void resize() {
        Node[] oldNodes = nodes;
        nodes = new Node[2 * oldNodes.length];
        size = 0;

        for (Node node : oldNodes) {
            while (node != null) {
                put(node.key, node.value);
                node = node.next;
            }
        }
    }
}

