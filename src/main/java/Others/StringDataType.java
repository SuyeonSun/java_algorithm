package Others;

public class StringDataType {
    public static void main (String[] args) {
        int total = 0;
        int i = 0;
        while (++i <= 10) {
            if (i % 2 == 0) continue;
            total += i;
        }
        System.out.println(total);

    }
}
