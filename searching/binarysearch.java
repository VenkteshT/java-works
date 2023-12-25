package searching;

import java.util.*;

public class binarysearch {
    public static int BinarySearch(int[] arr, int key) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                j = mid - 1;
            else
                i = mid + 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] test = new int[t];

        for (int j = 0; j < t; j++) {
            test[j] = sc.nextInt();
        }
        for (int q = 0; q < t; q++) {
            System.out.println(BinarySearch(arr, test[q]));
        }
    }
}
