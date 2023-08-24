package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class B2252 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[] inDegree = new int[N+1];
        ArrayList<Integer>[] list = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            String[] input = in.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            list[x].add(y);
            inDegree[y]++;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=1; i<=N; i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            int current = queue.poll();

            //자신이 가르키고 있는 좌표들을 방문하여 indegree값을 -1 해주고 만약 0이라면 큐에 넣어준다.
            for(int i=0; i<list[current].size(); i++){
                int next = list[current].get(i);
                inDegree[next]--;
                if(inDegree[next]==0){
                    queue.add(next);
                }
            }
        }
    }
}
