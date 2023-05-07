package Others;

public class dfsPractice {
    // 그래프 연결 상태
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    // 방문 처리에 사용할 배열
    static boolean[] visited = new boolean[9];

    public static void main (String[] args) {
        dfs(1);
    }

    static void dfs(int nodeIndex) {
        // 방문 처리
        visited[nodeIndex] = true;

        // 방문 노드 출력
        System.out.println(nodeIndex + " -> ");

        // 방문한 노드에 인접한 노드 찾기
        for (int node: graph[nodeIndex]) {
            if (!visited[node]) {
                dfs(node);
            }
        }
    }
}
