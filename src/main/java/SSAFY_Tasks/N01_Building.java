package SSAFY_Tasks;

import java.io.*;

public class N01_Building {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(in.readLine());

        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(in.readLine());
            char[][] arr = new char[n][n];
            for (int j = 0; j < n; j++) {
                String input = in.readLine();
                for (int m = 0; m < n; m++) {
                    arr[j][m] = input.charAt(m);
                }
            }

            int[][] result = new int[n][n];
            int[] dx = {-1, 0 , 1, -1, 1, -1, 0, 1};
            int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    if (arr[x][y] == 'G') continue;
                    else {
                        boolean isGarden = false;
                        for (int z = 0; z < 8; z++) {
                            if (x + dx[z] >= n || y + dy[z] >= n || x + dx[z] < 0 || y + dy[z] < 0) continue;
                            if (arr[x + dx[z]][y + dy[z]] == 'G') {
                                isGarden = true;
                                break;
                            }
                        }

                        if (isGarden == true) {
                            result[x][y] = 2;
                        } else  {
                            int total = 0;
                            for (int w = 0; w < n; w++) {
                                if (arr[x][w] == 'B') total++;
                            }
                            for (int q = 0; q < n; q++) {
                                if (arr[q][y] == 'B') total++;
                            }
                            result[x][y] = total - 1;
                        }
                    }
                }
            }

            int max = 0;
            for (int xx = 0; xx < n; xx++) {
                for (int yy = 0; yy < n; yy++) {
                    if (result[xx][yy] > max) max = result[xx][yy];
                }
            }

            System.out.println("#" + testCase + " " + max);

        }


    }
}

