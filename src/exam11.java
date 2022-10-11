import java.util.*;
public class exam11 {

    public static int solution(int a, int b) {
        List<Integer> a_list = new ArrayList<>();
        List<Integer> b_list = new ArrayList<>();
        for (int i = 2; a != 1; ) {

            if (a % i == 0) {
                a_list.add(i);
                a /= i;
            } else {
                i++;
            }

        }
        for (int i = 2; b != 1; ) {

            if (b % i == 0) {
                b_list.add(i);
                b /= i;
            } else {
                i++;
            }

        }
        for (Integer integer : a_list) {
            b_list.remove(integer);
        }
        b_list.removeIf(i -> i == 2 || i == 5);

        int answer = 0;
        if(b_list.isEmpty())
            answer = 1;
        else
            answer = 2;

        return answer;
    }

    public static void main(String[] args) {
        int a = 12,b = 21;

        System.out.println(solution(a, b));
    }
}
