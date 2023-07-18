package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class N1012 {
    static boolean[][] check; // 배추 유무 확인
    static int n; // 배추밭 가로
    static int m; // 배추밭 세로

    static int[][] farm; // 배추밭

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    private static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY}); // [0, 0]
        check[startX][startY] = true;

        // queue가 비어있다면 더이상 인접한 배추가 없음
        while (!queue.isEmpty()) {
            int[] poll = queue.poll(); // 저장된 좌표 [x, y] 꺼내기

            // 상하좌우 탐색
            for (int i = 0; i < 4; i++) {
                int x = poll[0] + dx[i];
                int y = poll[1] + dy[i];

                if (x < 0 || y < 0 || x >= m || y >= n) continue;

                // 인접한(상하좌우) 좌표에 배추가 있고, 방문하지 않았다면 queue에 추가
                if (farm[x][y] == 1 && !check[x][y]) {
                    queue.add(new int[]{x, y});
                    check[x][y] = true;
                }
            }


        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        // ==================== 데이터 입력 ====================
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(in.readLine());

        for (int tc = 0; tc < testCase; tc++) {
            String input = in.readLine();
            String[] inputArr = input.split(" ");
            m = Integer.parseInt(inputArr[0]);  // 배추밭 가로
            n = Integer.parseInt(inputArr[1]); // 배추밭 세로
            int k = Integer.parseInt(inputArr[2]); // 배추 개수
            check = new boolean[m][n];

            farm = new int[m][n]; // 배추밭

            for (int i = 0; i < k; i++) {
                String pos = in.readLine();
                int x = Integer.parseInt(pos.split(" ")[0]);
                int y = Integer.parseInt(pos.split(" ")[1]);
                farm[x][y] = 1;
                System.out.println(x + " " + y);
            }

            int count = 0; // 지렁이 개수

            // ==================== bfs 시작 ====================
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (farm[i][j] == 1 && !check[i][j]) { // 배추가 있고, 방문하지 않는 곳
                        bfs(i, j); //bfs 확인
                        count++; // 지렁이 수 증가
                    }
                }
            }

            System.out.println(count);
        }
    }
}