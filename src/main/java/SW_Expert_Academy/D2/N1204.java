package SW_Expert_Academy.D2;

import java.util.Scanner;

public class N1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCaseNum = sc.nextInt();
        for (int i=0; i<testCaseNum; i++) {
            int currentTestCaseNum = sc.nextInt();
            int[] scoreList = new int[101]; // 0~100 -> 101칸 필요
            int maxCount = 0;
            for (int j=0; j<1000; j++) {
                int score = sc.nextInt();
                scoreList[score]++;
                if (scoreList[score] > maxCount) maxCount = scoreList[score];
            }
            int maxNum = 0;
            for (int z=0; z<101; z++) {
                // if continue -> if 조건에 해당하지 않으면 continue문 실행
                // if (scoreList[z] != maxCount) continue;
                // maxNum = z;
                if (scoreList[z] == maxCount) {
                    maxNum = z;
                }
            }
            System.out.format("#%d %d\n", currentTestCaseNum, maxNum);
        }
    }
}
