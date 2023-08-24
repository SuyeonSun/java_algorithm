package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2644 {
    static boolean[] visited;
    static ArrayList<Integer>[] list;

    static int answer = -1;

    public static void dfs(int start, int end, int depth) {
        if (start == end) {
            answer = depth;
            return;
        }

        visited[start] = true;

        for (int i = 0; i < list[start].size(); i++) {
            if (!visited[list[start].get(i)]) {
                dfs(list[start].get(i), end, depth+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine()); // 9
        list = new ArrayList[n+1]; // 0 ~ 9
        // 초기화
        for (int i = 0; i < n+1; i++) {
            list[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken()); // 7 // 시작
        int b = Integer.parseInt(st.nextToken()); // 3 // 끝

        int m = Integer.parseInt(in.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }

        visited = new boolean[n+1];

        dfs(a, b, 0);
        System.out.println(answer);
    }
}