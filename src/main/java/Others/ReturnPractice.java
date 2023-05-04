package Others;

public class ReturnPractice {
    public static void main(String[] args) {
        int i = 0;

        while(true) {
            i++;
            System.out.println("i: " + i);
            if (i == 3) {
                break;
            }
        }
        System.out.println("break while문");

        if (i == 3) {
            System.out.println("i is 3");
            return;
        }
        System.out.println("return"); // break는 해당 문을 종료시키지만, return문은 해당 메서드가 호출된 곳까지 종료시킨다.
    }
}