package SW_Expert_Academy.D1;

import java.util.ArrayList;
import java.util.Arrays;

public class N2058 {
    public static void main(String[] args) {
        // 오름차순 정렬
        int[] intArr1 = {3, 4, 71, 1, 2};
        Arrays.sort(intArr1);
        System.out.println(Arrays.toString(intArr1));

        // 동적 배열
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add(0, "first string");
        String strArrFirstIndexVal = strArr.get(0);
        int strArrSize = strArr.size();
        strArr.remove(0);

        // charAt
        String str = "Hello World";
        System.out.println(str.charAt(0));
    }
}
