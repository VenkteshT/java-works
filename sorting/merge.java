package sorting;

public class merge {
    public static void conquer(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int x = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j])
                temp[x++] = arr[i++];
            else
                temp[x++] = arr[j++];
        }
        while (i <= mid) {
            temp[x++] = arr[i++];
        }
        while (j <= end) {
            temp[x++] = arr[j++];
        }

        for (int index1 = 0, index2 = start; index1 < temp.length; index1++, index2++) {
            arr[index2] = temp[index1];
        }
    }

    public static void divide(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;

        // divide the array into two parts
        divide(arr, start, mid);
        divide(arr, mid + 1, end);

        // merge the elements to sorted parts
        conquer(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 2, 1, 5, 0, 8, 9 };
        int n = arr.length - 1;
        divide(arr, 0, n);
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}