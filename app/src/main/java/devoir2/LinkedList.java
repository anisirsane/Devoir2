package devoir2;
import java.util.Iterator;

public final class LinkedList<E> implements List<E> {
    private int size;
    final Node<E> head;

    public LinkedList() {
        Node<E> head = new Node<>(null);
        head.succ = head.pred = head;

        this.size = 0;
        this.head = head;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E newElem) {
        Node<E> newNode = new Node<>(head.pred, newElem, head);
        newNode.pred.succ = newNode.succ.pred = newNode;
        size += 1;
    }

    @Override
    public void remove(int i) {
        checkIndex(i);
        removeNode(nodeAtIndex(i));
    }

    @Override
    public E get(int i) {
        checkIndex(i);
        return nodeAtIndex(i).value;
    }

    @Override
    public void set(int i, E newElem) {
        checkIndex(i);
        nodeAtIndex(i).value = newElem;
    }

    @Override
    public Iterator<E> iterator() {
    	return new LLIterator<>(this);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("[");
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            b.append(it.next());
            if (it.hasNext())
                b.append(",");
        }
        return b.append("]").toString();
    }

    private void checkIndex(int i) {
        if (! (0 <= i && i < size))
            throw new IndexOutOfBoundsException("index out of bounds: " + i);
    }

    private Node<E> nodeAtIndex(int i) {
        Node<E> n = head.succ;
        for (int j = 0; j < i; ++j)
            n = n.succ;
        return n;
    }

    public void removeNode(Node<E> pred) {
        pred.pred.succ = pred.succ;
        pred.succ.pred = pred.pred;
        size -= 1;
    }

}
