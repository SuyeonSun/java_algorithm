package Programmers_L0;

public class 옹알이 {
    public static void main(String[] args) {
        // 몰랐던 개념
        String replaceTest = "리플레이스 테스트 리플레이스";

        // replace()
        String result1 = replaceTest.replace("리플레이스", "replace");
        System.out.println(result1);

        // replaceAll()
        String result2 = replaceTest.replaceAll("리플레이스", "replace");
        System.out.println(result2);

        // replaceAll은 정규식을 사용 가능하다는 차이점

        // replaceFirst()
        String result3 = replaceTest.replaceFirst("리플레이스", "replace");
        System.out.println(result3);

        // replaceFirst() 예제
        String[] babblingInput = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] babblingArr = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (String bab: babblingInput) {
            for (String str: babblingArr) {
                // ""으로 replace 하면 안되는 이유는 wyeoo 에서 ye를 제거하면 woo가 되어버리기 때문에
                bab = bab.replaceFirst(str, " ");
            }
            if ("" == bab.replace(" ", "")) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
