package Algorithm;

/*
{1, 2, 3}
1, 1
1, 2
1, 3
2, 1
2, 2
2, 3
3, 1
3, 2
3, 3
*/

public class Permutation2 {
    static int[] arr = new int[]{1, 2, 3};
    static int r = 2;
    static int[] numbers = new int[r];

    public static void permutation (int cnt) {
        if (cnt == r) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            numbers[cnt] = arr[i];
            permutation(cnt+1);
        }

    }

    public static void main (String[] args) {
        permutation(0);
    }
}
