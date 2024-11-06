public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(T item) {
        list.addToFront(item);
    }

    public T pop() {
        if (!hasItems()) {
            throw new RuntimeException("Stack is empty");
        }
        T item = list.get(0);
        list.remove(0);
        return item;
    }

    public boolean hasItems() {
        return list.size() > 0;
    }
}
