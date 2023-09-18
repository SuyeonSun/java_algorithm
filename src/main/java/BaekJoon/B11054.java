package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int[] arr = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 왼쪽에서 오른쪽으로 LIS 구하기
        int[] dpL = new int[N+1];
        for (int i = 1; i <= N; i++) {
            dpL[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dpL[i] = Math.max(dpL[j] + 1, dpL[i]); // ?
                }
            }
        }

        // 오른쪽에서 왼쪽으로 LIS 구하기
        int[] dpR = new int[N+1];
        for (int i = N; i > 0; i--) {
            dpR[i] = 1;
            for (int j = N; j > i; j--) {
                if (arr[i] > arr[j]) {
                    dpR[i] = Math.max(dpR[j] + 1, dpR[i]);
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, dpL[i] + dpR[i]);
        }

        System.out.println(max - 1);
    }
}
