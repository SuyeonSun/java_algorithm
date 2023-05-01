package SW_Expert_Academy.D2;

import java.util.Scanner;

public class N1954 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int n = sc.nextInt();
                int arr[][] = new int[n][n];
                int dx[] = {0, 1, 0, -1};
                int dy[] = {1, 0, -1, 0};
                int count = 1;
                int x = 0;
                int y = 0;
                int d = 0;
                while(count <= n * n) {
                    arr[x][y] = count++;
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    if (nx < 0 || nx >= n || ny < 0 || ny >= n || arr[nx][ny] != 0) {
                        d = (d + 1) % 4;
                        nx = x + dx[d];
                        ny = y + dy[d];
                    }
                    x = nx;
                    y = ny;
                }
                System.out.printf("#%d\n", test_case);
                for (int r = 0; r < n; r++) {
                    for (int c = 0; c < n; c++) {
                        System.out.printf(arr[r][c] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
