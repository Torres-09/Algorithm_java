import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MethodTest {

    class Solution {
        public String[] solution(String my_str, int n) {
            List<String> list = new ArrayList<>();
            for(int i =0;i<my_str.length();i+=n)
            {
                if(i+n>=my_str.length())
                {
                    list.add(my_str.substring(i));
                    break;
                }

                list.add(my_str.substring(i,i+n));
            }

            String[] answer = list.toArray(new String[list.size()]);
            return answer;
        }
    }
    public static void solution() {
        Scanner scanner = new Scanner(System.in);

        int num = 123;
        System.out.println(String.valueOf(num).indexOf("2"));
        String str = "123";
        str = str.replace('1','a');
        System.out.println("str = " + str);

        System.out.println(str.toCharArray());
        int []array = {1,2};

        String str1 = "affs141";
        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        chars.equals(chars);

        boolean dp[] = new boolean[10];
        for(boolean i : dp)
            System.out.println(i);
        StringBuilder sb = new StringBuilder(str1);
        System.out.println(sb.toString());
        String my_string = "12345afa";
        List<String> list = Stream.of(my_string.split("")).collect(Collectors.toList());
        String[] strings = list.toArray(new String[list.size()]);



        List<String> newList = list.stream().distinct().collect(Collectors.toList());
        String answer = "";
        for (String i : newList) {
            answer += i;
        }
        String.join("", newList);
        Arrays.sort(chars);
        Arrays.stream(array).map(i -> Math.abs(i)).toArray();

        int n =6;
        int arr[][] = new int[5][n];
        Deque<Integer> deque = new ArrayDeque<>();
        int[] ints = deque.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        solution();
    }
}