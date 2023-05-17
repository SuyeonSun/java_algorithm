package Algorithm;

// 입력값
// 3
// 1 2 3

// 출력값
// 123
// 12
// 13
// 1
// 23
// 2
// 3

public class Subset {
    public static void main(String[] args) {
        int N = 3;
        int[] arr = {1, 2, 3};
        boolean[] isSelected = new boolean[N];
        generateSubset(0, N, arr, isSelected);
    }

    public static void generateSubset(int cnt, int N, int[] arr, boolean[] isSelected) {
        if (cnt == N) {
            for (int i = 0; i < N; i++) {
                if (isSelected[i]) {
                    System.out.print(arr[i]);
                }
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
