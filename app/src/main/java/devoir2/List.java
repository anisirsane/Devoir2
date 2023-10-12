package devoir2;
import java.util.Iterator;

public interface List<E> extends Iterable<E> {
    /**
     * Check whether the list is empty.
     * @return <code>true</code> if and only if the list is empty.
     */
    boolean isEmpty();

    /**
     * Get the number of elements contained in the list.
     * @return the size of the list
     */
    int size();

    /**
     * Add an element at the end of the list.
     * @param newElem the element to add.
     */
    void add(E newElem);

    /**
     * Remove the element at a given position.
     * @param index the 0-based index of the element to remove.
     * @throws java.lang.IndexOutOfBoundsException if the index is invalid (i.e. negative or greater or equal to the size of the list)
     */
    void remove(int index);

    /**
     * Get the element at a given position.
     * @param index the 0-based index of the element to get.
     * @return the element at the given index.
     * @throws java.lang.IndexOutOfBoundsException if the index is invalid (i.e. negative or greater or equal to the size of the list)
     */
    E get(int index);

    /**
     * Replace the element at a given position by a new element.
     * @param index the 0-based index of the element to set.
     * @param newElem the new value of the element.
     * @throws java.lang.IndexOutOfBoundsException if the index is invalid (i.e. negative or greater or equal to the size of the list)
     */
    void set(int index, E elem);

    @Override
    Iterator<E> iterator();
}
