package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1976 {
    public static boolean[] visited;
    public static ArrayList<Integer>[] list;
    public static ArrayList<Integer> route = new ArrayList<>();
    public static int N;
    public static ArrayList<Integer> plan = new ArrayList<>();

    public static void dfs(int v) {
        visited[v] = true;
        route.add(v);

        for (int i = 0; i < list[v].size(); i++) {
            if (list[v].get(i) == 1 && !visited[i]) {
                if (plan.contains(i)) dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        int M = Integer.parseInt(in.readLine());

        list = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            list[i] = new ArrayList<Integer>();
        }
        visited = new boolean[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            for (int j = 0; j < N; j++) {
                list[i].add(Integer.parseInt(st.nextToken()));
            }
        }

        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < M; i++) {
            plan.add(Integer.parseInt(st.nextToken()));
        }

        dfs(0);
    }
}
