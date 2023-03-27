package SW_Expert_Academy.D1;

public class N2071 {
    public static void main(String[] args) {
        // Math.round()
        double num1 = 111.12345;
        System.out.println(Math.round(num1));
        double num2 = 111.9;
        System.out.println(Math.round(num2));
        System.out.println(Math.round(num1 * 100) / 100.0);

        // String.format()
        String num3 = String.format("%.1f", num1);
        String num4 = String.format("%.2f", num1);
        System.out.println(num3);

        // substring
        String num5 = "12.12345";
        int idx = num5.indexOf(".");
        String num5Temp1 = num5.substring(0, idx);
        String num5Temp2 = num5.substring(idx+1, idx+3);
        System.out.println(num5Temp1+"."+num5Temp2);

        String str1 = "123";
        // string to int
        Integer num6 = Integer.parseInt(str1);
        // int to string
        String str2 = Integer.toString(num6);
        System.out.println(num6.getClass().getSimpleName());
        System.out.println(str2.getClass().getSimpleName());
    }
}
