package devoir2;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class LLIterator<E> implements Iterator<E> {
    private final LinkedList<E> list;
    private Node<E> next;
    private boolean canRemove;

    public LLIterator(LinkedList<E> list) {
        this.list = list;
        this.next = list.head.succ;
        this.canRemove = false;
    }

    @Override
    public boolean hasNext() {
        return next != list.head;
    }

    @Override
    public E next() {
        if (! hasNext())
            throw new NoSuchElementException();
        canRemove = true;
        E value = next.value;
        next = next.succ;
        return value;
    }

    @Override
    public void remove() {
        if (! canRemove)
            throw new IllegalStateException();
        list.removeNode(next.pred);
        canRemove = false;
    }
}