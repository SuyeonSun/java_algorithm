package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B9095 {
    static int cnt = 0;
    public static void sum (int n) {
        if (n == 0) {
            cnt++;
            return;
        }
        if (n-1 >= 0) sum(n-1);
        if (n-2 >= 0) sum(n-2);
        if (n-3 >= 0) sum(n-3);
    }

    public static void main (String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine());
        for (int i = 0; i < tc; i++) {
            int num = Integer.parseInt(in.readLine());
            sum (num);
            System.out.println(cnt);
            cnt = 0;
        }
    }
}
