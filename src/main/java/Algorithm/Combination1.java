package Algorithm;

public class Combination1 {
    static int[] arr = new int[]{1, 2, 3};
    static int r = 2;
    static int[] numbers = new int[r];

    public static void combination (int cnt, int start) {
        if (cnt == r) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
            }
            System.out.println();
            return;
        }

        for (int i = start; i < arr.length; i++) {
            numbers[cnt] = arr[i];
            combination(cnt+1, i+1);
        }
    }

    public static void main (String[] args) {
        combination(0, 0);
    }
}
