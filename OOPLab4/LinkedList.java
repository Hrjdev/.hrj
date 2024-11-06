public class LinkedList<T> {
    private Node<T> head;
    protected int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void addToFront(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void addToBack(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getItem();
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isPalindrome() {
        if (head == null || head.getNext() == null) {
            return true;
        }

        Stack<T> stack = new Stack<>();
        Node<T> current = head;
        while (current != null) {
            stack.push(current.getItem());
            current = current.getNext();
        }

        current = head;
        while (current != null) {
            if (!current.getItem().equals(stack.pop())) {
                return false;
            }
            current = current.getNext();
        }

        return true;
    }

    @Override
    public String toString() {
        String result = "";
        if (head == null)
            return result;
        for (Node<T> p = head; p != null; p = p.getNext()) {
            result += p.getItem() + "\n";
        }
        return result.substring(0, result.length() - 1); // remove last \n
    }
}
