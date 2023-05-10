package Others;

public class IfContinuePractice {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue; // 짝수일 경우 continue가 실행되어 println 실행 안함.
            System.out.println(i);
        }
        System.out.println("for문 종료");
    }
}
