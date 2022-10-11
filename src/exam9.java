import java.util.*;
public class exam9 {
    public static int solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]"," ");
        my_string = my_string.replaceAll("[A-Z]", " ");
        String[] s = my_string.split(" ");
        int answer = 0;
        for (String str : s) {
            if(str.equals(" ")||str.isBlank())
                continue;

            answer += Integer.valueOf(str);
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        solution(my_string);
    }
}
