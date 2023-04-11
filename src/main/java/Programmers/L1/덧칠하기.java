package Programmers.L1;

public class 덧칠하기 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        int answer = 0;
        int max = 0;

        for (int i = 0; i < section.length; i++) {
            if (section[i] < max) {
                continue;
            }
            answer += 1;
            max = section[i] + m;
        }
    }
}
