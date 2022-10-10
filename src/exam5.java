import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class exam5 {

    public static int solution(String[] spell, String[] dic) {
        int answer = 2;


        for(String s : dic){

            if(s.length()!= spell.length)
                continue;

            for(String str : spell){
                if(!s.contains(str))
                    break;

                if(str.equals(spell[spell.length-1]))
                    answer = 1;
            }
        }

        List<Integer> list = new ArrayList<>();
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());

        return answer;
    }

    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell, dic));
    }
}
