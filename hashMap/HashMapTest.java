package hashMap;


public class HashMapTest {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        System.out.println("Size: " + map.size());

        System.out.println("Value for key2: " + map.get("two"));

        map.remove("one");

        System.out.println("Size: " + map.size());

        map.clear();

        System.out.println("Size: " + map.size());
    }
}

