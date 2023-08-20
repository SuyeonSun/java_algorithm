package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B2023 {
    public static boolean isPrime(int n) {
        for (int i = 2; i*i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int[] nextN = new int[] {1, 3, 7, 9};
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(2, 3, 5, 7));

        while(!queue.isEmpty() && queue.peek().toString().length() < N) {
            int num = queue.poll();
            for (int z = 0; z < nextN.length; z++) {
                int nxtNum = num*10 + nextN[z];
                if (isPrime(nxtNum)) queue.add(nxtNum);
            }
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}