package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B16113_2 {
    static String[][] arr;

    static String zero = "####.##.##.####";
    static String two = "###..#####..###";
    static String three = "###..####..####";
    static String four = "#.##.####..#..#";
    static String five = "####..###..####";
    static String six = "####..####.####";
    static String seven = "###..#..#..#..#";
    static String eight = "####.#####.####";
    static String nine = "####.####..####";

    public static String cal(int p) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            for (int j = p; j < p + 3; j++) {
                sb.append(arr[i][j]);
            }
        }

        // TODO: sb.toString() 한 후 비교
        if (sb.toString().equals(zero)) return "0";
        else if (sb.toString().equals(two)) return "2";
        else if (sb.toString().equals(three)) return "3";
        else if (sb.toString().equals(four)) return "4";
        else if (sb.toString().equals(five)) return "5";
        else if (sb.toString().equals(six)) return "6";
        else if (sb.toString().equals(seven)) return "7";
        else if (sb.toString().equals(eight)) return "8";
        else if (sb.toString().equals(nine)) return "9";
        return "X";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        String str = in.readLine();
        int w = N / 5;
        arr = new String[5][w];
        int idx = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < w; j++) {
                arr[i][j] = Character.toString(str.charAt(idx++));
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        StringBuilder sb = new StringBuilder();
        int p = 0;
        while(p < w) {
            // 숫자가 있다면
            if (arr[0][p].equals("#")) {
                if (arr[1][p].equals("#") && arr[2][p].equals("#") && arr[3][p].equals("#") && arr[4][p].equals("#")) {
                    if (p+1 == w-1) { // 1
                        sb.append("1");
                        return;
                    }
                    else if (((p+1 < w-1 && arr[0][p+1].equals(".")))) { // 1
                        sb.append("1");
                        p += 2;
                    }
                    // 0 6 8
//                    else if (p+2 < w-2){
//                        sb.append(cal(p));
//                        p += 4;
//                    }
                    else {
                        sb.append(cal(p));
                        p += 4;
                    }
                }
                // 2 3 4 5 7
                else {
                    sb.append(cal(p));
                    p += 4;

                }
            }
            // 숫자가 없다면
            else {
                p+=1;
            }
        }
        System.out.println(sb);
    }
}
