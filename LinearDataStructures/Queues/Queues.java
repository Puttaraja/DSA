package LinearDataStructures.Queues;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.List;
import java.util.stream.Collectors;

public class Queues {

    static Queue<Integer> createQueueFromArrayList(java.util.ArrayList<Integer> arr) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (Integer num : arr) {
            queue.add(num);
        }
        return queue;
    }

    static void performBasicOperationsOnQueue(Queue<Integer> queue) {
        System.out.println("Initial Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue after Poll: " + queue);
        System.out.println("Is Queue empty? " + queue.isEmpty());
        System.out.println("Size of Queue: " + queue.size());
        queue.clear();
        System.out.println("Queue after Clear: " + queue);
    }
    
    static void convertQueueToList(Queue<Integer> queue) {
        List<Integer> list = queue.stream().collect(Collectors.toList());
        System.out.println("Converted List: " + list);
    }

    public static void main(String[] args) {
        System.out.println("Queues in Java");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        Queue<Integer> queue = createQueueFromArrayList(arr);
        System.out.println("Queue: " + queue);
        performBasicOperationsOnQueue(queue);
        queue = createQueueFromArrayList(arr);
        convertQueueToList(queue);
    }
    
}
