package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class B1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = in.readLine();
            if (hm.get(name) == null) {
                hm.put(name, 1);
            } else {
                int cnt = hm.get(name);
                hm.put(name, ++cnt);
            }
        }

        int max = 0;
        for(String name : hm.keySet()) {
            max = Math.max(max, hm.get(name));
        }

        // 사전 순 정렬 -> ArrayList 생성 후 sort
        ArrayList<String> names = new ArrayList<>(hm.keySet());
        Collections.sort(names);

        String answer = "";
        for(String name : names) {
            if (max == hm.get(name)) {
                answer = name;
                break;
            }
        }
        System.out.println(answer);
    }
}
