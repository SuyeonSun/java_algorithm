package Others;

public class EqualsPractice {
    public static void main (String[] args) {
        String str = "java";
        System.out.println(str.charAt(0) == 'j');
        // System.out.println(str.charAt(0) == "j"); // Operator '==' cannot be applied to 'char', 'java.lang.String'

        // == 연산자는 주소값 비교
        // String class의 equals 메소드는 값 자체 비교
        String str1 = "string";
        String str2 = new String("string");
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

    }
}
