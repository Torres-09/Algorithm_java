import java.util.*;
public class exam24 {


    public static int solution(int[] priorities, int location) {
        class Pair{
            int x,y;
            Pair(int x,int y){
                this.x = x;
                this.y = y;
            }
        }
        Queue<Pair> q = new LinkedList<>();
        List <Integer> list = new ArrayList<>();
        for(int i =0;i<priorities.length;i++){
            q.add(new Pair(priorities[i],i));
            list.add(priorities[i]);
        }
        Collections.sort(list,Collections.reverseOrder());
        int Count = 0;
        int answer = 0;

        while(!q.isEmpty()){
            Pair pair = q.peek();
            if(pair.x == list.get(0)){
                Count++;
                list.remove(0);
                if(pair.y == location){
                    answer = Count;
                }
                q.poll();
            }else{
                q.add(q.poll());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 9, 1, 1, 1};
        System.out.println(solution(a,0));
    }
}
