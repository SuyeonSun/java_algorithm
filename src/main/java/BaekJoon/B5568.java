package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class B5568 {
    static String[] arr;
    static boolean[] isSelected;
    static int n;
    static int k;
    static String[] numbers;
    static HashSet<Integer> hashSet = new HashSet<>();

    public static void permutation(int cnt) {
        if (cnt == k) {
            String str = "";
            for (int i = 0; i < k; i++) {
                str += numbers[i];
            }
            hashSet.add(Integer.parseInt(str));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!isSelected[i]) {
                isSelected[i] = true;
                numbers[cnt] = arr[i];
                permutation(cnt + 1);
                isSelected[i] = false;
            }
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        isSelected = new boolean[n];
        k = Integer.parseInt(in.readLine());
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.readLine();
        }
        numbers = new String[k];
        permutation(0);
        System.out.println(hashSet.size());
    }
}
