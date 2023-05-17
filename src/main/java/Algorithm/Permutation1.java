package Algorithm;

public class Permutation1 {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3};
        boolean[] visited = new boolean[arr.length];
        int[] result = new int[arr.length];

        permutation(arr, visited, result, 0, 2);
    }

    public static void permutation(int[] arr, boolean[] visited, int[] result, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(result[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                permutation(arr, visited, result, depth+1, r);
                visited[i] = false;
            }
        }
    }
}
