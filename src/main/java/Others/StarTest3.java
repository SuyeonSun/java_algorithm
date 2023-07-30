package Others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarTest3 {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
