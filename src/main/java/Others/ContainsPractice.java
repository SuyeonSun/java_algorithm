package Others;

import java.util.Arrays;

public class ContainsPractice {
    public static void main(String[] args) {
        // ===== 1. contains =====
        String str = "369";
        System.out.println(str.contains("6"));
        str = str.replace("3", "");
        System.out.println(str);

        // ===== 2. substring =====
        // startIndex부터 끝까지 문자열 return
        String str2 = "abc";
        // str2 = str2.substring(0, 2);
        // str2 = str2.substring(1, 2);
        str2 = str2.substring(1);
        System.out.println(str2);

        // ===== 3. 달팽이 =====

        // ===== 3. 파리문제 =====

        // ===== 4. 이중 for문 break: 안쪽의 반복문만 빠져나옴 =====
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 2) {
                    break;
                }
                System.out.println("===" + i + " " + j);
            }
        }

        // ===== 5. if, continue =====

        // ===== 6. Arrays.sort(arr) =====
        int[] arr = {10, 3, 6, 1, 3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        // ===== 7. =====
        String[] park = {"SOO","OOO","OOO"};
        char[][] array = new char[park.length][park[0].length()];
        array[0] = park[0].toCharArray();
        System.out.println(array[0]);
        System.out.println(array[0][0]);
    }
}