package dsa.String;

import java.util.*;

public class subsequence {

    public static void getMin(int[] arr, int i, int min) {
        if (i == arr.length - 1) {
            if (arr[i] < min)
                min = arr[i];
            System.out.println(min);
            return;
        }
        if (arr[i] < min)
            min = arr[i];
        getMin(arr, i + 1, min);
    }

    public static void fact(int ans, int n) {
        if (n == 0)
            return;
        System.out.println(n + ":" + ans);
        fact(ans * n, n - 1);
    }

    public static String move(String str) {
        if (str.length() == 0)
            return "";
        String res = move(str.substring(1));
        if (str.charAt(0) == 'x')
            return res + str.charAt(0);
        else
            return str.charAt(0) + res;
    }

    public static String removeDuplicates(String str) {
        if (str.length() == 0)
            return " ";
        String res = removeDuplicates(str.substring(1));
        if (str.charAt(0) == res.charAt(0))
            return res;
        else
            return str.charAt(0) + res;
    }

    public static String[] subSeq(String str) {
        if (str.length() == 0) {
            String ar[] = new String[1];
            ar[0] = "";
            return ar;
        }
        String smalloutput[] = subSeq(str.substring(1));
        String[] output = new String[smalloutput.length * 2];
        int k = 0;
        for (int i = 0; i < smalloutput.length; i++) {
            output[k++] = str.charAt(0) + smalloutput[i];
        }
        for (int i = 0; i < smalloutput.length; i++) {
            output[k++] = smalloutput[i];
        }
        return output;
    }

    public static String reverseWord(String str) {
        String res = "", hold = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                hold += str.charAt(i);
            } else {
                res = " " + hold + res;
                hold = "";
            }
        }
        res = " " + hold + res;
        return res.substring(1);
    }

    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{') {
                s.push(expression.charAt(i));
            } else {
                if (expression.charAt(i) == '}') {
                    if (s.pop() != '{')
                        return false;
                } else if (expression.charAt(i) == ')') {
                    if (s.pop() != '(')
                        return false;
                } else if (s.pop() != '[')
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 0, 4, 3, 2, 1, 9, 7, -1 };
        int min = arr[0];
        // getMin(arr, 0, min);
        // fact(1, 5);
        // // System.out.println(move("xxvenxky"));
        // String str = "i love Coding";
        // String res = reverseWord(str);
        // System.out.println(str.length() + ":" + res.length());
        System.out.println('A' - 'p');
        String exp = "[()]{}{[()()]()}";
        System.out.println(isValidParenthesis(exp));

        long n = 6;
        long f = Math.round((n * 1.0 / 2) - 0.1);
        long s = Math.round((n * 1.0 / 3) - 0.1);
        long t = Math.round((n * 1.0 / 4) - 0.1);
        System.out.println(f + s + t);
    }
}
