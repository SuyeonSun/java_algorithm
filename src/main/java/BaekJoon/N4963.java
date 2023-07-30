package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class N4963 {
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int w;
    static int h;
    static int[][] arr;
    static boolean[][] check;

    public static void bfs (int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        check[x][y] = true;

        while(!queue.isEmpty()) {
            int[] poll = queue.poll();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    int k = poll[0] + dx[i];
                    int p = poll[0] + dy[i];
                    if (k < 0 || p < 0 || k >= w || p >= h) continue;

                    if (arr[k][p] == 1 && !check[k][p]) {
                        queue.add(new int[]{k, p});
                        check[k][p] = true;
                    }
                }
            }
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = in.readLine().split(" ");
            w = Integer.parseInt(input[0]);
            h = Integer.parseInt(input[1]);

            if (w == 0 && h == 0) return;

            arr = new int[h][w];
            check = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                String[] str = in.readLine().split(" ");
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(str[j]);
                }
            }

            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[i][j] == 1 && !check[i][j]) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
