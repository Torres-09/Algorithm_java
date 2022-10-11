public class exam13 {
    public static int solution(int chicken) {
        int answer = 0;
        int cou = chicken;
        int temp = 0;
        while (cou >= 10) {
            temp = cou/10;
            cou %= 10;
            cou += temp;
            answer += temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1081));
    }
}
