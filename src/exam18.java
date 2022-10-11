import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class exam18 {
    public static int[] solution(int[][] score) {
        int[] temps = new int[score.length];
        int index = 0;

        for (int i[] : score) {
            temps[index] = i[0]+i[1];
            index++;
        }
        temps = Arrays.stream(temps).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int[] Count = new int[201];
        int count = 1;
        Count[temps[0]] = count++;

        for (int i = 1; i < temps.length; i++) {
            if (temps[i] != temps[i - 1]) {
                Count[temps[i]] = count;
                count++;
            } else {
                Count[temps[i]] = Count[temps[i - 1]];
                count++;
            }
        }
        int[] answer = new int[score.length];
        int index2 = 0;
        for (int[] i : score) {
            answer[index2] = Count[i[0] + i[1]];
            System.out.println("answer[index2] = " + answer[index2]);
            index2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        solution(score);
    }
}
