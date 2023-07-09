package Others;

public class ClassInstanceVariable {
    static int staticV = 10;
    int instanceV = 10;

    public static void main (String[] args) {
        ClassInstanceVariable variable1 = new ClassInstanceVariable();
        ClassInstanceVariable variable2 = new ClassInstanceVariable();

        System.out.println("1. " + variable1.staticV + " " + variable1.instanceV);
        System.out.println("2. " + variable2.staticV + " " + variable2.instanceV);

        variable1.staticV = 100;
        variable1.instanceV = 1000;

        System.out.println("1. " + variable1.staticV + " " + variable1.instanceV);
        System.out.println("2. " + variable2.staticV + " " + variable2.instanceV);
    }
}
