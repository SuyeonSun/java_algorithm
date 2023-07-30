package Others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {
    public static void main(String[] args) throws IOException {
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(in.readLine());

        int[][] arr = new int[5][5];
        int k = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = k;
                    k++;
                } else {
                    arr[i][arr[0].length - 1 - j] = k;
                    k++;
                }

            }
        }

        for (int i = 0; i < 5; i ++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
