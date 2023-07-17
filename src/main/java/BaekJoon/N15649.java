package BaekJoon;
import java.util.*;

public class N15649 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            String input = sc.nextLine();

            if (input.contains("push")) {
                String[] arr = input.split(" ");
                stack.push(Integer.parseInt(arr[1]));
            }

            if (input.contains("pop")) {
                if (stack.size() == 0) System.out.println(-1);
                else {
                    System.out.println(stack.peek());
                    stack.pop();
                }
            }

            if (input.contains("size")) {
                System.out.println(stack.size());
            }

            if (input.contains("empty")) {
                if (stack.size() == 0) System.out.println(1);
                else System.out.println(0);
            }

            if (input.contains("top")) {
                if (stack.size() == 0) System.out.println(-1);
                else System.out.println(stack.peek());
            }
        }

    }
}
