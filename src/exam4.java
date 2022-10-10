import java.util.*;
import java.util.stream.Collectors;

public class exam4 {
    public static long solution(String numbers) {
        String strnum[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String numstr[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i =0;i<=9;i++)
        {
            numbers = numbers.replace(strnum[i],numstr[i]);
        }
        long answer = Long.valueOf(numbers);
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = list.stream().distinct().map(i -> i).collect(Collectors.toList());
        return answer;
    }

    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        System.out.println(solution(numbers));
    }
}
