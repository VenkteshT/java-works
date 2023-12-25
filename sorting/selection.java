package sorting;

public class selection {
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int t = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = t;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 2, 13, 0, 1, 2, 7 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
