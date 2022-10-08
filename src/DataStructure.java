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
        Arrays.stream(numbers).map(i -> i *= 2).toArray();
        Map.Entry<Integer,Integer> entry;

        String my_string = "aAb1B2cC34oOp";
        int answer =0;
        for(int i =0;i<my_string.length();i++)
        {
            if(my_string.charAt(i) <= '9' && my_string.charAt(i) >= '1')
                answer += Character.getNumericValue(my_string.charAt(i));
        }
        System.out.println("answer = " + answer);
        StringBuilder sb = new StringBuilder();
        

    }

    public static void main(String[] args) {
        solution();
    }
}
