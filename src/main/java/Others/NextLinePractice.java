package Others;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 공백 전까지의 단어 읽기
        // String str1 = scanner.next();
        // System.out.println("=== str1: " + str1);

        // 엔터 전까지의 단어 읽기
        String str2 = scanner.nextLine();
        System.out.println("=== str2: " + str2);
    }
}
