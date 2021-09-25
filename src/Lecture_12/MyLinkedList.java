package Lecture_12;

public class MyLinkedList<E> {
    // Используем модификатор transient, потому что эти поля будут вычисляться на лету, при выполнении программы
    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(E e) {
        if (size == 0) {
            first = last = new Node<>(null, e, null);
            size++;
            return;
        }
        Node<E> newFirst = new Node<>(null, e, first);
        first.prev = newFirst;
        first = newFirst;
        size++;
    }

    public void addLast(E e) {
        if (size == 0) {
            last = first = new Node<>(null, e, null);
            size++;
            return;
        }
        Node<E> newLast = new Node<>(last, e, null);
        last.next = newLast;
        last = newLast;
        size++;
    }

    public int size() {
        return size;
    }

    public E getElementByIndex (int index) {
        if (size == 0 || index >= size) {
            return null;
        }
        Node<E> node = first;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return node.item;
            }
            node = node.next;
        }
        return null;
    }

    public void removeElementByIndex (int index) {
        if (size == 0 || index >= size) {
            return;
        }
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node<E> node = first;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                node = node.next;
                continue;
            }
            newList.addLast(node.item);
            node = node.next;
        }
        this.size = newList.size;
        this.first = newList.first;
        this.last = newList.last;
    }

    public void addElementByIndex(int index, E element) {
        if (size == 0 || index > size) {
            return;
        }
        if (index == size) {
            addLast(element);
            return;
        }
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node<E> node = first;
        for (int i = 0; i < size; i++) {
            if (index == 0) {
                addFirst(element);
                return;
            }
            if (i == index) {
                Node<E> newNode = new Node<>(node.prev, element, node);
                node.prev = newNode;
                newList.addLast(newNode.item);
            }
            newList.addLast(node.item);
            node = node.next;
        }
        this.size = newList.size;
        this.first = newList.first;
        this.last = newList.last;
    }

    @Override
    public String toString() {
        String result = "[";
        Node<E> node = first;
        for (int i = 0; i < size - 1; i++) {
            result += node.item + ", ";
            node = node.next;
        }
        result += last == null ? "]" : last.item + "]";
        return result;
    }
}
