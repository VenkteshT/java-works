package problems;

public class DynamicArray {

    private int data[];
    private int index;

    public DynamicArray() {
        data = new int[5];
        index = 0;
    }

    public int currentIndex() {
        return index;
    }

    public boolean isEmypty() {
        return index == 0;
    }

    public int size() {
        return index;
    }

    public int get(int i) {
        if (i >= index || i < 0) {
            return -1;
        }
        return data[i];
    }

    public void add(int i) {
        if (index >= data.length) {
            int dup[] = new int[data.length * 2];
            for (int j = 0; j < index; j++) {
                dup[j] = data[j];
            }
            data = dup;
            data[index++] = i;
            return;
        }
        data[index] = i;
        index++;
    }

    public void set(int at, int el) {
        if (at >= index)
            return;
        data[at] = el;
    }

    public void removeLast() {
        if (index == 0)
            return;
        data[index--] = 0;
    }

    public int addAt(int pos, int val) {
        if (pos < 0 || pos >= this.data.length)
            return -1;
        int temp = this.data[pos];
        for (int i = pos; i < this.data.length; i++) {
            int t2 = temp;
            temp = this.data[i];
            this.data[i] = t2;
        }
        this.data[index++] = val;
        return val;
    }

    public void printArray() {
        int i = 0;
        while (i < index) {
            System.out.print(data[i] + " ");
            i++;
        }
        System.out.println();
    }

}
