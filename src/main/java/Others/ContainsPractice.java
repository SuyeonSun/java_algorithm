package Others;

public class ContainsPractice {
    public static void main(String[] args) {
        // ===== 1. contains =====
        String str = "369";
        System.out.println(str.contains("6"));
        str = str.replace("3", "");
        System.out.println(str);

        // ===== 2. substring =====
        // startIndex부터 끝까지 문자열 return
        String str2 = "abc";
        // str2 = str2.substring(0, 2);
        // str2 = str2.substring(1, 2);
        str2 = str2.substring(1);
        System.out.println(str2);

        // ===== 3. 달팽이 =====

        // ===== 3. 파리문제 =====
    }
}