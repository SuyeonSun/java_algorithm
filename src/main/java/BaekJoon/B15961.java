package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B15961 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken()); // 접시의 수
        int d = Integer.parseInt(st.nextToken()); // 초밥의 가짓수
        int k = Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(st.nextToken()); // 쿠폰 번
        int[] arr = new int[N]; // 7 9 7 30 2 7 9 25
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        int[] visited = new int[d+1];

        int result = 1;
        visited[c]++; //  쿠폰은 먹었다고 가정

        Queue<Integer> queue = new LinkedList<>(); // 2 7 9 25
        // k개 만큼 queue에 add
        for (int i = N - k; i < N; i++) {  // 2 7 9 25
            if(visited[arr[i]] == 0) { // 아직 방문하지 않은 값이면 result++
                result++;
            }
            visited[arr[i]]++; // 먹은 스시 방문 처리
            queue.add(arr[i]); // 먹은 스시 큐에 추가
        }

        int cnt = result; // 4

        // 슬라이딩 윈도우
        for (int i = 0; i < N-1; i++) {
            int poll = queue.poll(); // 큐에서 먹은 스시 빼기
            visited[poll]--; // 먹은 스시 여부 차감
            if(visited[poll] == 0) cnt--; // 먹은 횟수가 0이 된 경우, 먹은 초밥 개수 차감

            queue.add(arr[i]);
            if (visited[arr[i]] == 0) cnt++; // 먹은 스시 증가

            visited[arr[i]]++;
            if (cnt > result) result = cnt;
        }

        System.out.println(result);
    }
}
