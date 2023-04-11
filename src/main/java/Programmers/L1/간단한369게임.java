package Programmers.L1;

public class 간단한369게임 {
    public static void main(String[] args) {
        String str = "30";
        System.out.println(str.contains("3"));

        if (str.contains("3")) {
            str = str.replace("0", "");
        }
        System.out.println(str);
    }
}
