package dsa.priority_queue;

public class Priority_Node<D> {
    int priority;
    public D data;

    public Priority_Node(int priority, D data) {
        this.priority = priority;
        this.data = data;
    }
}