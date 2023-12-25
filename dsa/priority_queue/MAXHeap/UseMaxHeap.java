package dsa.priority_queue.MAXHeap;

public class UseMaxHeap {
    public static void main(String[] args) {
        MaxHeap m = new MaxHeap();
        for (int i = 3; i < (3 + 7); i++) {
            m.insert(i);
        }
        m.removeMax();
        m.show();
    }
}
