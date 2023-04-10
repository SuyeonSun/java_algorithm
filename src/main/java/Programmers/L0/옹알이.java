package Programmers.L0;

public class 옹알이 {
    public static void main(String[] args) {
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

        // replaceFirst() 예제 풀이1
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

        // replaceFirst() 예제 풀이2
        answer = 0;
        for (int i=0; i<babblingInput.length; i++) {
            babblingInput[i] = babblingInput[i].replace("aya", "1");
            babblingInput[i] = babblingInput[i].replace("woo", "1");
            babblingInput[i] = babblingInput[i].replace("ye", "1");
            babblingInput[i] = babblingInput[i].replace("ma", "1");
            babblingInput[i] = babblingInput[i].replace("1", "");
            if (babblingInput[i].isEmpty()) {
                answer ++;
            }
        }
        System.out.println(answer);
    }
}
