package Others;

import java.util.ArrayList;
import java.util.List;

public class RecursivePractice {
    static int cnt;

    public static void main (String[] args) {
        // int cnt = 0;
        cnt = 0;
        recursive();
        System.out.println(cnt);
    }

    // public static void recursive (int cnt) {
    public static void recursive () {
        if (cnt == 3) return;
        cnt++;
        recursive();
    }
}
