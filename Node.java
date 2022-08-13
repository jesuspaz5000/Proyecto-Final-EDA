public abstract class Node<T, V extends Comparable<V>> {
    
    protected Node<T, V> parent;
    protected Node<T, V>[] childs;
    protected int number;
    protected Object keys[];

    public Node(int maxNumber){
        this.keys = new Object[maxNumber];
        this.childs = new Node[maxNumber];
        this.number = 0;
        this.parent = null;
    }

    abstract T find(V key);
    abstract Node<T, V> insert(T value, V key);
    abstract LeafNode<T, V> refreshLeft();

}
