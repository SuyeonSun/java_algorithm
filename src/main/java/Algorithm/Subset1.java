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

public class Subset1 {
    public static void main(String[] args) {
        int N = 3;
        int[] arr = {1, 2, 3};
        boolean[] isSelected = new boolean[N];
        generateSubset(0, N, arr, isSelected);
    }

    // TODO: isSelected 배열은 계속 새롭게 생기는 것인가?
    public static void generateSubset(int depth, int N, int[] arr, boolean[] isSelected) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                if (isSelected[i]) {
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
            return;
        }

        isSelected[depth] = true;
        generateSubset(depth+1, N, arr, isSelected);
        isSelected[depth] = false;
        generateSubset(depth+1, N, arr, isSelected);
    }
}
