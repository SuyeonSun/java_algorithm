package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2606 {
    static int n;
    static int m;
    static int[][] arr;
    static boolean[] visit;
    static int count;

    public static void dfs (int idx) {
        visit[idx] = true;
        for (int i = 1; i <= n; i++) {
            if (arr[idx][i] == 1 && !visit[i]) {
                dfs(i);
                count++;
            }
        }

    }

    public static void main (String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        m = Integer.parseInt(in.readLine());
        arr = new int[n+1][n+1];
        visit = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            String[] input = in.readLine().split(" ");
            int k1 = Integer.parseInt(input[0]);
            int k2 = Integer.parseInt(input[1]);
            arr[k1][k2] = 1;
            arr[k2][k1] = 1;
        }

        dfs(1);
        System.out.println(count);
    }
}
