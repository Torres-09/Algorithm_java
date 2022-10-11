import java.util.*;
public class exam10 {
    public static int solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i : array){
            list.add(i);
        }
        int answer = list.get(0);
        int temp = Collections.frequency(list,list.get(0));
        for(int i:list){

            if(Collections.frequency(list,i) >temp){
                answer = i;
                temp = Collections.frequency(list,i);
            }
            else if(Collections.frequency(list,i) ==temp)
            {
                answer = -1;
                temp = Collections.frequency(list,i);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};
        System.out.println(solution(array));
    }
}
