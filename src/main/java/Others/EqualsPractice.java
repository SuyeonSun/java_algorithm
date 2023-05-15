package Others;

public class EqualsPractice {
    public static void main (String[] args) {
        String str = "java";
        System.out.println(str.charAt(0) == 'j');
        // System.out.println(str.charAt(0) == "j"); // Operator '==' cannot be applied to 'char', 'java.lang.String'
    }
}
