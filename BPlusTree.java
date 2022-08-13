public class BPlusTree<T, V extends Comparable<V>>{
    private int bTreeOrder;
    private int maxNumber;
    private Node<T, V> root;
    private LeafNode<T, V> left;

    public BPlusTree(){
        this(3);
    }

    public BPlusTree(int bTreeOrder){
        this.bTreeOrder = bTreeOrder;
        this.maxNumber = bTreeOrder + 1;
        this.root = new LeafNode<T, V>();
        this.left = null;
    }

    public T find(V key){
        T t = this.root.find(key);
        if(t == null){
            System.out.println("No existe");
        }
        return t;
    }

    public void insert(T value, V key){
        if(key == null){
            return;
        }
        Node<T, V> t = this.root.insert(value, key);
        if(t != null){
            this.root = t;
        }
        this.left = (leafNode<T, V>)this.root.refreshLeft();
    }

}