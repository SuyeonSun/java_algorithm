package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1149 {
    static long min = Integer.MAX_VALUE;
    static int[][] arr;
    public static void func(int[] visited, int cnt) {
        if (cnt == visited.length-1) {
            int total = 0;
            for (int i = 0; i < visited.length; i++) {
                total += arr[i][visited[i]];
            }
            // System.out.println(Arrays.toString(visited) + " " + cnt);
            if (total < min) min = total;
            return;
        };
        for (int i = 0; i < 3; i++) {
            if (visited[cnt] != i) {
                visited[cnt+1] = i;
                func(visited, cnt+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            String[] str = in.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
            arr[i][2] = Integer.parseInt(str[2]);
        }

        for (int i = 0; i < 3; i++) {
            int[] visited = new int[N];
            visited[0] = i;
            func(visited, 0);
        }
        System.out.println(min);
    }
}
