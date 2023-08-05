package Algorithm;

import java.util.Stack;

public class Dfs {
    static boolean[] visited = new boolean[8];
    static int[][] arr = {{2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static Stack<Integer> stack = new Stack<>();

    public static void main (String[] args) {
        // 시작
        stack.push(1);
        visited[1] = true;

        while (!stack.isEmpty()) {
            int nodeIndex = stack.pop();
            System.out.println(nodeIndex + " ->");

            for (int linkedNode : arr[nodeIndex]) {
                if (!visited[linkedNode]) {
                    stack.push(linkedNode);
                    visited[linkedNode] = true;
                }
            }
        }
    }
}
