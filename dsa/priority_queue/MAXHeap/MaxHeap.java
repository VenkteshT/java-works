package dsa.priority_queue.MAXHeap;

import java.util.ArrayList;

public class MaxHeap {
    ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public int getSize() {
        return heap.size();
    }

    public void insert(int data) {
        heap.add(data);
        int child = heap.size() - 1;
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (heap.get(child) > heap.get(parent)) {
                int t = heap.get(parent);
                heap.set(parent, heap.get(child));
                heap.set(child, t);
                child = parent;
                parent = (parent - 1) / 2;
            } else
                return;
        }
    }

    public int removeMax() {
        int el = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        int parentIndex = 0;
        int childIndex1 = 1;
        int childIndex2 = 2;
        int maxIndex = parentIndex;
        while (childIndex1 < heap.size()) {
            if (heap.get(childIndex1) > heap.get(maxIndex))
                maxIndex = childIndex1;
            if (childIndex2 < heap.size() && heap.get(childIndex2) > heap.get(maxIndex))
                maxIndex = childIndex2;
            if (parentIndex == maxIndex)
                break;
            int temp = heap.get(parentIndex);
            heap.set(parentIndex, heap.get(maxIndex));
            heap.set(maxIndex, temp);
            parentIndex = maxIndex;
            childIndex1 = parentIndex * 2 + 1;
            childIndex2 = parentIndex * 2 + 1;
        }
        return el;
    }

    public void show() {
        for (int el : heap)
            System.out.print(el + " ");
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public int getMax() {

        return heap.get(0);
    }

}
