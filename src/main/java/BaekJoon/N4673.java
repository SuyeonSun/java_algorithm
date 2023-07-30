package BaekJoon;

public class N4673 {
    public static void main (String[] args) {
        boolean[] arr = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            int num = d(i);
            if (num <= 10000) {
                arr[num] = true;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }
    }

    public static int d(int i) {
        int selfN = i;
        while (i != 0) {
            selfN += i % 10;
            i /= 10;
        }
        return selfN;
    }
}
