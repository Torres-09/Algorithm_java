import java.util.*;
public class exam23 {
    public static int[] solution(int[] progresses, int[] speeds) {
        int sz = speeds.length;
        Queue<Integer> s = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        boolean Visited[] = new boolean[sz];
        int result =0;
        int Count[] = new int[sz];
        for(int i =0;i<sz;i++){
            Count[i] = i;
        }

        while(result!= sz){
            for(int i =0;i<sz;i++){
                progresses[i] += speeds[i];

                if(progresses[i]>=100&&Visited[i]==false){
                    s.add(i);
                    Visited[i] = true;
                    for(int j =i+1;j<sz;j++){
                        Count[j]--;
                    }
                }
            }
            int temp =0;
            int reps = s.size();
            while(reps!=0){
                if(Count[s.peek()]<=0){
                    temp++;
                    result++;
                    s.poll();
                }else{
                    s.add(s.peek());
                    s.poll();
                }

                reps--;
            }
            if(temp!=0)
                list.add(temp);
        }

        int answer[] = new int[list.size()];
        for(int i =0;i<list.size();i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {95, 90, 99, 99, 80, 99};
        int[] b = {1, 1, 1, 1, 1, 1};
        int[] solution = solution(a, b);
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
