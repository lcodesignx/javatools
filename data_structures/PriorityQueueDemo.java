// Program implements priority queue
import java.util.*;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> q1 = new PriorityQueue<>();
        q1.offer("Oklahoma");
        q1.offer("Indiana");
        q1.offer("Georgia");
        q1.offer("Texas");

        System.out.println("Priority queue using comparable");
        while (q1.size() > 0) {
            System.out.print(q1.remove() + " ");
        }

	System.out.println();
        
        PriorityQueue<String> q2 = new PriorityQueue(4, Collections.reverseOrder());
        q2.offer("Oklahoma");
        q2.offer("Indiana");
        q2.offer("Georgia");
        q2.offer("Texas");

        System.out.println("\nPriority queue using comparator");
        while (q2.size() > 0) {
            System.out.print(q2.remove() + " ");
        }
    }
}
