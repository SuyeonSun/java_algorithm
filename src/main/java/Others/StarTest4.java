package Others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarTest4 {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
