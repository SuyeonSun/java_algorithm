package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N1920 {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] arr1 = in.readLine().split(" ");
        int m = Integer.parseInt(in.readLine());
        String[] arr2 = in.readLine().split(" ");
        Arrays.sort(arr1); // TODO

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (binarySearch(arr1, Integer.parseInt(arr2[i])) >= 0) {
                sb.append(1 + "\n");
            } else {
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(String[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(target < Integer.parseInt(arr[mid])) {
                high = mid - 1;
            } else if(target > Integer.parseInt(arr[mid])) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
