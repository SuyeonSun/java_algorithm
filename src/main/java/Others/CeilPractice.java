package Others;

public class CeilPractice {
    static public void main (String[] args) {
        double num1 = 10.0;
        double num2 = 10.2;
        double num3 = 10.9;

        System.out.println(Math.ceil(num1));
        System.out.println(Math.ceil(num2));
        System.out.println(Math.ceil(num3));

        double resultD = num1;
        int resultI = (int) num1; // 형변환
        System.out.println(resultI);
    }
}
