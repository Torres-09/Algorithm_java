import java.util.*;


public class exam7 {
    public static int solution(String s) {
        String[] strings = s.split(" ");
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        for (String i : strings) {
            if (!i.equals("Z")) {
                list.add(Integer.parseInt(i));
            }else {
                list.remove(list.size() - 1);

            }
        }

        for (Integer integer : list) {
            answer += integer;
        }
        LinkedList<Integer> list1 = new LinkedList<>();

        return answer;
    }

    public static void main(String[] args) {
        String s = "10 Z 20 Z 1";
        System.out.println(solution(s));
    }
}
