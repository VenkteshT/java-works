package problems;

import java.util.*;

public class rough {
    public static void main(String[] args) {

        int t[] = { 1, 2, 4, 5 };
        DynamicArray arr = new DynamicArray();
        for (int el : t) {
            arr.add(el);
        }
        arr.printArray();
    }
}
