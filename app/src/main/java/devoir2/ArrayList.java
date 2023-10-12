package devoir2;
import java.util.Arrays;
import java.util.Iterator;

public final class ArrayList<E> implements List<E> {
    private int size = 0;
    private Object[] array = new Object[8];

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
        if (size == array.length)
            array = Arrays.copyOf(array, array.length * 2);
        array[size] = newElem;
        size += 1;
    }

    @Override
    public void remove(int i) {
        checkIndex(i);
        System.arraycopy(array, i + 1, array, i, size - 1 - i);
        array[size - 1] = null;
        size -= 1;
    }

    @SuppressWarnings("unchecked")
	@Override
    public E get(int i) {
        checkIndex(i);
        return (E)array[i];
    }

    @Override
    public void set(int i, E newElem) {
        checkIndex(i);
        array[i] = newElem;
    }

    @Override
    public Iterator<E> iterator() {
        return new ALIterator<>(this);
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
    
}
