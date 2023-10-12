package devoir2;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class ALIterator<E> implements Iterator<E> {
    private final ArrayList<E> list;
    private int index;
    private boolean canRemove;

    public ALIterator(ArrayList<E> list) {
        this.list = list;
        this.index = 0;
        this.canRemove = false;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public E next() {
        if (! hasNext())
            throw new NoSuchElementException();
        canRemove = true;
        return list.get(index++);
    }

    @Override
    public void remove() {
        if (! canRemove)
            throw new IllegalStateException();
        list.remove(index - 1);
        canRemove = false;
    }
}