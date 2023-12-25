package dsa.priority_queue.MINHeap;

import dsa.priority_queue.PriorityQueueException;

import java.util.*;

public class MIN_Heap {

    ArrayList<Integer> heap;

    public MIN_Heap() {
        heap = new ArrayList<>();
    }

    public int getSize() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public void insert(int data) {
        heap.add(data);
        int child = heap.size() - 1;
        int parent = (child - 1) / 2;

        while (child > 0) {
            int p = heap.get(parent);
            int c = heap.get(child);
            if (c < p) {
                heap.set(child, p);
                heap.set(parent, c);
                child = parent;
                parent = (parent - 1) / 2;
            } else
                break;

        }
    }

    public int removeMin() throws PriorityQueueException {
        if (isEmpty()) {
            throw new PriorityQueueException();
        }
        int el = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        int parentIndex = 0;
        int childIndex1 = 1;
        int childIndex2 = 2;
        int minIndex = parentIndex;

        while (childIndex1 < heap.size()) {
            if (heap.get(childIndex1) < heap.get(minIndex)) {
                minIndex = childIndex1;
            }
            if (childIndex2 < heap.size() && heap.get(childIndex2) < heap.get(minIndex)) {
                minIndex = childIndex2;
            }
            if (parentIndex == minIndex)
                break;

            int temp = heap.get(parentIndex);
            heap.set(parentIndex, heap.get(minIndex));
            heap.set(minIndex, temp);
            parentIndex = minIndex;
            childIndex1 = parentIndex * 2 + 1;
            childIndex2 = parentIndex * 2 + 2;
        }
        return el;
    }

    public void show() {
        for (int el : heap) {
            System.out.print(el + " ");
        }
    }

    public int getMax() throws PriorityQueueException {
        if (isEmpty()) {
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }

}
