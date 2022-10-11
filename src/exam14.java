import java.util.*;
import java.util.stream.Collectors;

public class exam14 {
    public static int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            list.add(i);
        }

        list = list.stream().sorted(Collections.reverseOrder()).sorted(Comparator.comparingInt(a -> Math.abs(a - n))).collect(Collectors.toList());

        int[] answer = new int[list.size()];
        int index =0;
        for (Integer integer : list) {
            answer[index] = integer;
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numlist = {10000, 20, 36, 47, 40, 6, 10, 7000};
        int n =30;
        System.out.println(solution(numlist, n));
    }
}
