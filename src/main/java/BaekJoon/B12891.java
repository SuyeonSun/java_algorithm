package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12891 {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력 받기
        String[] input = in.readLine().split(" ");
        int S = Integer.parseInt(input[0]);
        int P = Integer.parseInt(input[1]);

        String str = in.readLine();

        st = new StringTokenizer(in.readLine());
        int minA = Integer.parseInt(st.nextToken());
        int minC = Integer.parseInt(st.nextToken());
        int minG = Integer.parseInt(st.nextToken());
        int minT = Integer.parseInt(st.nextToken());

        int answer = 0;

        for (int i = 0; i < S - P + 1; i++) {
            int minATemp = minA;
            int minCTemp = minC;
            int minGTemp = minG;
            int minTTemp = minT;
            String password = str.substring(i, i + P);
            if (password.contains("A")) minATemp--;
            if (password.contains("C")) minCTemp--;
            if (password.contains("G")) minGTemp--;
            if (password.contains("T")) minTTemp--;

            if (minATemp <= 0 && minCTemp <= 0 && minGTemp <= 0 && minTTemp <= 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}