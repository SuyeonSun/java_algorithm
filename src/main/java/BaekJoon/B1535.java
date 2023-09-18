package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1535 {
    static int[] pList;
    static int[] jList;
    static int[] numbers;
    static int r;
    static int maxJ = 0;

    public static void combination(int start, int cnt) {
        if (cnt == r) {
            int totalP = 100;
            int totalJ = 0;
            for (int i = 0; i < numbers.length; i++) {
                totalP -= pList[numbers[i]];
                totalJ += jList[numbers[i]];
            }
            if (totalJ > maxJ && totalP > 0) maxJ = totalJ;
            return;
        }

        for (int i = start; i < pList.length; i++) {
            numbers[cnt] = i;
            combination(i+1, cnt+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        pList = new int[N];
        jList = new int[N];

        StringTokenizer st= new StringTokenizer(in.readLine());

        // 소모 체력
        for (int i = 0; i < N; i++) {
            pList[i] = Integer.parseInt(st.nextToken());
        }
        // 기쁨
        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            jList[i] = Integer.parseInt(st.nextToken());
        }

        // 1~arr의 길이까지 선택하기
        for (int i = 1; i <= pList.length; i++) {
            r = i;
            numbers = new int[i];
            combination(0, 0);
        }
        System.out.println(maxJ);
    }
}
