import java.util.*;
import java.util.stream.Stream;

public class DataStructure {
    public static void solution() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
        System.out.println(stack.contains(1));
        stack.pop();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        queue.clear();
        System.out.println(queue.poll());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        pq.add(2);
        System.out.println("pq = " + pq);

        int numbers[] = {1,2};
        Arrays.sort(numbers);
        Arrays.sort(new int[][]{numbers},Collections.reverseOrder());
        Integer []number = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(number, Collections.reverseOrder());
        Double num = 3.14;
        
    }

    public static void main(String[] args) {
        solution();
    }
}
