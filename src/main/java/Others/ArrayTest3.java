package Others;

import java.io.IOException;

public class ArrayTest3 {
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[5][5];
        int k = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) {
                    arr[j][i] = k;
                    k++;
                } else {
                    arr[arr.length - 1 -j][i] = k;
                    k++;
                }

            }
        }

        for (int i = 0; i < 5; i ++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
