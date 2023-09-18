package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B16236 {
    private static int N;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int babySharkSize = 2;
    private static int eat = 0;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};

    private static PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) ->
            o1[2] != o2[2] ? Integer.compare(o1[2], o2[2]) : (o1[0] != o2[0] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]))
    );
    private static int answer = 0; // 움직인 총 거리

    public static void bfs(int i, int j, int c) {
        visited[i][j] = true;
        queue.add(new int[]{i, j, c});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];
            int cnt = poll[2];

            if (arr[x][y] > 0 && arr[x][y] < babySharkSize) {
                arr[x][y] = 0; // 물고기 제거
                eat++;
                answer += cnt;
            }

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (nx >= N || ny >= N || nx < 0 || ny < 0 || arr[nx][ny] > babySharkSize) continue;
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, cnt + 1});
                }
            }

            if (babySharkSize == eat) {
                babySharkSize++;
                eat = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];

        int babySharkI = 0;
        int babySharkJ = 0;

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 9) {
                    babySharkI = i;
                    babySharkJ = j;
                }
            }
        }

        bfs(babySharkI, babySharkJ, 0);
        System.out.println(answer);
    }
}
