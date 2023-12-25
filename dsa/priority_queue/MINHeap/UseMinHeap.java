package dsa.priority_queue.MINHeap;

public class UseMinHeap {
    public static void main(String[] args) {
        MIN_Heap m = new MIN_Heap();
        for (int i = 7; i > 0; i--) {
            m.insert(i);
        }
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println(m.removeMin());
            }

        } catch (Exception e) {
        }
        m.show();
    }
}
