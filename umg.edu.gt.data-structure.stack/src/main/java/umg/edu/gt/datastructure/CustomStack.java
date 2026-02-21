package umg.edu.gt.datastructure;

public class CustomStack<T> {

    private Node<T> top;
    private Node<T> init;
    private int count;

    public CustomStack() {
        top = null;
        init = null;
        count = 0;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);

        if (top == null) {
            init = newNode;
        } else {
            newNode.setNext(top);
        }

        top = newNode;
        count++;
    }

    public T pop() {
        if (isEmpty()) return null;

        T data = top.getData();
        top = top.getNext();
        count--;

        if (top == null) {
            init = null;
        }

        return data;
    }

    public T peek() {
        if (isEmpty()) return null;
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getCount() {
        return count;
    }

    public int getSize() {
        return count;
    }

    public int length() {
        return count;
    }

    public Node<T> getNodeInit() {
        return init;
    }
}