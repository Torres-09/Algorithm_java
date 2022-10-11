public class exam15 {
    public static int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        // max가 최대인 경우
        for(int i =1;i<=max;i++)
        {
            if (min + i > max) {
                answer++;
            }
        }
        // i 가 최대인 경우
        for (int i = max+1;; i++) {
            if (i < min + max) {
                answer++;
            }else break;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] sides = {1,2};
        System.out.println(solution(sides));
    }
}
