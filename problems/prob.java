package problems;

public class prob {

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;
        else if (arr[index] > arr[index + 1])
            return false;
        return isSorted(arr, index + 1);

    }

    public static String printChar(String str) {
        if (str.length() == 0)
            return " ";
        String res = printChar(str.substring(1));
        if (str.charAt(0) == 'x') {
            if (res.length() == 1)
                return " ";
            else
                return res;
        } else {
            return str.charAt(0) + res;
        }
    }

    public static int binarySearch(int[] arr, int start, int end, int key) {
        if (start > end)
            return -1;
        int mid = (start + end) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] < key)
            return binarySearch(arr, mid + 1, end, key);
        else
            return binarySearch(arr, start, mid - 1, key);
    }

    public static String removeConsecutiveDuplicates(String str) {
        if (str.length() <= 1)
            return str;

        String res = removeConsecutiveDuplicates(str.substring(1));

        if (str.charAt(0) == res.charAt(0)) {
            return res;
        } else
            return str.charAt(0) + res;
    }

    public static void main(String[] args) {

    }
}
