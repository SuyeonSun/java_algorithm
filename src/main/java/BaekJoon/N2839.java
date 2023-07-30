package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());

        int cnt = 0;
        while (true) {
            if (num % 5 == 0) {
                cnt += num / 5;
                System.out.println(cnt);
                return;
            } else if (num < 0) {
                System.out.println(-1);
                return;
            } else {
                num -= 3;
                cnt++;
            }
        }
    }
}
