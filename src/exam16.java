public class exam16 {
    public static int solution(int[][] dots) {
        int garo = dots[0][0];
        int sero = dots[0][1];
        boolean flag[] = new boolean[2];
        for (int[] dot : dots) {
            if (dot[0] != garo && flag[0] == false) {
                flag[0] = true;
                garo -= dot[0];
            }
            if (dot[1] != sero && flag[1] == false) {
                flag[1] = true;
                sero -= dot[1];
            }
        }

        int answer = Math.abs(garo*sero);
        return answer;
    }
}
