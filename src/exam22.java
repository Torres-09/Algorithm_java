import java.util.*;
public class exam22 {
    public static int[] solution(int num, int total) {
        List<Integer> list = new ArrayList<>();
        for (int i = -1000; i <= 1000; i++) {
            list.add(i);
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < list.size() - num - 1; i++) {
            int temp = 0;
            for (int j = i; j < i+num; j++) {
                temp += list.get(j);
            }

            if (temp == total) {
                for (int k = 0; k < num; k++) {
                    answer.add(list.get(i));
                    i++;
                }
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        solution(3, 12);
    }
}
