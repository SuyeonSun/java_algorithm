package Others;

public class Main {

    public static void main(String[] args) {
        int[] arr4 = {1, 2, 3};
        int[] arr5 = arr4;
        arr4[0] = 0;
        System.out.println(arr5[0]);
    }
}