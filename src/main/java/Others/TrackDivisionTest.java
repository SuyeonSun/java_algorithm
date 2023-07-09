package Others;

public class TrackDivisionTest {
    public static class TestClass {
        public static void print() {
            System.out.println("print me!");
        }
    }

    public static void main (String[] args) {
        // 1
        int k = 10;
        if (++k > 10) {
            System.out.println("증가 후 대입");
        } else {
            System.out.println("대입 후 증가");
        }

        // 2
        int g1 = 0;
        System.out.println(g1++);
        int g2 = 0;
        System.out.println(++g2);

        // 3
        TestClass tc = new TestClass();
        System.out.println(tc); // 출력 결과

        // 4
        // 클래스에서 클래스 호출하기
    }
}
