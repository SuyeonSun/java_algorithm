package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1244_스위키켜고끄기_선수연 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int switchCnt = Integer.parseInt(in.readLine());
        String[] switchStatusArr = new String[switchCnt];
        switchStatusArr = in.readLine().split(" ");
        int studentCnt = Integer.parseInt(in.readLine());

        for(int i = 0; i < studentCnt; i++) {
            String[] input = in.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int switchNum = Integer.parseInt(input[1]);

            // 남학생
            if (s == 1) {
                for (int c = 0; c < switchCnt; c++) {
                    if ((c+1) % switchNum == 0) {
                        if (Integer.parseInt(switchStatusArr[c]) == 0) {
                            switchStatusArr[c] = String.valueOf(1);
                        }
                        else {
                            switchStatusArr[c] = String.valueOf(0);
                        }
                    }
                }
            } else { // 여학생
                if (Integer.parseInt(switchStatusArr[switchNum-1]) == 0) {
                    switchStatusArr[switchNum-1] = String.valueOf(1);
                }
                else {
                    switchStatusArr[switchNum-1] = String.valueOf(0);
                }

                int cnt = 1;
                while (true) {
                    if (switchNum - 1 - cnt >= 0 &&  switchNum - 1 + cnt < switchCnt) {
                         if (!switchStatusArr[switchNum - 1 - cnt].equals(switchStatusArr[switchNum - 1 + cnt])) break;
                        else {
                            if (Integer.parseInt(switchStatusArr[switchNum - 1 - cnt]) == 0) {
                                switchStatusArr[switchNum - 1 - cnt] = String.valueOf(1);
                                switchStatusArr[switchNum - 1 + cnt] = String.valueOf(1);
                            } else {
                                switchStatusArr[switchNum - 1 - cnt] = String.valueOf(0);
                                switchStatusArr[switchNum - 1 + cnt] = String.valueOf(0);
                            }
                            cnt++;
                        }
                    } else break;
                }
            }


        }

        for (int i = 0; i < switchCnt; i++) {
            System.out.print(switchStatusArr[i] + " ");
            if ((i+1) % 20 == 0) System.out.println();
        }
    }
}
