package Others;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(21);
        pq.add(2);
        pq.add(3);
        pq.add(0);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        pq.remove(3);
        System.out.println(pq);

        System.out.println(pq.peek()); // 우선순위가 가장 높은 것 출력
    }
}
