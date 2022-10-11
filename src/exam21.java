import java.util.*;
public class exam21 {
    public static int solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 1; i <= 500; i++) {
            list.add(i);
        }

        List<Integer> tempList = new ArrayList<>(list);
        for (Integer i : tempList) {
            int temp = i;
            if(i%3==0)
            {
                list.remove(Integer.valueOf(temp));
                continue;
            }

            while (temp != 0) {
                if (temp % 10 == 3) {
                    list.remove(Integer.valueOf(i));
                    break;
                } else {
                    temp /= 10;
                }
            }
        }
        int answer = list.get(n-1);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2));

    }
}
