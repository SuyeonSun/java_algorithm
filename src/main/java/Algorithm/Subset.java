package Algorithm;

public class Subset {
    public static void main(String[] args) {
        // 2
        // 1 2
        int N = 2;
        int[] arr = {1, 2};
        boolean[] isSelected = new boolean[N];
        generateSubset(0, N, arr, isSelected);
    }

    public static void generateSubset(int cnt, int N, int[] arr, boolean[] isSelected) {
        if (cnt == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(isSelected[i] ? arr[i] : "X");
            }
            System.out.println();
            return;
        }

        isSelected[cnt] = true;
        generateSubset(cnt+1, N, arr, isSelected);
        isSelected[cnt] = false;
        generateSubset(cnt+1, N, arr, isSelected);
    }
}
