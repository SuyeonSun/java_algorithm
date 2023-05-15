package Others;

public class 소수Practice1 {
    public static void main (String[] args) {
        boolean check = true;

        // n이 소수인가 아닌가
        int n = 12;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }

        System.out.println(check);
    }
}
