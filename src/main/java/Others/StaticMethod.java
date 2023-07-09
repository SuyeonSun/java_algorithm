package Others;

public class StaticMethod {
    public void cal (int num) {
        num*=2;
    }

    public static void main (String[] args) {
        int num = 10;
        StaticMethod method = new StaticMethod();
        method.cal(num);
    }
}
