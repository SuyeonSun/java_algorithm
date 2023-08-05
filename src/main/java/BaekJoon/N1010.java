package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1010 {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(in.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] arr = in.readLine().split(" ");
            double n = Integer.parseInt(arr[0]); // 3
            double m = Integer.parseInt(arr[1]); // 5

            double n1 = 1;
            for (double j = m; j > m-n; j--) { // 5 4 3
                n1 *= j;
            }
            double n2 = 1;
            for (double j = n; j > 0; j--) {
                n2 *= j;
            }

            // System.out.println(n1 / n2);
            double result = n1 / n2;
            System.out.printf("%.0f\n", result);
        }
    }

}
