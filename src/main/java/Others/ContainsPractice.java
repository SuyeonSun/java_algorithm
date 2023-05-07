package Others;

import java.util.Arrays;

public class ContainsPractice {
    public static void main(String[] args) {
        // ===== 1. contains =====
        String str = "369";
        System.out.println(str.contains("6"));
        str = str.replace("3", "");
        System.out.println(str);

        // ===== 2. str.substring(i, i+length) =====
        // startIndex부터 끝까지 문자열 return
        // length 만큼 출력
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

        // ===== 8. toCharArray() =====

        // ===== 9. Integer.parseInt(num) =====
        String t = "3141592";
        for (int i = 0; i < t.length() - 3 + 1; i++) {
            int num = Integer.parseInt(t.substring(i, i + 3));
        }

        // ===== 9. Integer.toString(num) =====
        int number = 3;
        String string = Integer.toString(number);

        // ===== 10. 배열의 최대, 최소 값 =====
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(arr2);

        // ===== 11. =====
        int[] arr3 = {1, 3, 5, 7, 9};
        int min = 999;
        int max = -1;
        for (int i : arr3) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        System.out.println(min + " " + max);
    }
}