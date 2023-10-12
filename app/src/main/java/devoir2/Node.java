package devoir2;
class Node<E> {
    public Node<E> succ, pred;
    public E value;

    public Node(Node<E> pred, E value, Node<E> succ) {
        this.succ = succ;
        this.pred = pred;
        this.value = value;
    }

    public Node(E value) {
        this(null, value, null);
    }
}