package problems;

import java.util.*;

public class maze {
    static void print(int[][] arr) {
        System.out.println("-------- ARRAY ----------");
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isPathExist(int[][] arr, int i, int j, int m, int n, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= m || j >= n || arr[i][j] == 0 || visited[i][j])
            return false;
        if (i == m - 1 && j == n - 1)
            return true;
        visited[i][j] = true;
        boolean right = isPathExist(arr, i, j + 1, m, n, visited);
        boolean down = isPathExist(arr, i + 1, j, m, n, visited);
        boolean up = isPathExist(arr, i - 1, j, m, n, visited);
        boolean left = isPathExist(arr, i, j - 1, m, n, visited);
        return right || left || up || down;
    }

    public static void main(String arg[]) {
        int arr[][];
        boolean vis[][];
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the size of arry in M * N format");
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[m][n];
        vis = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter " + (i + 1) + " th sub arry elemets");
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                vis[i][j] = false;
            }
        }
        boolean res = isPathExist(arr, 0, 0, m, n, vis);
        if (res) {
            print(arr);
            System.out.println("Yes Path Exist");
        } else
            System.out.println("No Path Exist");
    }
}
