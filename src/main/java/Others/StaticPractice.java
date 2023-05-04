package Others;

class Number {
    static int num1 = 0; // static 변수
    int num2 = 0; // 인스턴스 변수
}

class Hey {
    static void print() {
        System.out.println("static print");
    }

    void print2() {
        System.out.println("print2");
    }
}

public class StaticPractice {
    public static void main(String[] args) {
        Number number1 = new Number();
        Number number2 = new Number();

        number1.num1++;
        number1.num2++;

        System.out.println("number1.num1: " + number1.num1); // 1
        System.out.println("number1.num2: " + number1.num2); // 1

        System.out.println("number2.num1: " + number2.num1); // 1
        System.out.println("number2.num2: " + number2.num2); // 0
        // 인스턴스 변수는 인스턴스가 생성될 때마다 생성되기 때문에 인스턴스마다 다른 값을 가지지만,
        // 정적 변수는 모든 인스턴스가 하나의 저장공간을 공유하기에 항상 같은 값을 가짐.


        Hey.print(); // 인스턴스를 생성하지 않아도 호출 가능
        Hey hey = new Hey();
        hey.print2(); // 인스턴스를 생성해야 호출 가능
        // 정적 메소드는 클래스가 메모리에 올라갈 때 자동 생성
        // 따라서, 정적 메소드는 인스턴스를 생성하지 않아도 호출 가

        // static을 사용하는 이유?
        // static이 붙지 않는 변수나 메소드의 경우, 객체가 생성될 때마다 호출되어 서로 다른 값을 가지고 있을 수 있다.
        // 각 객체들 사이에서 공통적으로 값이 유지되어야 할 경우, static을 유용하게 사용 가능.
    }
}
