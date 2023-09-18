package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B2075 {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
             st = new StringTokenizer(in.readLine());
             for (int j = 0; j < N; j++) {
             list.add(Integer.parseInt(st.nextToken()));
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(N-1));
    }
}
