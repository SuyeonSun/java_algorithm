package Others;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        System.out.println(al);

        al.set(0, "A");
        System.out.println(al);

        al.remove(0);
        System.out.println(al);

        System.out.println(al.size());

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println(al.contains("a")); // ArrayList 값 검색하기
    }
}
