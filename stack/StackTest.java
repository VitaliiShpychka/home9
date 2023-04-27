package stack;

public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // 3
        System.out.println(stack.peek()); // 2
        stack.remove(0);
        System.out.println(stack.pop()); // 2
        stack.clear();
        System.out.println(stack.size()); // 0
    }
}

