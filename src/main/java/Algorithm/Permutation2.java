package Algorithm;

// 중복 순열
public class Permutation2 {
    public static void main (String[] args) {
        int[] arr = {1, 2};
        int r = 2;
        int[] result = new int[r];

        permutation(arr, result, 0, r);
    }

    public static void permutation(int[] arr, int[] result, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(result[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
                result[depth] = arr[i];
                permutation(arr, result, depth+1, r);
        }
    }
}
