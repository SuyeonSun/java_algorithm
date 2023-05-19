package Others;

public class ReferencePractice {
    public static void main (String[] args) {
        int[] arr1 = {1};
        int[] arr2;
        arr2 = arr1;
        System.out.println(arr1 == arr2);
        arr1[0] = 100;
        System.out.println(arr2[0]);
    }
}
